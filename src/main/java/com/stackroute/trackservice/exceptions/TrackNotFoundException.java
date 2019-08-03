package com.stackroute.trackservice.exceptions;

public class TrackNotFoundException extends Exception {
    private String message;
    public TrackNotFoundException(){}
    public TrackNotFoundException(String message)
    {
        // Call constructor of parent Exception
        super(message);
        this.message=message;

    }
}
