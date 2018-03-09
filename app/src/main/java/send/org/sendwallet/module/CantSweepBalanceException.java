package send.org.sendwallet.module;

import java.util.concurrent.TimeoutException;

/**
 * Created by kaali on 10/7/17.
 */

public class CantSweepBalanceException extends Throwable {
    public CantSweepBalanceException(String s,Exception e) {
        super(s,e);
    }
}
