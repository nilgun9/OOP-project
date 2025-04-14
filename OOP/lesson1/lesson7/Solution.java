import  java.util.Scanner;

public class Solution {

    interface PerformOperation {
        String operation(int num);
    }


    public static PerformOperation isOdd(){
        return (num)-> (num%2!=0)? "ODD": "EVEN";
    }

    public static PerformOperation isPrime(){
        return (num) -> {
            if (num <= 1) return "COMPOSITE";
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return "COMPOSITE";
            }
            return "PRIME";
        };
    }


    public static PerformOperation isPalindrome(){
        return (num) -> {
            int original = num;
            int reverse =0;
            while (num!=0){
                reverse=reverse*10+num%10;
                num/=10;
            }
            return (original==reverse) ? "PALINDROME": "NOT PALINDROME";

        };
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        for (int i = 0; i < testCases; i++) {
            int condition = sc.nextInt();
            int num = sc.nextInt();


            if (condition == 1) {
                PerformOperation op = isOdd();
                System.out.println(op.operation(num));
            } else if (condition == 2) {
                PerformOperation op = isPrime();
                System.out.println(op.operation(num));
            } else if (condition == 3) {
                PerformOperation op = isPalindrome();
                System.out.println(op.operation(num));
            }
        }

        sc.close();
    }


}