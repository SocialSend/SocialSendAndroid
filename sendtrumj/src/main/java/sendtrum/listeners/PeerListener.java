package sendtrum.listeners;

import sendtrum.SendtrumPeer;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerListener {

    void onConnected(SendtrumPeer sendtrumPeer);

    void onDisconnected(SendtrumPeer sendtrumPeer);

    void onExceptionCaught(SendtrumPeer sendtrumPeer, Exception e);
}
