public class MediaLib {
    private Book book;
    private Movie movie;
    private Song song;

    private static int numEntries = 0;
    private static int numBooks = 0;
    private static int numMovies = 0;
    private static int numSongs = 0;

    public void addBook(String title, String author) {
        this.book = new Book(title, author);
        numBooks++;
        numEntries++;
    }

    public void addMovie(String title, double rating) {
        this.movie = new Movie(title, rating);
        numMovies++;
        numEntries++;
    }

    public void addSong(String title) {
        this.song = new Song(title);
        numSongs++;
        numEntries++;
    }

    @Override
    public String toString() {
        String info = "";
        if (book != null) {
            info += "Book: " + book + "\n";
        }
        if (movie != null) {
            info += "Movie: " + movie + "\n";
        }
        if (song != null) {
            info += "Song: " + song + "\n";
        }
        return info;
    }

    public static int getNumEntries() {
        return numEntries;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static int getNumMovies() {
        return numMovies;
    }

    public static int getNumSongs() {
        return numSongs;
    }

    public static void reset() {
        numEntries = 0;
        numBooks = 0;
        numMovies = 0;
        numSongs = 0;
    }
}