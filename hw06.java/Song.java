import java.io.File;

/**
 * Represents songs.
 * @author mnguyen354
 * @version 1.0
 */
public class Song {
    private String name;
    private String artist;
    private String genre;
    private File file;

    /**
     * Creates song.
     * @param name song name
     * @param artist song's artist
     * @param genre song's genre
     * @param file song text file
     */
    public Song(String name, String artist, String genre, File file) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.file = file;
    }

    /**
     * Getter method to get song's name.
     * @return song name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter method to get song's artist.
     * @return artist's name
     */
    public String getArist() {
        return this.artist;
    }

    /**
     * Getter method to get genre.
     * @return genre
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Getter method to get file.
     * @return file
     */
    public File getFile() {
        return this.file;
    }

    /**
     * Prints out the song's information.
     * @return song's name, artist, genre, and file name
     */
    @Override
    public String toString() {
        return this.name + " by " + this.artist + "\n" + "Genre: " + this.genre + "\n" + "File: " + this.file.getName();
    }

    /**
     * Checks if an object is equal to another Song object.
     * @return true or false depending on if the object is equal to the other
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        } else {
            Song songO = (Song) obj;
            return (this.name == songO.getName()) && (this.artist == songO.getArist())
                    && (this.genre == songO.getGenre()) && (this.file == songO.getFile());
        }
    }
}