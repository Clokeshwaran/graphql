package com.graphql.dto;

import lombok.Data;

@Data
public class ErrorResponseDto {
    private String status = "error";
    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
