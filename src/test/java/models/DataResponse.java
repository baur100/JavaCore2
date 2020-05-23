package models;

import java.util.Arrays;

public class DataResponse {
    public Albums[] albums;
    public boolean allowDownload;
    public Artist[] artist;
    public String cdnUrl;
    public CurrentUser currentUser;
    public String currentVersion;
    public Interaction[] interactions;
    public String latestVersion;
    public Playlist[] playlists;
    public String[] recentlyPlayed;
    public Settings[] settings;
    public Song[] songs;
    public boolean supportsTranscoding;
    public boolean useLastfm;
    public boolean useYouTube;
    public boolean useiTunes;
    public User[] users;

    @Override
    public String toString() {
        return "DataResponse{" +
                "albums=" + Arrays.toString(albums) +
                ", allowDownload=" + allowDownload +
                ", artist=" + Arrays.toString(artist) +
                ", cdnUrl='" + cdnUrl + '\'' +
                ", currentUser=" + currentUser +
                ", currentVersion='" + currentVersion + '\'' +
                ", interactions=" + Arrays.toString(interactions) +
                ", latestVersion='" + latestVersion + '\'' +
                ", playlists=" + Arrays.toString(playlists) +
                ", recentlyPlayed=" + Arrays.toString(recentlyPlayed) +
                ", settings=" + Arrays.toString(settings) +
                ", songs=" + Arrays.toString(songs) +
                ", supportsTranscoding=" + supportsTranscoding +
                ", useLastfm=" + useLastfm +
                ", useYouTube=" + useYouTube +
                ", useiTunes=" + useiTunes +
                ", users=" + Arrays.toString(users) +
                '}';
    }
}
