import java.util.*;
class Q7
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            int res =num*i;
            System.out.println(num+" x "+i+" ="+res);
        }
    }
}