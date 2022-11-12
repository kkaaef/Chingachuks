package com.example.chin_ga_chuks

import android.content.Intent
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
    companion object {
        const val USER_NAME: String = ""
    }
    var scoreUser = 0
    var scoreComp = 0
    @Override
    fun choose(view: View) {
        val name = intent.getStringExtra(USER_NAME)
        val arr = arrayOf("Камень","Ножницы","Бумага")
        val compChoose = arr[(Math.random()*3).toInt()]
        val result = findViewById<TextView>(R.id.result)
        val score = findViewById<TextView>(R.id.score)
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
        score.setText("$name: $scoreUser -  Computer: $scoreComp")

    }


}