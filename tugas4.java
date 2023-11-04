package Tugas;

public class tugas4 {
    public static void main(String[] args) {
        // Membuat array menggunakan perulangan for
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        // Mencetak isi array menggunakan perulangan for
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array ke-" + i + " adalah " + array[i]);
        }
    }
}