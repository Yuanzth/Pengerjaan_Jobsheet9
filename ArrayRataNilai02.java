import java.util.Scanner;

public class ArrayRataNilai02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rataLulus, rataTidakLulus;
        int jumlahMahasiswa;
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int lulusCount = 0;
        int tidakLulusCount = 0;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = input.nextInt();
        int[] nilaiMhs = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++) 
        {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
            if (nilaiMhs[i] > 70) 
            {
                totalLulus += nilaiMhs[i];
                lulusCount++;
            } 
            else 
            {
                totalTidakLulus += nilaiMhs[i];
                tidakLulusCount++;
            }
        }
        rataLulus = totalLulus / lulusCount;
        rataTidakLulus = totalTidakLulus / tidakLulusCount;
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
