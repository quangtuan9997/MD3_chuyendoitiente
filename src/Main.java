import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rate=23000;
        System.out.println("nhập vào số tiền USD mày có :");
        int USD=sc.nextInt();
        System.out.println(USD+"USD = "+(USD*rate));
    }
}
