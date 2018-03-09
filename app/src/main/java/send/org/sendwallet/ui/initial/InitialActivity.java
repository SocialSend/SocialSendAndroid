package send.org.sendwallet.ui.initial;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import send.org.sendwallet.SendApplication;
import send.org.sendwallet.ui.splash_activity.SplashActivity;
import send.org.sendwallet.ui.wallet_activity.WalletActivity;
import send.org.sendwallet.utils.AppConf;

/**
 * Created by kaali on 8/19/17.
 */

public class InitialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SendApplication sendApplication = SendApplication.getInstance();
        AppConf appConf = sendApplication.getAppConf();
        // show report dialog if something happen with the previous process
        Intent intent;
        if (!appConf.isAppInit() || appConf.isSplashSoundEnabled()){
            intent = new Intent(this, SplashActivity.class);
        }else {
            intent = new Intent(this, WalletActivity.class);
        }
        startActivity(intent);
        finish();
    }
}
