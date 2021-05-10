import java.util.*;
class Q5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("entre the first number"); 
        int a = scan.nextInt(); 
        System.out.println("entre the second number"); 
        int b = scan.nextInt();  
        int res=a*b;
        System.out.println(a+" x "+b+" = "+res);
    }
}