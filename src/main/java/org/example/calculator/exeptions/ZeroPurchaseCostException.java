package org.example.calculator.exeptions;

public class ZeroPurchaseCostException extends RuntimeException {
    public ZeroPurchaseCostException(String message) {
        super(message);
    }
}
