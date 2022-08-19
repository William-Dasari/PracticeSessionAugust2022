public class Day3Swap
{

    public static void main(String[] args){

        //declaration and initialization
        int a=10,b=20;

        //print statement before swapping
        System.out.println("Before swapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);

        //Swapping logic
        int temp = a;
        a = b;
        b=temp;

        //Printing after swapping
        System.out.println("After Sapping");
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}
