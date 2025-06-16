import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        int reverse = 0;
        int digit = 0;

        while(number != 0){
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reverse number " + reverse);
    }
}