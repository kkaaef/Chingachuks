package com.example.chin_ga_chuks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var scoreUser = 0
    var scoreComp = 0
    fun choose(view: View) {
        val arr = arrayOf("Камень","Ножницы","Бумага")
        val compChoose = arr[(Math.random()*3).toInt()]
        val result = findViewById(R.id.result) as TextView
        val score = findViewById(R.id.score) as TextView
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
        result.setText("Ты выбрал \"${view.text}\" а компьютер выбрал: \"$compChoose\" \n итог: $res")
        score.setText("$scoreUser - $scoreComp")

    }
}