package com.digital.crud.saladereuniao.saladereuniao.exception;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDetails {

    private Date timestampe;
    private String message;
    private String details;

    public ErrorDetails(Date timestampe, String message, String details) {
        this.timestampe = timestampe;
        this.message = message;
        this.details = details;
    }
}
