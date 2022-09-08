import java.util.*;

class triangle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double h,b,area;
        int a,b1,c,p;
        System.out.println("Enter the  h and b value");
        h=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("Enter the value of a,b,c");
        a=sc.nextInt();
        b1=sc.nextInt();
        c=sc.nextInt();
        p=a+b1+c;
        area=h*b/2;
        System.out.println(" Area "+area+" Perimeter "+p);
       
    }
}