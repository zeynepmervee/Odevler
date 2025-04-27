package com.zeynepmervekoyuncu.kotlindersleri2.OOP;

public class Odev2 {

    fun fahrenheit(celcius: Double) : Double {
        return celcius*1.8+32
    }

    fun cevreHesapla(a:Double,b:Double) : Double {
        return 2*(a+b)
    }

    fun faktoriyel(n:Int) : Long {
        return if (n <= 1) 1L else n * faktoriyel(n-1)
    }

    fun aHarfi(kelime:String) : Int {
        return kelime.count { it == 'a' || it == 'A' }
    }

    fun icAcilarToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        var maas = 0
        if (toplamSaat <= 160) {
            maas = toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            maas = (160 * 10) + (mesaiSaat * 20)
        }
        return maas
    }

    fun kotaUcretiHesapla(gb: Int): Int {
        return if (gb <= 50) {
            100
        } else {
            val asim = gb - 50
            100 + (asim * 4)
        }
    }
}

fun main() {
    val odev = Odev2()

    println(
        "25.5 Celsius = ${odev.fahrenheit(25.5)} Fahrenheit\n" +
                "kenarları 5 ve 10 olan dikdörtgenin çevresi: ${odev.cevreHesapla(5.1, 10.3)}\n" +
                "5! = ${odev.faktoriyel(5)}\n" +
                "a sayısı: ${odev.aHarfi("Kotlini kolayca öğreniyorum")}\n" +
                "altıgenin iç açılar toplamı : ${odev.icAcilarToplami(6)}\n" +
                "200 gün çalışan biri ${odev.maasHesapla(200)} tl kazanır\n" +
                "64GB harcayan biri ${odev.kotaUcretiHesapla(64)} tl öder\n"
    )



}