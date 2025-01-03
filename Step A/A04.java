import java.util.Scanner;

class A04{
    public static void main(String[] args) {
        A04 stepA = new A04();
        stepA.a04();
    }

    void a04(){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter area of Apartment(m^2) > ");   
    double m2_area = s.nextDouble();

    double pyung_area = m2_area / 3.305;
    System.out.printf("Area of Apartment(평수) %.1f",pyung_area);

    }
}