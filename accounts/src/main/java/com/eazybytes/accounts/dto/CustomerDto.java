package com.eazybytes.accounts.dto;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name can not be null or empty")
    @Size(min = 5, max = 30, message = "Name should be between 5 and 30 characters")
    private String name;

    @NotEmpty(message = "Email can not be null or empty")
    @Email(message = "Please provide a valid email address")
    private String email;

    @Pattern(regexp = "^$|[0-9]\\d{10}$", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
