
package com.example.coworking.model;

import java.math.BigDecimal;

public class WorkSpace {

    private int spaceId;
    private String spaceName;
    private String spaceType;
    private BigDecimal hourlyRate;
    private boolean active;

    // Default Constructor
    public WorkSpace() {
    }

    // Parameterized Constructor
    public WorkSpace(int spaceId, String spaceName,
                     String spaceType, BigDecimal hourlyRate,
                     boolean active) {

        this.spaceId = spaceId;
        this.spaceName = spaceName;
        this.spaceType = spaceType;
        this.hourlyRate = hourlyRate;
        this.active = active;
    }

    // Getters and Setters
    public int getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(int spaceId) {
        this.spaceId = spaceId;
    }

    public String getSpaceName() {
        return spaceName;
    }

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    public String getSpaceType() {
        return spaceType;
    }

    public void setSpaceType(String spaceType) {
        this.spaceType = spaceType;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Workspace{" +
                "spaceId=" + spaceId +
                ", spaceName='" + spaceName + '\'' +
                ", spaceType='" + spaceType + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", active=" + active +
                '}';
    }
}
