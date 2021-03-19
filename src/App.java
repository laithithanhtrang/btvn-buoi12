import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // bai 1: kiem tra so nguyen to
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n từ bàn phím");
        String input = scanner.nextLine();
        if (input.equals("X") || input.equals("Q")) {
            System.exit(0);
        }
        try {
            n = Integer.parseInt(input);
            checkPrime(n);
        } catch (Exception e) {
            System.out.println("Chuoi ban vua nhap khong phai la so");

        }
        scanner.close();

        // bài 2
        Team team = new Team();
        System.out.println(team.selectPlayer().toString()); //in ngẫu nhien
        System.out.println(team.buildTeam(4,3,3).toString()); //in 11 cau thu theo doi hinh 4-3-3
        // System.out.println(team.);

    }

    public static void checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }
    }

}
