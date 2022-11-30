package com.attrecto.academy.java.courseapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public UserDto(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        }

public long getId() {
        return id;
        }

public void setId(long id) {
        this.id = id;
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

@NotBlank
private long id;

@NotBlank
private String firstName;

@NotBlank
private String lastName;