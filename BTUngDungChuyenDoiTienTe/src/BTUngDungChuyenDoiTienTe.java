import java.util.Scanner;

public class BTUngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so tien USD :");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("gia tri VND: " + quydoi);

    }
}
