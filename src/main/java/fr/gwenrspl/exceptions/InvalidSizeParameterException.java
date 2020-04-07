package fr.gwenrspl.exceptions;

public class InvalidSizeParameterException extends Exception {
    private static final long serialVersionUID = -6347993852340931268L;

    public InvalidSizeParameterException(final String message) {
        super(message);
    }
}
