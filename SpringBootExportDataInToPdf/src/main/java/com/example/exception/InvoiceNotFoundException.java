package com.example.exception;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 7:51 PM
*/


public class InvoiceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvoiceNotFoundException() {
        super();
    }

    public InvoiceNotFoundException(String customMessage) {
        super(customMessage);
    }
}