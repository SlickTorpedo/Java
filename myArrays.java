import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Add it up");
    desertIslandPlaylist.add("Benz");
    desertIslandPlaylist.add("Balenciago");
    desertIslandPlaylist.add("Captain");
    desertIslandPlaylist.add("Fearless");
    desertIslandPlaylist.add("Pain");
    desertIslandPlaylist.add("The Search");
    desertIslandPlaylist.remove("Add it up");
    desertIslandPlaylist.remove("Captain");
    int songA = desertIslandPlaylist.indexOf("Benz");
    String songB = ("Sugarcrash");
    desertIslandPlaylist.set(songA, songB);
    System.out.println("Your favorite songs are " + desertIslandPlaylist + " !");
    System.out.println("You have " + desertIslandPlaylist.size() + " favorite songs!");
  }
}
