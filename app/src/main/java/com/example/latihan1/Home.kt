package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var i = intent
        val text = i.getStringExtra("Nama")

        val hasil = findViewById<TextView>(R.id.textKamu)
        hasil.text = "Beres! Sekarang "+text+" udah bisa ngecek penggunaan HP "+text+" tiap hari buat bantu "+text+" ngatur waktu :)"


        btnOke.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
