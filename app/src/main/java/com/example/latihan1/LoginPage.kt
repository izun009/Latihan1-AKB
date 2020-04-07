package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        btnMsk.setOnClickListener {

            val input = inputKode.text.toString()

            if (input.isEmpty())
            {
                Toast.makeText(this, "Kode Harus Diisi !", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (input.length != 6){
                Toast.makeText(this, "Maksimal Kode 6 Digit Angka/Huruf", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

        btnBeli.setOnClickListener {
            Toast.makeText(this, "Belum Berfungsi", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
    }
}
