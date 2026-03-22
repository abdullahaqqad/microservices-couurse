package com.eazybytes.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String resourceField, String resourceValue) {
        super(
            String.format("%s not found with given input data %s : '%s'", resourceName, resourceField, resourceValue));
    }
}
