package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*
import java.util.regex.Pattern

class Profile : AppCompatActivity() {
    lateinit var Nama : EditText
    lateinit var btn : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        Nama = findViewById(R.id.textNama)
        btn = findViewById(R.id.btnSelanjutnya)

        btn.setOnClickListener {
            val nama = Nama.text.toString()
            val umur = textUmur.text.toString()

            if (nama.isEmpty() && umur.isEmpty()){
                Toast.makeText(this, "Nama Dan Umur Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (nama.isEmpty()){
                Toast.makeText(this, "Nama Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            } else if (umur.isEmpty()){
                Toast.makeText(this, "Umur Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Home::class.java)
            intent.putExtra("Nama", nama)
            startActivity(intent)
        }
    }
}
