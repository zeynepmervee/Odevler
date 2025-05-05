package com.zeynepmervekoyuncu.hesapmakinesi

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.zeynepmervekoyuncu.hesapmakinesi.R

class MainActivity : AppCompatActivity() {
    private lateinit var textViewSonuc: TextView
    private var girilenSayi = ""
    private var toplam = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewSonuc = findViewById(R.id.textViewSonuc)

        val sayiButonlari = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )

        // Sayı tuşlarına tıklama
        for (id in sayiButonlari) {
            findViewById<Button>(id).setOnClickListener {
                val sayi = (it as Button).text.toString()
                girilenSayi += sayi
                textViewSonuc.text = girilenSayi
            }
        }

        // Toplama tuşu
        findViewById<Button>(R.id.btnTopla).setOnClickListener {
            if (girilenSayi.isNotEmpty()) {
                toplam += girilenSayi.toInt()
                girilenSayi = ""
                textViewSonuc.text = "+"
            }
        }

        // = tuşu
        findViewById<Button>(R.id.btnEsit).setOnClickListener {
            if (girilenSayi.isNotEmpty()) {
                toplam += girilenSayi.toInt()
                girilenSayi = ""
            }
            textViewSonuc.text = toplam.toString()
        }

        // C (temizle) tuşu
        findViewById<Button>(R.id.btnTemizle).setOnClickListener {
            girilenSayi = ""
            toplam = 0
            textViewSonuc.text = "0"
        }
    }
}
