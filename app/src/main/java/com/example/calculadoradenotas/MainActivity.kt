package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.imulogia_activity.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.imulogia_activity)

          val btCalcular  = calcular
          val resultado = resultado

          btCalcular.setOnClickListener {
              val nota1 = Integer.parseInt(nota1.text.toString())
              val nota2 = Integer.parseInt(nota2.text.toString())
              val media = (nota1 + nota2)/2
              val faltas = Integer.parseInt(faltas.text.toString())

              if (media >=6 && faltas <=10){
                  resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                  resultado.setTextColor(Color.GREEN)
              }
              else{
                  resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                  resultado.setTextColor(Color.RED)
              }
          }

        }
    }

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.anatomia_activity)

        val btCalcular  = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media ==10 && faltas ==0){
                resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }

}

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fisiologia_activity)

        val btCalcular  = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=8 && faltas <=5){
                resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }

}


class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.farmacologia_activity)

        val btCalcular  = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=9 && faltas <=1){
                resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }

}

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nutricao_activity)

        val btCalcular  = calcular
        val resultado = resultado

        btCalcular.setOnClickListener {
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=6 && faltas <=10){
                resultado.setText("Aluno Foi Aprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }
            else{
                resultado.setText("Aluno Foi Reprovado" + "\n" + "Nota Final:" + media+"\n"+ "Faltas:"+faltas)
                resultado.setTextColor(Color.RED)
            }
        }

    }

}