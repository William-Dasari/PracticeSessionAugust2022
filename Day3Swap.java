import java.util.Scanner;
public class Day3Swap
{

    public static void main(String[] args){

        //declaration
        int a,b;
        Scanner scanner=new Scanner(System.in);

        //initialization
        System.out.println("Enter numbers for swapping");
        System.out.print("Enter Value of a : ");
        a=scanner.nextInt();
        System.out.print("Enter value of b : ");
        b=scanner.nextInt();

        //print statement before swapping
        System.out.println("Before swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        //Swapping logic
        int temp = a;
        a = b;
        b=temp;

        //Printing after swapping
        System.out.println("After Swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}
