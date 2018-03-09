package send.org.sendwallet.rate;

/**
 * Created by kaali on 7/5/17.
 */
public class RequestSendRateException extends Exception {
    public RequestSendRateException(String message) {
        super(message);
    }

    public RequestSendRateException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestSendRateException(Exception e) {
        super(e);
    }
}
