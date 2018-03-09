package send.org.sendwallet.utils;

import org.sendj.core.ScriptException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

import send.org.sendwallet.contacts.AddressLabel;
import send.org.sendwallet.module.SendModule;
import send.org.sendwallet.ui.wallet_activity.TransactionWrapper;

/**
 * Created by kaali on 8/14/17.
 */

public class TxUtils {

    private static Logger logger = LoggerFactory.getLogger(TxUtils.class);

    public static String getAddressOrContact(SendModule sendModule, TransactionWrapper data) {
        String text;
        if (data.getOutputLabels()!=null && !data.getOutputLabels().isEmpty()){
            Collection<AddressLabel> addressLabels = data.getOutputLabels().values();
            AddressLabel addressLabel = addressLabels.iterator().next();
            if (addressLabel !=null) {
                if (addressLabel.getName() != null)
                    text = addressLabel.getName();
                else
                    text = addressLabel.getAddresses().get(0);
            }else {
                try {
                    text = data.getTransaction().getOutput(0).getScriptPubKey().getToAddress(sendModule.getConf().getNetworkParams(), true).toBase58();
                }catch (ScriptException e){
                    text = data.getTransaction().getOutput(1).getScriptPubKey().getToAddress(sendModule.getConf().getNetworkParams(),true).toBase58();
                }
            }
        }else {
            text = "Error";
            logger.warn(data.toString());
        }
        return text;
    }

}
