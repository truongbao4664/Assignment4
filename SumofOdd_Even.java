import java.util.Scanner;

public class SumofOdd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tongsole=0;
        int tongsochan=0;
        for (int i =1; i<=100; i++){
            if (i % 2 == 0){
                tongsochan+=i;
            }
         else {
                tongsole+=i;
            }
        }
        System.out.println("tong cac so chan la: "+tongsochan);
        System.out.println("tong cac so le la: "+tongsole);
    }
}
