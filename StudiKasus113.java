import java.util.Scanner;

public class StudiKasus113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargapercup = 18000,
        jumlahcup,
        uangbayar,
        totalharga,
        kembalian,
        totalbayar,
        diskon = 0,
        kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahcup = scanner.nextInt();

        System.out.print("Masukkan uang bayar : ");
        uangbayar = scanner.nextInt();

        totalharga = hargapercup * jumlahcup;
        
        totalbayar = uangbayar;

        kembalian = uangbayar - totalbayar;

        diskon = (totalharga >= 100000) ? totalharga * 10 / 100 : 0;

        kurang = totalharga - uangbayar;

        System.out.println("Total harga : " + totalharga);
        System.out.println("Diskon : " + diskon);
        System.out.println("Total bayar : " + totalbayar);
        System.out.println("Uang tidak cukup, kurang Rp " + kurang);

        scanner.close();
    }
}