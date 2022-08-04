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
        for(int j=0;j<num.length;j++)
        {
            if(num[j]<=10) {
                System.out.print(num[j] + ",");
            }
            else if(num[j]>10&&num[j]<=20) {
                System.out.println(num[j] + ",");
            }
            else if(num[j]>20&&num[j]<=30) {
                System.out.println(num[j] + ",");
            }
            else if(num[j]>30&&num[j]<=40) {
                System.out.println(num[j] + ",");
            }
            else if(num[j]>40&&num[j]<=50) {
                System.out.println(num[j] + ",");
            }
            else {
                System.out.println("beyond the range");
            }

        }
    }
}
