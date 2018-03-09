package send.org.sendwallet.module;

/**
 * Created by kaali on 10/8/17.
 */

public class UpgradeException extends Exception {

    public UpgradeException(String message) {
        super(message);
    }

    public UpgradeException(String message, Throwable cause) {
        super(message, cause);
    }
}
