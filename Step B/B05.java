import java.util.Scanner;

class B05 {
    public static void main(String[] args) {
        B05 stepB = new B05();
        stepB.b05();
    }

    void b05(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of days > ");
        int days = s.nextInt();

        int seconds = days * 24 * 60 * 60;
        System.out.printf("Total seconds is %d\n" ,seconds);

        if(seconds > 1000000){
            int m_count = seconds / 1000000;
            System.out.println("It includes million seconds "+m_count+" times");
        }

    }

}
