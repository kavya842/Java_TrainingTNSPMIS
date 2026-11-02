
package com.example.coworking.service;

import com.example.coworking.model.Booking;
import com.example.coworking.model.User;

import com.example.coworking.repositary.BookingRepository;
import com.example.coworking.repositary.UserRepositary;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;
    private final UserService userService;
    private final UserRepositary userRepository;

    public BookingService(
            BookingRepository bookingRepository,
            UserService userService,
            UserRepositary userRepositary) {

        this.bookingRepository = bookingRepository;
        this.userService = userService;
        this.userRepository = userRepositary;
    }

    // 1. Get all bookings
    public List<Booking> getAllBookings() {
        return bookingRepository.getAllBookings();
    }

    // 2. Get bookings by user ID
    public List<Booking> getBookingsByUserId(int userId) {
        return bookingRepository.getBookingsByUserId(userId);
    }

    // 3. Book workspace and deduct wallet balance
    @Transactional
    public String bookWorkspace(Booking booking) {

        int userId = booking.getUserId();
        BigDecimal bookingCost = booking.getTotalCost();

        // Check wallet balance
        boolean sufficientBalance =
                userService.hasSufficientBalance(userId, bookingCost);

        if (!sufficientBalance) {
            throw new RuntimeException("Insufficient wallet balance!");
        }

        // Get user details
        User user = userService.getUserById(userId);

        if (user == null) {
            throw new RuntimeException("User not found!");
        }

        // Calculate new balance
        BigDecimal newBalance =
                user.getWalletBalance().subtract(bookingCost);

        // Deduct wallet balance
        int updatedRows =
                userRepository.updateWalletBalance(userId, newBalance);

        if (updatedRows != 1) {
            throw new RuntimeException("Wallet update failed!");
        }

        // Create booking
        int insertedRows =
                bookingRepository.createBooking(booking);

        if (insertedRows != 1) {
            throw new RuntimeException("Booking creation failed!");
        }

        return "Booking successful!";
    }

    // 4. Cancel booking and refund wallet
    @Transactional
    public String cancelBooking(int bookingId) {

        // Find booking
        Booking booking =
                bookingRepository.getBookingById(bookingId);

        if (booking == null) {
            throw new RuntimeException("Booking not found!");
        }

        // Check booking status
        if (!"CONFIRMED".equalsIgnoreCase(
                booking.getBookingStatus())) {

            throw new RuntimeException(
                    "Booking is already cancelled or not confirmed!");
        }

        // Find user
        User user =
                userService.getUserById(booking.getUserId());

        if (user == null) {
            throw new RuntimeException("User not found!");
        }

        // Calculate refund
        BigDecimal refundAmount = booking.getTotalCost();

        BigDecimal newBalance =
                user.getWalletBalance().add(refundAmount);

        // Refund wallet
        int updatedRows =
                userRepository.updateWalletBalance(
                        user.getUserId(),
                        newBalance
                );

        if (updatedRows != 1) {
            throw new RuntimeException("Wallet refund failed!");
        }

        // Update booking status
        int cancelledRows =
                bookingRepository.cancelBooking(bookingId);

        if (cancelledRows != 1) {
            throw new RuntimeException("Booking cancellation failed!");
        }

        return "Booking cancelled successfully! Refund: ₹" + refundAmount;
    }

    // 5. Calculate total revenue from confirmed bookings
    public BigDecimal getTotalRevenue() {

        BigDecimal revenue =
                bookingRepository.getTotalRevenue();

        if (revenue == null) {
            return BigDecimal.ZERO;
        }

        return revenue;
    }
}
