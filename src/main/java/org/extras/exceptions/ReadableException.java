package org.extras.exceptions;


public class ReadableException extends Exception {

    public ReadableException() {
    }

    public ReadableException(String message) {
        super(message);
    }

    public ReadableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ReadableException(Throwable cause) {
        super(cause);
    }

    public ReadableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
