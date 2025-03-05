package array.practice8;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) != null) {
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumberOfSongInAlbum, LinkedList<Song> playList) {
        int index = trackNumberOfSongInAlbum - 1;
        if (index >= 0 && index <= songs.size()) {
            playList.add(songs.get(index));
            return true;
        }
        return false;
    }


    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song song = findSong(title);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder albumDetails = new StringBuilder("Album: " + name + " by " + artist + "\nSongs:\n");
        for (int i = 0; i < songs.size(); i++) {
            albumDetails.append((i + 1)).append(". ").append(songs.get(i).toString()).append("\n");
        }
        return albumDetails.toString();
    }
}

