package Fungsi

/**
 * fungsi dibagi menjadi 3 yang pertama itu adalah sebuah fungsi tanpa paramater biasa di sebut prosedur
 * */
fun main() {
    tambah(3, 6)
    LuasSegitiga(5, 2)
}

fun tambah(nomo1:Int, nomor2:Int){
    val sum = nomo1 + nomor2
    println(sum)
}

//challenge membuat sebuah kode program mengugunakan fungsi dengan parameter menghitung luas segitiga
fun LuasSegitiga(tinggi:Int, alas:Int){
    val hitungluas = tinggi*alas/2
    println("luas segitiga adalah $tinggi dikali  alas $alas dibagi 2 hasilnya $hitungluas")
}