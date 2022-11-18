package com.example.chin_ga_chuks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var score: TextView? = null
    private var name = ""
    companion object {
        const val USER_NAME: String = ""

    }
    private var scoreUser = 0
    private var scoreComp = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        name = intent.getStringExtra(USER_NAME).toString()
        score = findViewById<TextView>(R.id.score)
        score?.setText("$name: $scoreUser -  Computer: $scoreComp")
    }



    fun choose(view: View) {
        var result = findViewById<TextView>(R.id.result)
        val arr = arrayOf("Камень","Ножницы","Бумага")
        val compChoose = arr[(Math.random()*3).toInt()]
        view as Button
        var res =""
        if (view.text =="Бумага" && compChoose == "Камень"){
            res="Ты выиграл"
            scoreUser+=1 }
        else if (view.text =="Ножницы" && compChoose == "Бумага"){
            res="Ты выиграл"
            scoreUser+=1
        }
        else if (view.text =="Камень" && compChoose == "Ножницы"){
            res="Ты выиграл"
            scoreUser+=1
        }
        else if (view.text == compChoose){res="Ничья"}
        else{
            res="Ты проиграл"
            scoreComp+=1}
        result?.text = "Ты выбрал \"${view.text}\" а компьютер выбрал: \"$compChoose\" \n итог: $res"
        score?.text = "$name: $scoreUser -  Computer: $scoreComp"

    }
    fun sendResult(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_TEXT, score?.text)
        startActivity(intent)
        }
}