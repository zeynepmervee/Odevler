package com.zeynepmervekoyuncu.tasarimodevi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.RatingBar
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var textViewBilgi: TextView
    private lateinit var buttonUrunEkle: Button
    private lateinit var editTextUrunAdi: EditText
    private lateinit var switchStokta: Switch
    private lateinit var ratingBarPuan: RatingBar
    private lateinit var progressBar: ProgressBar

    private var urunSayisi = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewBilgi = findViewById(R.id.textViewBilgi)
        buttonUrunEkle = findViewById(R.id.buttonUrunEkle)
        editTextUrunAdi = findViewById(R.id.editTextUrunAdi)
        switchStokta = findViewById(R.id.switchStokta)
        ratingBarPuan = findViewById(R.id.ratingBarPuan)
        progressBar = findViewById(R.id.progressBar)

        buttonUrunEkle.setOnClickListener {
            val urunAdi = editTextUrunAdi.text.toString()
            val stokDurumu = if (switchStokta.isChecked) "Stokta var" else "Stokta yok"
            val puan = ratingBarPuan.rating.toInt()

            if (urunAdi.isNotEmpty()) {
                progressBar.visibility = View.VISIBLE
                urunSayisi++

                textViewBilgi.text = "➤ Ürün: $urunAdi\n" +
                        "➤ Durum: $stokDurumu\n" +
                        "➤ Puan: $puan yıldız\n" +
                        "➤ Toplam Sepet: $urunSayisi ürün"

                progressBar.visibility = View.GONE
            } else {
                textViewBilgi.text = "Lütfen ürün adını girin!"
            }
        }
    }
}
