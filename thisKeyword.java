public class SavingsAccount{

  public String owner;
  public int balanceDollar;
  public double balanceEuro;

  public SavingsAccount(String owner, int balanceDollar){
    this.owner = owner;
    this.balanceDollar = balanceDollar;
    this.balanceEuro = balanceDollar * 0.85;

  }

  public void addMoney(int balanceDollar){
    System.out.println("Adding " + balanceDollar + " dollars to the account.");
    this.balanceDollar += balanceDollar;
    System.out.println("The new balance is " + this.balanceDollar + " dollars.");
  }

  public static void main(String[] args){
    SavingsAccount zeusSavingsAccount = new SavingsAccount("Zeus", 1000);

    // Make a call to addMoney() to test your method
    zeusSavingsAccount.addMoney(2000);
  }

}

//i think and don't quote me but i'm pretty sure these are like local variables {_likeThis} in Skript...
//EDIT:
//WAIT I FIGURED IT OUT
//It's when your working with options it's the current one your working with so if you're working with Zeus then it replaces this. with Zeus. in the code so you don't have to know who you're working with!
