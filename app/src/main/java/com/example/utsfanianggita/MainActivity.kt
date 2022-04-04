package com.example.utsfanianggita

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // menonaktifkan title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE)

        // membaca file layout activity_main
        setContentView(R.layout.activity_main)

        // membuat variabel yang mana nilanya mengambil dari komponen activity_main.xml
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val userName = findViewById<EditText>(R.id.edtUserName)
        val password = findViewById<EditText>(R.id.edtPassword)

        // method ini untuk membaca apakah tombol btnLogin sudah diklik atau belum, jika sudah akan mengerjakan blok kode di dalamnya.
        btnLogin.setOnClickListener {
            // kondisi untuk mengecek apakah isi dari variabel userName = admin dan password = admin, jika kedua kondisi benar akan menjalankana blok kode di dalamnya.
            if (userName.text.toString() == "admin" && password.text.toString() == "admin") {
                // Intent ini untuk membuka kelas HomeActivity
                startActivity(Intent(this, HomeActivity::class.java))
                // memanmpikan toast "Login Success!"
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
            }
            // jika kondisi if di atas salah, maka blok kode else akan dijalankan.
            else {
                // memanmpikan toast "Login Failed!"
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }

        }

    }



