package com.example.chin_ga_chuks
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainPageActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page)
    }
    fun openGame(view: View){
        val nameText = findViewById<EditText>(R.id.name)
        val name = nameText.text.toString()
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(MainActivity.USER_NAME, name)
        startActivity(intent)
    }
}