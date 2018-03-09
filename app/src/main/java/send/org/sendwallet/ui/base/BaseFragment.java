package send.org.sendwallet.ui.base;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;

import send.org.sendwallet.SendApplication;
import send.org.sendwallet.module.SendModule;

/**
 * Created by kaali on 6/29/17.
 */

public class BaseFragment extends Fragment {

    protected SendApplication sendApplication;
    protected SendModule sendModule;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sendApplication = SendApplication.getInstance();
        sendModule = sendApplication.getModule();
    }

    protected boolean checkPermission(String permission) {
        int result = ContextCompat.checkSelfPermission(getActivity(),permission);
        return result == PackageManager.PERMISSION_GRANTED;
    }
}
