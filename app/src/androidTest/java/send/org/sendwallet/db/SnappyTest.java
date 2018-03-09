package send.org.sendwallet.db;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import com.snappydb.SnappydbException;

import org.junit.Test;

import send.org.sendwallet.module.store.SnappyStore;
import store.AddressNotFoundException;
import store.AddressStore;
import store.CantInsertAddressException;


/**
 * Created by kaali on 6/15/17.
 */

public class SnappyTest {


    @Test
    public void insertTest() throws SnappydbException, CantInsertAddressException, AddressNotFoundException {
        Context appContext = InstrumentationRegistry.getTargetContext();
        AddressStore addressStore = new SnappyStore(appContext);
        //addressStore.insert("yChC1VQS5zET5pDxXgcc4bFye3Q9nurccG","321:dasdmasiodnioen13kelfeqe1");
        //assert addressStore.getAddressStatus("yChC1VQS5zET5pDxXgcc4bFye3Q9nurccG").equals("321:dasdmasiodnioen13kelfeqe1");
    }

}
