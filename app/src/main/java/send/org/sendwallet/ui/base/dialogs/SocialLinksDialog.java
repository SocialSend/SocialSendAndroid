package send.org.sendwallet.ui.base.dialogs;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.net.Uri;
import android.content.Intent;
import android.content.pm.PackageManager;

import send.org.sendwallet.R;

public class SocialLinksDialog extends BottomSheetDialogFragment {    
    public SocialLinksDialog() {
    }
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dialog_social, container, false);

        Button  discordBtn = (Button) view.findViewById(R.id.social_discord);
        Button  bitcointalkBtn = (Button) view.findViewById(R.id.social_bitcointalk);
        Button  telegramBtn = (Button) view.findViewById(R.id.social_telegram);
        Button  whatsappBtn = (Button) view.findViewById(R.id.social_whatsapp);
        Button  githubBtn = (Button) view.findViewById(R.id.social_github);
        Button  facebookBtn = (Button) view.findViewById(R.id.social_facebook);
        Button  twitterBtn = (Button) view.findViewById(R.id.social_twitter);
    
        discordBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PackageManager packageManager = getActivity().getPackageManager();
                        try {
                            packageManager.getPackageInfo("com.discord", 0);
                            Uri uri = Uri.parse( getString(R.string.url_discord) );
                            Intent intent = new Intent( Intent.ACTION_VIEW, uri );
                            intent.setPackage("com.discord");
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity( intent );
                        } catch (PackageManager.NameNotFoundException e) {
                            Uri uri = Uri.parse( getString(R.string.url_discord) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        }

                        dismiss();
                    }
                }
        );
    
    
        telegramBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PackageManager packageManager = getActivity().getPackageManager();
                        try {
                            packageManager.getPackageInfo("org.telegram.messenger", 0);
                            Uri uri = Uri.parse( "tg://resolve?domain=" + getString(R.string.id_telegram ) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        } catch (PackageManager.NameNotFoundException e) {
                            Uri uri = Uri.parse( "https://t.me/" + getString(R.string.id_telegram ) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        }

                        dismiss();
                    }
                }
        );
    
        whatsappBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PackageManager packageManager = getActivity().getPackageManager();
                        try {
                            packageManager.getPackageInfo("com.whatsapp", 0);
                            Uri uri = Uri.parse( getString(R.string.url_whatsapp) );
                            Intent intent = new Intent( Intent.ACTION_VIEW, uri );
                            intent.setPackage("com.whatsapp");
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity( intent );
                        } catch (PackageManager.NameNotFoundException e) {
                            Uri uri = Uri.parse( getString(R.string.url_whatsapp) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        }

                        dismiss();
                    }
                }
    
        );

        twitterBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PackageManager packageManager = getActivity().getPackageManager();
                        try {
                            packageManager.getPackageInfo("com.twitter.android", 0);
                            Uri uri = Uri.parse( "twitter://user?user_id=" + getString(R.string.id_twitter) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        } catch (PackageManager.NameNotFoundException e) {
                            Uri uri = Uri.parse( getString(R.string.url_twitter) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        }

                        dismiss();
                    }
                }
    
        );

        facebookBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        PackageManager packageManager = getActivity().getPackageManager();
                        try {
                            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
                            if (versionCode >= 3002850) { //newer versions of fb app
                                Uri uri = Uri.parse( "fb://facewebmodal/f?href=" + getString(R.string.url_facebook) );
                                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                            } else { //older versions of fb app
                                Uri uri = Uri.parse( "fb://page/" + getString(R.string.id_facebook) );
                                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Uri uri = Uri.parse( getString(R.string.url_facebook) );
                            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                        }

                        dismiss();
                    }
                }
        );
    
        githubBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse( getString(R.string.url_github) );
                        startActivity( new Intent( Intent.ACTION_VIEW, uri ) ); 
                        dismiss();
                    }
                }
        );

        bitcointalkBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse( getString(R.string.url_bitcointalk) );
                        startActivity( new Intent( Intent.ACTION_VIEW, uri ) ); 
                        dismiss();
                    }
                }
    
        );  

        return view;
    }    

}