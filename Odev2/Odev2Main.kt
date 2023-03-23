package com.example.kotlindersler.nesne_tabanli_programlama.genel

fun main(){
    var f = Odev2()

    var fahrenheit = f.fahrenheitaDonustur(10.0)
    println("Fahrenheit : ${fahrenheit}")

    var dikdortgenCevresi = f.dikdortgenCevresi(5.0,12.0)
    println("Dikdörtgen Çevresi : ${dikdortgenCevresi}")

    var faktoriyelSonuc = f.faktoriyelHesapla(5)
    println("Faktöriyel : ${faktoriyelSonuc}")

    var aHarfiSayisi = f.kacAvar("Ann ava")
    println("Stringteki a harfi sayısı : ${aHarfiSayisi}")

    var icAcilarToplami = f.icAcilarToplami(5)
    println("İç Açılar Toplamı : ${icAcilarToplami}")

    var hesaplananMaas = f.maasHesabi(25)
    println("Hesaplanan Maaş : ${hesaplananMaas}₺")

    var hesaplananInternet = f.internetHesabi(80)
    println("Hesaplanan İnternet Ödemesi : ${hesaplananInternet} ₺")
}