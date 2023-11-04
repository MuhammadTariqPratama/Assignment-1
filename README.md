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


## _3. Buatlah program zodiac dengan menggunakan fitur input dengan hasil menampilkan zodiac sesuai dengan tanggal lahir yang diinputkan_

Tugas ke-3 merupakan sebuah program zodiac yang dapat menampilkan zodiac sesuai tanggal lahir dan bulan dari program tersebut dengan menggunakan input sebagai berikut :

1. `import java.util.Scanner;`: Baris ini mengimpor kelas `Scanner` dari paket `java.util`, untuk membaca input dari pengguna.
2. `public class tugas3zodiac {}`: Program dimulai dengan mendefinisikan kelas Java dengan nama `tugas3zodiac`.
3. `public static void main(String[] args) {}`: Setiap program Java harus memiliki method `main` yang merupakan titik masuk eksekusi program.
4. `Scanner scanner = new Scanner(System.in);`: Sebuah objek `Scanner` dibuat untuk membaca input dari pengguna.
5. `System.out.println("Masukkan tanggal lahir Anda (Format=dd mm): ");`: Pesan ini meminta pengguna untuk memasukkan tanggal lahir dalam format "dd mm".
6. `String[] date = scanner.nextLine().split(" ");`: Program membaca input pengguna sebagai string, memisahkan string tersebut menggunakan spasi, dan menyimpan hasilnya dalam array `date`.
7. `int day = Integer.parseInt(date[0]);`: Mengonversi string pertama dari array `date` (representasi tanggal) menjadi bilangan bulat dan menyimpannya dalam variabel `day`.
8. `int month = Integer.parseInt(date[1]);`: Mengonversi string kedua dari array `date` (representasi bulan) menjadi bilangan bulat dan menyimpannya dalam variabel `month`.
9. `String zodiacSign = findZodiacSign(day, month);`: Memanggil fungsi `findZodiacSign` dengan parameter `day` dan `month` dan menyimpan hasilnya dalam variabel `zodiacSign`.
10. `System.out.println("Zodiak Anda adalah: " + zodiacSign);`: Mencetak zodiak yang ditemukan.
11. `private static String findZodiacSign(int day, int month) {`: Mendefinisikan fungsi `findZodiacSign` dengan dua parameter: `day` dan `month`. Fungsi ini mengembalikan string yang mewakili zodiak berdasarkan tanggal lahir yang diberikan.
12. Blok `if-else`: Fungsi ini menggunakan serangkaian pernyataan `if-else` untuk menentukan zodiak berdasarkan nilai `day` dan `month` yang diberikan.

Program ini meminta pengguna untuk memasukkan tanggal lahir dalam format "dd mm", kemudian menentukan zodiak berdasarkan input tersebut dan mencetak hasilnya ke output.


## _4. Buatlah sebuah variabel dengan tipe data array, kemudian tampilkan semua nilai dalam variabel tersebut menggunakan perulangan for_

Pada tugas ke-4 membuat sebuah variabel dengan tipe data array, dan ditampilkan dengan menggunakan looping for, yakni dengan cara input sebagai berikut :

1. `public class tugas4 {}`: Program dimulai dengan mendefinisikan kelas Java dengan nama `tugas4`.
2. `public static void main(String[] args) {}`: Setiap program Java harus memiliki method `main` yang merupakan titik masuk eksekusi program.
3. `int[] array = new int[5];`: Sebuah array `array` dengan panjang 5 elemen (indeks 0 hingga 4) dibuat. Array ini akan menyimpan bilangan bulat.
4. `for (int i = 0; i < array.length; i++) {}`: Memulai loop `for` yang akan menginisialisasi variabel `i` dengan 0 dan akan dijalankan selama nilai `i` kurang dari panjang array (`array.length`).
5. `array[i] = i + 1;`: Pada setiap iterasi loop, nilai array pada indeks `i` diisi dengan nilai `i + 1`. Ini berarti array akan berisi nilai 1, 2, 3, 4, dan 5 setelah loop ini selesai dieksekusi.
6. `for (int i = 0; i < array.length; i++) {`: Memulai loop `for` kedua yang akan menginisialisasi variabel `i` dengan 0 dan akan dijalankan selama nilai `i` kurang dari panjang array (`array.length`).
7. `System.out.println("Array ke-" + i + " adalah " + array[i]);`: Pada setiap loop, program mencetak pesan yang berisi indeks array (`i`) dan nilai pada indeks tersebut (`array[i]`). Ini akan mencetak isi array ke layar.
   
Program ini membuat sebuah array dengan panjang 5, mengisi elemennya dengan nilai 1 sampai 5, dan kemudian mencetak indeks dan nilai masing-masing elemen array ke layar.
