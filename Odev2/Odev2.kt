package com.example.kotlindersler.nesne_tabanli_programlama.genel

class Odev2 {
    fun fahrenheitaDonustur(celsius:Double): Double {
        var fahrenheit=celsius * 1.8 + 32
        return fahrenheit
    }

    fun dikdortgenCevresi(kisaKenar:Double, uzunKenar:Double):Double{
        var cevre = 2 * (kisaKenar + uzunKenar)
        return cevre
    }

    fun faktoriyelHesapla(sayi:Int):Int{
        var faktoriyel = 1
        for(i in 1 .. sayi){
            faktoriyel *= i
        }
        return faktoriyel
    }

    fun kacAvar(Kelime:String): Int {
        var sayac = 0
        for(i in Kelime){
            if (i.equals('a') || i.equals('A')){
                sayac++
            }
        }
        return sayac
    }


    fun icAcilarToplami(kenarSayisi:Int):Int{
        var toplam = (kenarSayisi-2) * 180
        return toplam
    }

    fun maasHesabi(gunSayisi:Int): Int {
        var maas = 0
        var saat = gunSayisi * 8
        if (saat<160){
            maas=saat*10
        }
        else if (saat>160){
            maas = ((saat-160) * 20) + (160 * 10)
        }
        return maas
    }

    fun internetHesabi(kotaMiktari:Int): Int {
        var odeme = 0
        if(kotaMiktari<=50){
            odeme = 100
        }

        else if (kotaMiktari>50){
            odeme = 100 + ((kotaMiktari-50) * 4)
        }
        return odeme
    }
}