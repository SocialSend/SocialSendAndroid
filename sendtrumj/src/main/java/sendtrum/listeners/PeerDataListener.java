package sendtrum.listeners;

import java.util.List;

import sendtrum.SendtrumPeer;
import sendtrum.messages.responses.StatusHistory;
import sendtrum.messages.responses.Unspent;
import sendtrum.utility.TxHashHeightWrapper;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerDataListener {

    void onSubscribedAddressChange(SendtrumPeer sendtrumPeer, String address, String status);

    void onListUnpent(SendtrumPeer sendtrumPeer,String address, List<Unspent> unspent);

    void onBalanceReceive(SendtrumPeer sendtrumPeer, String address, long confirmed, long unconfirmed);

    void onGetHistory(SendtrumPeer sendtrumPeer, StatusHistory statusHistory);
}
