package com.example.febproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var Buttoncalc:Button ?=null
    var ButtonIntent:Button ?=null
    var ButtonWeb:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Buttoncalc=findViewById(R.id.BtnCalc)
        ButtonIntent=findViewById(R.id.Btn_intent)
        ButtonWeb=findViewById(R.id.Btn_web)
        Buttoncalc!!.setOnClickListener {
            val intent=Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }
        ButtonIntent!!.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }
        ButtonWeb!!.setOnClickListener {
            val intent =Intent(this,WebActivity::class.java)
            startActivity(intent)
        }
    }
}