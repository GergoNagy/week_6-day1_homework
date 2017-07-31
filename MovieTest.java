import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MovieTest {

  Movie movie;
  Rented rented;

  @Before
  public void before(){
    movie = new Movie("Hobbit", 5);
    rented = new Rented();
  }

  @Test
  public void hasTitle(){
    assertEquals("Hobbit", movie.getTitle());
  }
}