
import java.util.Scanner;

class B02 {
    public static void main(String[] args) {
        B02 stepB = new B02();
        stepB.b02();
    }

    void b02(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature > ");
        double input_degree = s.nextDouble();

        System.out.print("Enter type of temperature('C' for Celsius, 'F' for Fahrenheit) ");
        String kind = s.next();
        //System.out.printf("%c",kind);

        double output_degree = 0.0;
        if(kind.equals("C")) output_degree = (double)input_degree * 1.8 + 32; 
        else output_degree = (double)(input_degree -32) / 1.8;

        System.out.printf("Fahrenheit temperature is %.1f",output_degree);

    }

}
