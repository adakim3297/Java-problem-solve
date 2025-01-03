import java.util.Scanner;

class B08{
    public static void main(String[] args) {
        B08 stepB = new B08();
        stepB.b08();
    }

    void b08(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = s.nextInt();

        System.out.print("Enter second number ");
        int num2 = s.nextInt();

        System.out.print("Enter third number ");
        int num3 = s.nextInt();

        if(!(num1 != num2 && num2 != num3 && num1 != num3)) System.out.println("Satisfies the first condition");
        if(!(num1 < 50 && num2 < 50 && num3 < 50)) System.out.println("Satisfies the second condition");
        if(num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) System.out.println("Satisfies the third condition");
        if((num2 % num1 == 0 && num3 % num1 == 0) || (num1 % num2 == 0 && num3 % num2 == 0) || (num1 % num3 == 0 && num2 % num3 == 0)) System.out.println("Satisfies the fourth condition");

    }
}