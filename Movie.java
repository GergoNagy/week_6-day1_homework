class Movie{
  private String title;
  private int score;
  private Rented[] film;

  public Movie(String title, int score){
    this.title = title;
    this.score = score;
    this.film = new Rented[3];
  } 

  public String getTitle(){
    return this.title;
  }
}