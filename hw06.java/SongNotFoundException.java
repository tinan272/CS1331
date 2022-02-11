/**
 * Exception for when somoeone tries to read song lyric that's not in the database.
 * @author mnguyen354
 * @version 1.0
 */
public class SongNotFoundException extends Exception {

    /**
     * Exception to check if there is no song.
     * @param message message to print when song isn't found
     */
    public SongNotFoundException(String message) {
        super(message);
    }
}
