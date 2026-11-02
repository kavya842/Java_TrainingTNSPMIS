
package com.example.coworking.mapper;

import com.example.coworking.model.Booking;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookingRowMapper implements RowMapper<Booking> {

    @Override
    public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {

        Booking booking = new Booking();

        booking.setBookingId(rs.getInt("booking_id"));
        booking.setUserId(rs.getInt("user_id"));
        booking.setSpaceId(rs.getInt("space_id"));
        booking.setBookingDate(rs.getDate("booking_date").toLocalDate());
        booking.setSlotHour(rs.getInt("slot_hour"));
        booking.setTotalCost(rs.getBigDecimal("total_cost"));
        booking.setBookingStatus(rs.getString("booking_status"));

        return booking;
    }
}
