import java.util.*;
class Q12
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter three numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int res=num1+num2+num3;
        res=res/3;
        System.out.println("Average is:"+res);
    }
}