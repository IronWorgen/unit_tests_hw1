package org.example.calculator.exeptions;

public class NegativeArgumentException extends RuntimeException {
    public NegativeArgumentException(String message) {
        super(message);
    }
}
