 import java.util.Scanner;
    public class  Vowel{
     public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a single character:");
       char alphabet = scanner.next().charAt(0); 

        if (alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'){
        System.out.print("VOWEL!!");
       }
       else if (alphabet=='b'|| alphabet=='c'|| alphabet=='d'||alphabet=='f' || alphabet=='g'||alphabet=='h'||alphabet=='j'||alphabet=='k'||alphabet=='l'||alphabet=='m'||alphabet=='n'||alphabet=='p'||alphabet=='q'||alphabet=='r'||alphabet=='s'||alphabet=='t'||alphabet=='v'||alphabet=='w'||alphabet=='x'||alphabet=='y'||alphabet=='z'){
       System.out.print("CONSONANT!!");
   }
   else{
      System.out.print("Error messages!!");
   } 
  }
 }