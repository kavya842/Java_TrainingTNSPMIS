
package com.example.coworking.repositary;

import com.example.coworking.mapper.BookingRowMapper;
import com.example.coworking.model.Booking;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.List;

@Repository
public class BookingRepository {

    private final JdbcTemplate jdbcTemplate;

    public BookingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // 1. Get all bookings
    public List<Booking> getAllBookings() {

        String sql = "SELECT * FROM bookings";

        return jdbcTemplate.query(
                sql,
                new BookingRowMapper()
        );
    }

    // 2. Get bookings by user ID
    public List<Booking> getBookingsByUserId(int userId) {

        String sql = "SELECT * FROM bookings WHERE user_id = ?";

        return jdbcTemplate.query(
                sql,
                new BookingRowMapper(),
                userId
        );
    }

    // 3. Get booking by booking ID
    public Booking getBookingById(int bookingId) {

        String sql = "SELECT * FROM bookings WHERE booking_id = ?";

        List<Booking> bookings = jdbcTemplate.query(
                sql,
                new BookingRowMapper(),
                bookingId
        );

        if (bookings.isEmpty()) {
            return null;
        }

        return bookings.get(0);
    }

    // 4. Insert a new booking
    public int createBooking(Booking booking) {

        String sql = "INSERT INTO bookings " +
                "(user_id, space_id, booking_date, slot_hour, total_cost, booking_status) " +
                "VALUES (?, ?, ?, ?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                booking.getUserId(),
                booking.getSpaceId(),
                Date.valueOf(booking.getBookingDate()),
                booking.getSlotHour(),
                booking.getTotalCost(),
                booking.getBookingStatus()
        );
    }

    // 5. Check workspace slot availability
    public boolean isSlotAvailable(
            int spaceId,
            LocalDate bookingDate,
            int slotHour) {

        String sql = "SELECT COUNT(*) FROM bookings " +
                "WHERE space_id = ? " +
                "AND booking_date = ? " +
                "AND slot_hour = ? " +
                "AND booking_status = 'CONFIRMED'";

        Integer count = jdbcTemplate.queryForObject(
                sql,
                Integer.class,
                spaceId,
                Date.valueOf(bookingDate),
                slotHour
        );

        return count != null && count == 0;
    }

    // 6. Cancel booking
    public int cancelBooking(int bookingId) {

        String sql = "UPDATE bookings " +
                "SET booking_status = 'CANCELLED' " +
                "WHERE booking_id = ? " +
                "AND booking_status = 'CONFIRMED'";

        return jdbcTemplate.update(sql, bookingId);
    }

    // 7. Calculate total revenue
    public BigDecimal getTotalRevenue() {

        String sql = "SELECT COALESCE(SUM(total_cost), 0) " +
                "FROM bookings " +
                "WHERE booking_status = 'CONFIRMED'";

        return jdbcTemplate.queryForObject(
                sql,
                BigDecimal.class
        );
    }
}
