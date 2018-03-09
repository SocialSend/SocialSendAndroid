package global;

import org.sendj.core.Context;
import org.sendj.core.NetworkParameters;

/**
 * Created by kaali on 6/4/17.
 */

public interface WalletConfiguration {


    int getTrustedNodePort();

    String getTrustedNodeHost();

    void saveTrustedNode(String host,int port);

    void saveScheduleBlockchainService(long time);

    long getScheduledBLockchainService();

    /**************   Constants   ***************/

    String getMnemonicFilename();

    String getWalletProtobufFilename();

    NetworkParameters getNetworkParams();

    String getKeyBackupProtobuf();

    long getWalletAutosaveDelayMs();

    Context getWalletContext();

    String getBlockchainFilename();

    String getCheckpointFilename();

    int getPeerTimeoutMs();

    long getPeerDiscoveryTimeoutMs();

    int getMinMemoryNeeded();

    long getBackupMaxChars();

    boolean isTest();

    int getProtocolVersion();
}
