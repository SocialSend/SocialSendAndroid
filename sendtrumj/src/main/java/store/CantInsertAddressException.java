package store;

/**
 * Created by kaali on 6/14/17.
 */

public class CantInsertAddressException extends Exception {

    public CantInsertAddressException(String message, Throwable cause) {
        super(message, cause);
    }

    public CantInsertAddressException(String message) {
        super(message);
    }
}
