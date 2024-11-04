import java.util.Scanner;
public class Kiemtrasonguyento {



    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen: ");
        int number = sc.nextInt();
        if (isPrime(number)){
            System.out.println(number +" La so nguyen to.");

        }else {
            System.out.println(number +" Khong phai la so nguyen to.");
        }
    }

}
