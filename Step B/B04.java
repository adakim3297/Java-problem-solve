
import java.util.Scanner;

class B04 {
    public static void main(String[] args) {
        B04 stepB = new B04();
        stepB.b04();
    }

    void b04(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter area of Apartment(m^2) > ");
        double m2_area = s.nextDouble();

        
        double pyung_area = m2_area / 3.305;

        System.out.printf("Area of Apartment(평수) %.1f\n" ,pyung_area);

        if(pyung_area < 30) System.out.println("It is small apartment");
        else System.out.println("It is big apartment");

    }

}
