# latihan-3-batman

Gotham, sebuah kota yang penuh seluk beluk. Ada the dark Knight yang menghantui para penjahat setiap malam. Dalam kisah ini Anda adalah asisten dari James Gordon, komisaris dari GCPD (Gotham City Police Department). Setiap malam bantulah James Gordon untuk mencatat para penjahat.

Terdapat 2 penjahat, yakni villains dan supervillains. Villains adalah penjahat yang melakukan kejahatan tingkat  F sampai dengan D. Tingkat kejahatan yang rendah, sedangkan supervillains melakukan kejahatan tingkat C hingga A+. Melakukan kriminalitas atau membuay kerusakan yang sangat parah di tanah Gotham. Bersyukur ada Batman yang membantu menangkap para penjahat tersebut, dan polisi hanya mengantarkan dan mengadili para penjahat tersebut.

Sebagai asisten dari James Gordon, buatlah program untuk mendata para penjahat dengan kriteria sebagai berikut:
1. Buat main class yang akan menampilkan menu utama. Namun ada syarat jika ingin mengakses menu tersebut, Anda harus login terlebih dahulu. Username menggunakan nim, kemudian untuk passwordnya ada 3 huruf pertama dari nama Anda dalam bentuk kapital. Ada 3 kesempatan login, jika sudah 3 kali gagal, program berhenti/keluar. Munculkan lah pesan jka salah memasukkan identitas
2. Menu yang harus di buat adalah:
- Input penjahat 
- Lihat data penjahat.

Keterangan: 
- untuk input penjahat, ada beberapa hal yang perlu di perhatikan. Yang perlu di input adalah nama, alias, tinggi, berat, jenis kelamin, tingkat kriminalitas (urutan dari yang rendah: F, E, D, C, B, A). Namun tidak semua data tersebut tersedia. Maka jika tidak ada infonya, akan di tampilkan None /null (utk string) atau 0 (utk int)
- menu lihat penjahat di bagi menjadi dua. Melihat data supervillains dan data penjahat. Ingat jangan sampai tercampur
3. Buat kelas GCPD yang akan menyimpan penjahat tersebut. Anda di perbolehkan menggunakan konsep rak dan buku pada tugas praktikum minggu lalu atau menyimpan dalam array. Yang ditekankan adalah pada kelas ini ada beberapa overloading constructor yang bergantung dengan input. Ingat jika tidak ada keterangan maka yang disimpan adalah None /null (utk string) atau 0 (utk int)
- note:
String nama
String alias
Int berat (dalam kg)
Int tinggi (dalam cm)
Char Jenis kelamin (L/P)
String tingkat kejahatan (F, E, D, C, B, A)

**Data penjahat**
- Nama: Christoper H
- Alias: otakbeku
- Tinggi: 170 cm
- Berat: 58 kg
- Jenis kelamin: L
- Tingkat kejahatan: A

=======================
- Nama: Yasumi Sazami
- Alias: killer lady
- Tinggi: 163 cm
- Berat: 46 kg
- Jenis kelamin: P
- Tingkat kejahatan: D

=======================
- Nama: Victor Fries
- Alias: Mr Freeze
- Tinggi: 183 cm
- Berat: 80 kg
- Jenis kelamin: L
- Tingkat kejahatan: A

=======================
- Nama: Harvey Dent
- Alias: Two-Face
- Tinggi: 183 cm
- Berat: 80 kg
- Jenis kelamin: L
- Tingkat kejahatan: B


## NOTE
Yang di kerjakan hanya kelas-kelas yang menampung villains dan supervillain serta kelas GCPD

Untuk Main Kelas tidak perlu di kerjakan
