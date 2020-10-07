import java.util.Scanner; 
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
    //get users number
System.out.println("Please enter the length of the line");
   int number = input.nextInt(); 
   for(int i = number; i >=1; i--){
   if(i %2 ==0){
       System.out.print("white,");
     } else {
       if(i %2 !=0){
       System.out.print("black,");
       }
    }
  }
    }
}
  