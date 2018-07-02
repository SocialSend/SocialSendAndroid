package global;

import java.util.ArrayList;
import java.util.List;

import sendtrum.SendtrumPeerData;

/**
 * Created by kaali on 7/2/17.
 */

public class SendtrumGlobalData {

    public static final String KAALI_TESTNET_SERVER = "peer.socialsend.io";

    public static final String[] TRUSTED_NODES = new String[]{"peer.socialsend.io", "140.82.15.8"};

    public static final List<SendtrumPeerData> listTrustedHosts(){
        List<SendtrumPeerData> list = new ArrayList<>();
        /*list.add(new SendtrumPeerData(KAALI_TESTNET_SERVER,50050,55552));*/
        for (String trustedNode : TRUSTED_NODES) {
            list.add(new SendtrumPeerData(trustedNode,50050,55552));
        }
        return list;
    }

}
