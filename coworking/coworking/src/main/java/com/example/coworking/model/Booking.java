
package com.example.coworking.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking {

    private int bookingId;
    private int userId;
    private int spaceId;
    private LocalDate bookingDate;
    private int slotHour;
    private BigDecimal totalCost;
    private String bookingStatus;

    // Default Constructor
    public Booking() {
    }

    // Parameterized Constructor
    public Booking(int bookingId, int userId,
                   int spaceId, LocalDate bookingDate,
                   int slotHour, BigDecimal totalCost,
                   String bookingStatus) {

        this.bookingId = bookingId;
        this.userId = userId;
        this.spaceId = spaceId;
        this.bookingDate = bookingDate;
        this.slotHour = slotHour;
        this.totalCost = totalCost;
        this.bookingStatus = bookingStatus;
    }

    // Getters and Setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getSlotHour() {
        return slotHour;
    }

    public void setSlotHour(int slotHour) {
        this.slotHour = slotHour;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", spaceId=" + spaceId +
                ", bookingDate=" + bookingDate +
                ", slotHour=" + slotHour +
                ", totalCost=" + totalCost +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
