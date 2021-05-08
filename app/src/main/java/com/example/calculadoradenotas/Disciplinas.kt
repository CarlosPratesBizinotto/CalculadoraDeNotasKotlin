package com.example.calculadoradenotas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_disciplinas.*

class Disciplinas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        imunologia.setOnClickListener {
            openNextActivity()
        }

    }
    private fun openNextActivity(){
        val intent = Intent( this, MainActivity::class.java)
        startActivity(intent)
    }
}