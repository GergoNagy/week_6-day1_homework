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

  @Test
  public void hasScore(){
    assertEquals(5, movie.getScore());
  }

  @Test
  public void  rentedFilmEmpty(){
    assertEquals(0, movie.filmCount());
  }

  @Test
  public void canRentFilm(){
    movie.rent(rented);
    assertEquals(1, movie.filmCount());
  }

  @Test
  public void canNotRentMoreMovie(){
    for (int f = 0; f < 5 ; f++ ) {
      movie.rent(rented);      
    }
    assertEquals(3, movie.filmCount());
  }

  @Test
  public void giveBackRentedMovie(){
    movie.rent(rented);
    movie.movieBack();
    assertEquals(0, movie.filmCount());
  }

  @Test
  public void onlyRentGoodMovie(){
    assertEquals(true, movie.goodMovie());
  }

  @Test
  public void badMovie(){
    Movie baaadMovie = new Movie("Spiderman", 2);
    assertEquals(false, baaadMovie.goodMovie());
  }
}