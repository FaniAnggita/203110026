package com.example.utsfanianggita

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // membaca file layout activity_home
        setContentView(R.layout.activity_home)

        // membuat variabel inviteBtn yang mana nilanya mengambil dari komponen  inviteBtn di activity_home.xml
        val inviteBtn = findViewById<Button>(R.id.inviteBtn)

        // method ini untuk membaca apakah tombol btinviteBtnnLogin sudah diklik atau belum, jika sudah akan mengerjakan blok kode di dalamnya.
        inviteBtn.setOnClickListener {
            // variabel parse url link whatsapp
            val uri = Uri.parse("http://wa.me/+6281802716686")
            // intent url
            val intent = Intent(Intent.ACTION_VIEW, uri)
            //menjalankan proses intent
            startActivity(intent)
        }

        }
    }



