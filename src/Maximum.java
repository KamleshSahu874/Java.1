import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        int a =scanner.nextInt();
        System.out.println("Enter second number:");
        int b = scanner.nextInt();
        System.out.println("Enter third number:");
        int c = scanner.nextInt();

        int max;
        if(a>=b&&a>=c){
            max=a;
        }else if(b>=a&&b>=c){
            max=b;

        }else {
            max=c;
        }
       System.out.println("Maximum number is:"+max);
    }
}
