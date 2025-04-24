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



}
