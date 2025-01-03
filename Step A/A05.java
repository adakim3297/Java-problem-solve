import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        A05 stepA = new A05();
        stepA.a05();
    }

    void a05(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of days > ");
        int days = s.nextInt();

        int seconds = days * 24* 60 * 60;
        System.out.printf("Total seconds is %d",seconds);
    }
}
