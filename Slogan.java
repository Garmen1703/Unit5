public class Slogan{
  private String phrase;
  private static int count;
  public slogan(String phrase){
    this.phrase=phrase;
    count++;
  }
  public String toString(){
    return phrase;
  }
  public int getCount(){
    return count;
  }
}
