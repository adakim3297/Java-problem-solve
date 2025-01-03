
import java.util.Scanner;

class B03 {
    public static void main(String[] args) {
        B03 stepB = new B03();
        stepB.b03();
    }

    void b03(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter width of Rectangle > ");
        int width = s.nextInt();

        System.out.print("Enter height of Rectangle >");
        int height = s.nextInt(); 

        int area = width * height;
        System.out.println("Area of Rectangle is "+area+" and");
        
        if(width == height) System.out.println("it is square");
        else System.out.println("it is not square");

    }

}
