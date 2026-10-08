import java.util.Scanner;
public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namamahasiswa,
        jeniskegiatan;
        int dokumen,
        juara;
        boolean statuspkm = false, status = false;


        System.out.print("Masukkan nama mahasiswa : ");
        namamahasiswa = scanner.nextLine();

        System.out.print("Masukkan jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jeniskegiatan = scanner.nextLine();


        if (jeniskegiatan.equals("BELMAWA") || jeniskegiatan.equals("BAKORMA") || jeniskegiatan.equals("MANDIRI")) {
            System.out.print("Masukkan jumlah juara : ");
            juara = scanner.nextInt();
            System.out.print("Masukkan jumlah dokumen : ");
            dokumen = scanner.nextInt();
            if (dokumen == 4 && juara >= 1) {
                status = true; 
                System.out.println("Dokumen lengkap. Dana penghargaan diberikan");
            }else if (dokumen == 4 && juara < 1) {
                status = false; 
                System.out.println("Bukan juara. Dana penghargaan tidak diberikan.");
            }else if (dokumen < 4 && juara >= 1) {
                status = false; 
                System.out.println("Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            }else {
                status = false; 
                System.out.println("Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen) dan bukan juara. Dana penghargaan tidak diberikan.");
            }
        }else if (jeniskegiatan.equals("PKM")) {
            System.out.print("Masukkan jumlah dokumen : ");
            dokumen = scanner.nextInt();
            if (dokumen == 4) {
                statuspkm = true; 
                System.out.println("Dokumen lengkap. Dana penghargaan diberikan");
            } else {
                statuspkm = false; 
                System.out.println("Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            }
        }else if(jeniskegiatan.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Dana penghargaan tidak diberikan.");
            }

        scanner.close();
        }
}