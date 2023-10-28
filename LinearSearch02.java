import java.util.Scanner;

public class LinearSearch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = input.nextInt();
        int[] arrayInt = new int[jumlahElemen];
        
        for (int i = 0; i < jumlahElemen; i++) 
        {
        System.out.println("Masukkan elemen array:");
        arrayInt[i] = input.nextInt();
        }
        
        System.out.print("Masukkan key yang ingin dicari: ");
        int key = input.nextInt();
        
        int hasil = -1;
        for (int i = 0; i < jumlahElemen; i++) 
        {
            if (arrayInt[i] == key) 
            {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) 
        {
            System.out.println("Key ada di posisi index ke-" + hasil);
        } 
        else 
        {
            System.out.println("Key tidak ditemukan dalam array.");
        }
    }
}
