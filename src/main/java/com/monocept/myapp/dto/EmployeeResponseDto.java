package com.monocept.myapp.dto;

public class EmployeeResponseDto {
    private long employeeId;
    private String firstName;
    private String lastName;
    private boolean active;
    private String email;

    // Default Constructor
    public EmployeeResponseDto() {
        super();
    }

    // Parameterized Constructor
    public EmployeeResponseDto(long employeeId, String firstName, String lastName, boolean active, String email) {
        super();
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.email = email;
    }

    // Getters and Setters
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeResponseDto{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", active=" + active +
                ", email='" + email + '\'' +
                '}';
    }
}
