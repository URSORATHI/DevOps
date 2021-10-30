import java.util.Scanner;
class Add {

  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
   
    int first = sc.nextInt();;
    int second = sc.nextInt();;
    
    System.out.println(first + " " + second);

    // add two numbers
    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}
