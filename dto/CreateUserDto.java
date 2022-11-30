package com.attrecto.academy.java.courseapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@NotBlank
private String firstName;

@NotBlank
private String lastName;

public CreateUserDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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