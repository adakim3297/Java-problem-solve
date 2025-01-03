import java.util.Scanner;

class A07{
    public static void main(String[] args) {
        A07 stepA = new A07();
        stepA.a07();
    }

    void a07(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter file size as gigabytes > ");
        int gigabytes = s.nextInt();
        
        int megabytes = gigabytes * 1024;
        int kilobytes = megabytes * 1024;
        long bytes = (long)(kilobytes) * 1024;

        System.out.println("Your file size is");
        System.out.printf("%d MB\n",megabytes);
        System.out.printf("%d KB\n",kilobytes);
        System.out.printf("%d B",bytes);

    }
}
