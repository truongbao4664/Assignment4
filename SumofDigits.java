import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao day so muon tinh tong tung chu so trong day: ");
        int n = sc.nextInt();
        int sum = 0;

        while (n>0){
            int digit = n%10;
            sum +=digit;
            n /=10;
        }
        System.out.println("Tong cac chu so trong day la: "+sum);
    }
}
