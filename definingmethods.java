public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  
  // main method
  public static void main(String[] args) {
    
  }
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling "+ productType + "!");
  }
}
