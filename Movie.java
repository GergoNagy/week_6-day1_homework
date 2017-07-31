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

  public int getScore(){
    return this.score;
  }

  public int filmCount(){
    int count = 0;
    for( Rented f : this.film){
      if (f != null) {
        count++;
      }
    }
    return count;
  } 

  public void rent(Rented rented){
    if (rentedMax()){
      return;
    }
    int filmCount = filmCount();
    film[filmCount] = rented;
  }

  public boolean rentedMax(){
    return filmCount() == film.length;
  }

  public void movieBack(){
    for (int f = 0; f < film.length ; f++ ) {
      film[f] = null;
    }
  }

  public boolean goodMovie(){
    if (this.score > 3) {
      return true;
    } else {
      return false;
    }
  }

  
}