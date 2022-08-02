import java.util.Scanner;
public class Day1Array {
    public static void main(String[] args)
    {
        int[] num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        num=new int[scanner.nextInt()];
        for(int i=0;i<num.length;i++)
        {
          num[i]=scanner.nextInt();
        }
        for(int j=0;j<num.length;j++){
            System.out.print(num[j]+",");
        }
    }
}
