import java.util.ArrayList;

class List {
  
  public static void main(String[] args) {
    ArrayList<String> friends = new ArrayList<String>();
    friends.add("Ian");
    friends.add("Annika");
    System.out.println("You are now friends with Annika!");
    friends.remove("Annika");
    System.out.println("Nvm she don't wanna be friends sad");
    if(friends.size() == 1) {
      System.out.println("You have " + friends.size() + " friend!");
      System.out.println(friends);
    } else {
      System.out.println("You have " + friends.size() + " friends!");
      System.out.println(friends);
    }
  }
  
}
//I made this whole thing by scratch :D
