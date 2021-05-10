import java.util.*;
class Q6
{
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scan.nextInt();
        System.out.println("enter first number:");
        int num2=scan.nextInt();
        int a=num1+num2;
        int b=num1-num2;
        int c=num1*num2;
        int d=num1/num2;
        int e=num1%num2;
        System.out.println(num1+" + "+num2+" = "+a);
        System.out.println(num1+" - "+num2+" = "+b);
        System.out.println(num1+" x "+num2+" = "+c);
        System.out.println(num1+" / "+num2+" = "+d);
        System.out.println(num1+" mod "+num2+" = "+e);

    }
}