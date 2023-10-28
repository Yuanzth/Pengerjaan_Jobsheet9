import java.util.Scanner;

public class LowHighestAverage02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double average;

        System.out.print("Masukkan jumlah elemen dalam array: ");
        int jmlElemen = input.nextInt();

        int[] num = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) 
        {
            System.out.print("Masukkan nilai ke-"+(i+1)+": ");
            num[i] = input.nextInt();
        }

        int nilaiTertinggi = num[0];
        int nilaiTerendah = num[0];
        int total = num[0];

        for (int i = 1; i < jmlElemen; i++)
        {
            if (num[i] > nilaiTertinggi)
            {
                nilaiTertinggi = num[i];
            }
            else if (num[i] < nilaiTerendah)
            {
                nilaiTerendah = num[i];
            }
            total += num[i];
        }

        average = (double) total / jmlElemen;

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Nilai Rata-Rata: " + average);
    }
}
