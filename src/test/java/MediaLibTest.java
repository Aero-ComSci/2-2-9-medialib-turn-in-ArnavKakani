import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MediaLibTest {
    @BeforeEach
    void setUp() {
        MediaLib.reset();
    }

    @Test
    void testAddObjects() {
        MediaLib myLib1 = new MediaLib();
        myLib1.addBook(" "," ");
        myLib1.addMovie(" ",1.5);
        myLib1.addSong("Bulls on Parade");
        assertEquals(3, MediaLib.getNumEntries());
    }
    @Test
    void TestGetTallies(){
        MediaLib myLib1 = new MediaLib();
        myLib1.addBook(" "," ");
        MediaLib myLib2 = new MediaLib();
        myLib2.addBook(" "," ");
        assertEquals(2, MediaLib.getNumBooks());
       
        myLib1.addMovie(" ",1.2);
        
        myLib2.addMovie(" ",1.2);
        assertEquals(2, MediaLib.getNumMovies());
        myLib1.addSong("Bulls on Parade");
        myLib2.addSong("3's&7's");
        assertEquals(2, MediaLib.getNumSongs());
        
    }
    
}
