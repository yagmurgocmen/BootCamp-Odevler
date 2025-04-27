package com.yagmurgocmen.odevler
fun fahrenheit (derece : Int) : Double {
    return derece * 1.8 +32
}

fun cevre ( kenar1: Int, kenar2: Int) {
    println("Cevre: ${2*(kenar1+kenar2)}")
}

fun fact (sayi: Int) : Int {
    if(sayi==1){
        return 1
    }
    return sayi * fact(sayi-1)
}

fun count (metin: String) {
    var i = 0
    var counter = 0
    while(i<metin.length){
        var m1=metin[i]
        if(m1=='a'){
            counter++
        }
        i++
    }
    println("a harfinden $counter tane vardir.")
}

fun totIcAci (kenarsayisi: Int) : Int {
    return (kenarsayisi - 2) * 180
}

fun maasHesap (gun: Int) : Int {
    var saat = gun*8
    var tot = 0
    if(saat < 161){
        tot=10*saat
    }
    else {
        tot = 1600 + (saat-160) * 20
    }
    return tot
}

fun fatura (internet: Int) : Int {
    var normal = 0
    var kalan = 0
    var sonuc = 0
    if(internet>=50) {
        normal +=100
        kalan = (internet-50) * 4
        sonuc = normal + kalan
    }
    else {
        sonuc=internet*2
    }

    return sonuc
}
fun main() {
    //Fahrenhiet Testi
    val a = 4;
    println("$a derecenin fahrenheiti: ${fahrenheit(a)}")

    //Cevre Sorusu Testi
    cevre(2,3)

    //Faktoriyel Sorusu Testi
    val s1 = 7
    println("$s1 sayisinin faktoriyeli: ${fact(s1)}")

    //A sayısı Sorusu Testi
    count("Bilgisayar Teknolojileri ve Bilgi Sistemleri")

    //Iç Açılar Sorusu Testi
    println(totIcAci(6))

    //Maas Hesabı Sorusu
    val saat = 21
    println("$saat gun calisan birinin maasi ${maasHesap(saat)}")

    //Kota Sorusu Testi
    println("Toplam internet faturaniz ${fatura(54)} TL dir")

}
