package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import database.VideoMetadata;

public interface VideoInterface extends Remote {

    boolean uploadVideo(VideoMetadata metadata, byte[] videoData) throws RemoteException;

    byte[] downloadVideo(int videoId) throws RemoteException;

    List<VideoMetadata> getAllVideos() throws RemoteException;

    List<VideoMetadata> searchVideos(String query) throws RemoteException;

    VideoMetadata getVideoDetails(int videoId) throws RemoteException;
}
