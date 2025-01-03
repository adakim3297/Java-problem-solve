import java.util.Scanner;

class B07{
    public static void main(String[] args) {
        B07 stepB = new B07();
        stepB.b07();
    }

    void b07(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file size as megabytes > ");
        int megabytes = s.nextInt();

        long bytes = megabytes * 1024 * 1024;

        System.out.print("Enter 'Y' if USB type is 2.0 or 'N' > ");
        String usb2 = s.next();

        int time;
        if(usb2.equals("Y")) time = (int)bytes / 60000000;
        else time = (int)bytes / 1500000;

        System.out.printf("File transfer time is %d\n",time);


    }
}