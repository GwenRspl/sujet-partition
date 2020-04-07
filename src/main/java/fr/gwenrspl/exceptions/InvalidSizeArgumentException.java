package fr.gwenrspl.exceptions;

public class InvalidSizeArgumentException extends Exception {
    private static final long serialVersionUID = -6347993852340931268L;

    public InvalidSizeArgumentException(final String message) {
        super(message);
    }
}
