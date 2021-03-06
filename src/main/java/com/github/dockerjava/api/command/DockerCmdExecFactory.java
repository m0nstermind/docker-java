package com.github.dockerjava.api.command;

import java.io.Closeable;
import java.io.IOException;

import javax.net.ssl.SSLContext;

import com.github.dockerjava.core.DockerClientConfig;

public interface DockerCmdExecFactory extends Closeable {

    void init(DockerClientConfig dockerClientConfig);

    AuthCmd.Exec createAuthCmdExec();

    InfoCmd.Exec createInfoCmdExec();

    PingCmd.Exec createPingCmdExec();

    ExecCreateCmd.Exec createExecCmdExec();

    VersionCmd.Exec createVersionCmdExec();

    PullImageCmd.Exec createPullImageCmdExec();

    PushImageCmd.Exec createPushImageCmdExec();

    SaveImageCmd.Exec createSaveImageCmdExec();

    CreateImageCmd.Exec createCreateImageCmdExec();

    SearchImagesCmd.Exec createSearchImagesCmdExec();

    RemoveImageCmd.Exec createRemoveImageCmdExec();

    ListImagesCmd.Exec createListImagesCmdExec();

    InspectImageCmd.Exec createInspectImageCmdExec();

    ListContainersCmd.Exec createListContainersCmdExec();

    CreateContainerCmd.Exec createCreateContainerCmdExec();

    StartContainerCmd.Exec createStartContainerCmdExec();

    InspectContainerCmd.Exec createInspectContainerCmdExec();

    RemoveContainerCmd.Exec createRemoveContainerCmdExec();

    WaitContainerCmd.Exec createWaitContainerCmdExec();

    AttachContainerCmd.Exec createAttachContainerCmdExec();

    ExecStartCmd.Exec createExecStartCmdExec();

    InspectExecCmd.Exec createInspectExecCmdExec();

    LogContainerCmd.Exec createLogContainerCmdExec();

    CopyFileFromContainerCmd.Exec createCopyFileFromContainerCmdExec();

    CopyArchiveFromContainerCmd.Exec createCopyArchiveFromContainerCmdExec();

    CopyArchiveToContainerCmd.Exec createCopyArchiveToContainerCmdExec();

    StopContainerCmd.Exec createStopContainerCmdExec();

    ContainerDiffCmd.Exec createContainerDiffCmdExec();

    KillContainerCmd.Exec createKillContainerCmdExec();

    UpdateContainerCmd.Exec createUpdateContainerCmdExec();

    RestartContainerCmd.Exec createRestartContainerCmdExec();

    CommitCmd.Exec createCommitCmdExec();

    BuildImageCmd.Exec createBuildImageCmdExec();

    TopContainerCmd.Exec createTopContainerCmdExec();

    TagImageCmd.Exec createTagImageCmdExec();

    PauseContainerCmd.Exec createPauseContainerCmdExec();

    UnpauseContainerCmd.Exec createUnpauseContainerCmdExec();

    EventsCmd.Exec createEventsCmdExec();

    StatsCmd.Exec createStatsCmdExec();

    CreateVolumeCmd.Exec createCreateVolumeCmdExec();

    InspectVolumeCmd.Exec createInspectVolumeCmdExec();

    RemoveVolumeCmd.Exec createRemoveVolumeCmdExec();

    ListVolumesCmd.Exec createListVolumesCmdExec();

    ListNetworksCmd.Exec createListNetworksCmdExec();

    InspectNetworkCmd.Exec createInspectNetworkCmdExec();

    CreateNetworkCmd.Exec createCreateNetworkCmdExec();

    RemoveNetworkCmd.Exec createRemoveNetworkCmdExec();

    ConnectToNetworkCmd.Exec createConnectToNetworkCmdExec();

    DisconnectFromNetworkCmd.Exec createDisconnectFromNetworkCmdExec();

    DockerCmdExecFactory withSSLContext(SSLContext sslContext);

    @Override
    void close() throws IOException;

}
