import java.util.Scanner;

public class triangle_validity {
    public static void main(String[] args) {
        float a,b,c,s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s1=a+b;
        s2=b+c;
        s3=a+c;
        if (s1>c || s2>a || s3>b){
            System.out.println("Triangle with sides (" + a + "," + b +"," +c+")" + " is valid" );
        }
        else {
            System.out.println("Triangle with sides (" + a + "," + b +"," +c+")" + " is not valid" );
        }
    }
}