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
        anatomia.setOnClickListener {
            openNextActivity1()
        }
        fisiologia.setOnClickListener {
            openNextActivity2()
        }
        farmacologia.setOnClickListener {
            openNextActivity3()
        }
        nutricao.setOnClickListener {
            openNextActivity4()
        }


    }
    private fun openNextActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

        private fun openNextActivity1(){
            val intent = Intent( this, MainActivity2::class.java)
            startActivity(intent)
    }
         private fun openNextActivity2(){
        val intent = Intent( this, MainActivity3::class.java)
        startActivity(intent)
    }
    private fun openNextActivity3(){
        val intent = Intent( this, MainActivity4::class.java)
        startActivity(intent)
    }
    private fun openNextActivity4(){
        val intent = Intent( this, MainActivity5::class.java)
        startActivity(intent)
    }

}