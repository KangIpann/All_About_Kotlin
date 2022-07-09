Yosh! Anda sudah selesai dengan materi beberapa tipe Classes dan Collections. Sekarang kita akan merangkum apa saja yang sudah Anda pelajari.

Data class merupakan sebuah kelas sederhana yang bisa berperan sebagai data container.
Data class adalah kelas yang bisa disebut spesial karena kita tidak perlu menentukkan nilai dari fungsi toString(), equals(), dan hashCode() ketika digunakan.
Data class juga menyediakan fungsi copy() yang memudahkan kita untuk menyalin instance dari data class yang sudah dibuat.
Collections merupakan sebuah objek yang bisa menyimpan kumpulan objek lain termasuk data class. Berikut adalah beberapa jenis Collections yang sudah dipelajari:
List
Dengan List kita dapat menyimpan banyak data menjadi satu objek. Sebagai contoh, kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya.

Set
Set merupakan sebuah collection yang hanya dapat menyimpan nilai yang unik. Ini akan berguna ketika Anda menginginkan tidak ada data yang sama atau duplikasi dalam sebuah collection. Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.

Map
Map, yakni sebuah collection yang dapat menyimpan data dengan format key-value.

Sequences
Sequence merupakan collection yang bisa dikategorikan ke dalam lazy evaluation. Jika eager evaluation mengevaluasi seluruh item yang ada pada collection, lazy evaluation hanya akan mengevaluasi item jika benar-benar diperlukan.

Collection juga mempunyai beberapa fungsi operasi yang bisa kita gunakan untuk mengakses data di dalamnya dengan cara yang mudah, beberapa diantaranya adalah:
filter() dan filterNot()
Kedua fungsi tersebut akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan. Sesuai dengan namanya, untuk memfilter atau menyaring suatu data dalam sebuah collection.

map()
Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.

count()
Fungsi count() dapat kita gunakan untuk menghitung jumlah item yang ada di dalam collection.

find(), firstOrNull(), & lastOrNull()
Selanjutnya adalah fungsi yang digunakan untuk mencari item pada sebuah collection. Untuk mencari item pertama yang sesuai dengan kondisi yang kita tentukan, kita bisa menggunakan fungsi find().

first() & last()
Hampir sama seperti fungsi firstOrNull() dan lastOrNull(), fungsi first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection. Kita juga bisa menambahkan sebuah kondisi dengan parameter lambda.

sum()
Mungkin Anda sudah tahu fungsi ini. Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan menjumlahkan setiap data yang ada pada collection.

sorted()
sorted() digunakan untuk mengurutkan item yang ada di dalam collection. Secara default fungsi sorted() ini akan mengurutkan data secara ascending.