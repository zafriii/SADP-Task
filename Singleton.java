//Singleton

class Song
{
    

   private static Song song = new Song();
   Song(){ }

   public static Song getSong(){
    return song;
   }

   public void showMsg()
   {
    System.out.println("Badal barsa bijuli sawan ko paniiiiii...");

   }

}

public class Singleton {
    public static void main(String[] args) {

        Song s1 = Song.getSong();
        s1.showMsg();
    
    }
}
