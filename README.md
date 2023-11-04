# Assignment-1

## 1. _Buatlah perulangan hingga 100 menggunakan Java dengan output sebagai berikut:_
    1
    2
    3
    4
    5
    6
    7
    8
    9
    (Your Name)
    (Your Name)
    (Your Name)
    
Tugas 1 merupakan perulangan hingga 100 menggunakan Java dengan menggunakan input seperti berikut :

1. `public class {}`: deklarasi kelas Java. Kode program harus berada dalam kelas Java, dan nama kelas harus cocok dengan nama file yang menyimpan kode.
2. `public static void main(String[] args) {`: metode utama (main method) dari kelas. Metode ini akan dijalankan saat program dimulai. Itu mengambil array argumen string `args`, tetapi dalam kode ini tidak digunakan.
3. `for (int i=0;i<=100;i++){`: awal dari loop `for` yang akan menjalankan pernyataan-pernyataan dalam kurung kurawal `{}` selama variabel `i` berada dalam rentang dari 1 hingga 100 dan ditingkatkan dengan 1 pada setiap baris.
4. `if (i <= 9) {`: kondisi `if` memeriksa apakah nilai `i` kurang dari atau sama dengan 9.
5. `System.out.println(i);`: Jika kondisi pada baris sebelumnya benar (nilai `i` kurang dari atau sama dengan 9), maka pernyataan ini akan mencetak nilai `i` ke layar.
6. `else {`: Jika kondisi tidak terpenuhi (nilai `i` lebih besar dari 9), program akan melakukan apa yang ada di dalam blok `else`.
7. `System.out.println("Tariq");`: Pernyataan ini akan mencetak kata "Tariq" ke layar saat `i` lebih besar dari 9.
8. 
Jadi, kode ini akan mencetak angka dari 1 hingga 9 ke layar, dan kemudian mencetak kata "Tariq" dari 10 hingga 100.

## _2. Buatlah program bebas, dengan menerapkan if else dalam perulangan while_

pada tugas ke-2 merupakan membuat sebuah program bebas yang menggunakan if else dengan perulangan while, disini saya akan membuat program tebak angka dengan menggunakan input sebagai berikut :

1. `import java.util.Scanner;`: mengimpor kelas `Scanner` dari paket `java.util`, untuk membaca input dari pengguna.
2. `import java.util.Random;`: mengimpor kelas `Random` dari paket `java.util`, untuk menghasilkan angka acak.
3. `public class Tugas2 {}`: Program dimulai dengan mendefinisikan kelas Java dengan nama `Tugas2`.
4. `public static void main(String[] args) {}`: Setiap program Java harus memiliki method `main` yang merupakan titik masuk eksekusi program. Program dimulai di sini.
5. `Random random = new Random();`: Sebuah objek dari kelas `Random` dibuat untuk menghasilkan angka acak.
6. `int target = random.nextInt(10) + 1;`: Variabel `target` diinisialisasi dengan nilai acak antara 1 dan 10.
7. `Scanner scanner = new Scanner(System.in);`: Objek `Scanner` dibuat untuk membaca input dari pengguna.
8. `int input;`: Variabel `input` dideklarasikan untuk menyimpan nilai yang diinput oleh pengguna.
9. `int attempt = 0;`: Variabel `attempt` digunakan untuk menghitung jumlah percobaan pengguna menebak angka.
10. `while (true) {}`: Memulai loop `while` yang akan berjalan selamanya (kondisi loop adalah `true`), sampai program dihentikan oleh pernyataan `break`.
11. `System.out.println("Tebak angka dari 1 sampai 10: ");`: Pesan ini untuk meminta pengguna menebak angka dari 1 hingga 10.
12. `input = scanner.nextInt();`: Program membaca input yang diberikan oleh pengguna dan menyimpannya dalam variabel `input`.
13. `attempt++;`: Jumlah percobaan ditingkatkan setiap kali pengguna memberikan input.
14. Blok `if-else`:
   - `if (input == target) { ... }`: Jika nilai `input` sama dengan `target`, program mencetak pesan selamat dan jumlah percobaan, lalu keluar dari loop menggunakan pernyataan `break`.
   - `else if (input < target) { ... }`: Jika nilai `input` lebih kecil dari `target`, program memberikan petunjuk untuk mencoba lagi dengan angka yang lebih besar.
   - `else if (input > 10) { ... }`: Jika nilai `input` lebih besar dari 10, program memberikan pesan bahwa hanya angka dari 1 hingga 10 saja yang diterima.
   - `else { ... }`: Jika nilai `input` lebih besar dari `target`, program memberikan petunjuk untuk mencoba lagi dengan angka yang lebih kecil.

Program ini meminta pengguna untuk menebak angka antara 1 dan 10, memberikan petunjuk apakah angka yang ditebak terlalu besar atau terlalu kecil, dan mencetak jumlah percobaan yang dibutuhkan untuk menebak dengan benar. Program akan terus berjalan sampai pengguna menebak angka dengan benar.

