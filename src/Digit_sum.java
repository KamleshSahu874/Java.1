import java.util.Scanner;

public class Digit_sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=scanner.nextInt();
        int sum=0;
        int temp=Math.abs(number);
        while (temp>0){
            int digit= temp%10;
            sum+=digit;
            temp/=10;
        }
        System.out.println("sum of digits:"+sum);
    }
}
