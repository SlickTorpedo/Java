public class DNA {
 
  public static void main(String[] args) {
    /*

    Heres some templates:
    ATGCGATACGCTTGA
    ATGCGATACGTGA
    ATTAATATGTACTGA
    You can also use any one you want just replace "dna1 with your value!

    "*/
    String dna1 = "ATGCGATACGCTTGA";

    
    String dna2 = "Ignore Me Please!";
    String dna3 = "Ignore Me Please!";
    String dna = "I'm a placeholder pretty neato huh?";
    int dnal = dna.length();
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
    int dnas1 = dna1.indexOf("ATG");
    int dnae1 = dna1.indexOf("TGA");
    //break
    int dnas2 = dna2.indexOf("ATG");
    int dnae2 = dna2.indexOf("TGA");
    //break
    int dnas3 = dna3.indexOf("ATG");
    int dnae3 = dna3.indexOf("TGA");
    //check for start codon
    if(dnas1 != -1 && dnae1 != -1) {
      String templist = dna1.substring(dnas1, dnae1);
      if(templist.length() % 3 == 0) {
        System.out.println("It's a protien!");
      } else {
        System.out.println("Not a protien!");
      }
    } else {
      if(dnas1 != -1) {
        System.out.println("Does not contain a start codon!");
      } else {
        System.out.println("Does not contain an end codon!");
        System.out.println("(The program will run forever)");
      }
    }
  }
}
