public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println("------- Zeus Bank Account -------");
    System.out.println("Account Balance: " + bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println("Setting account to 5000 dollars!");
    System.out.println("New Balance: " + bankOfGods.accountOne.getBalance());
    System.out.println("Monthly Intrest: " + bankOfGods.accountOne.getMonthlyInterest());
    System.out.println("------- Zeus Bank Account -------");
    //
    System.out.println(" ");
    System.out.println("------- Hades Bank Account -------");
    System.out.println("Account Balance: " + bankOfGods.accountTwo.getBalance());
    bankOfGods.accountTwo.setBalance(1000);
    System.out.println("Setting account to 1000 dollars!");
    System.out.println("New balance: " + bankOfGods.accountTwo.getBalance());
    System.out.println("Monthly Intrest: " + bankOfGods.accountTwo.getMonthlyInterest());
    System.out.println("------- Hades Bank Account -------");
  }

}
