package com.training.exception;

public class RangeCheckException extends Exception {
    
    private String errorCode;



   private String message;
    
    public RangeCheckException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }



   @Override
    public String getMessage() {
        return this.errorCode+":"+super.getMessage();
    }
    
    
    
}