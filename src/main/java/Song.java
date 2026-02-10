public class Song {
    private String title;
    private int rating;

    public Song(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
    
    public Song(String title) {
        this(title, 0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Rating: " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return rating == song.rating && title.equals(song.title);
    }
}
