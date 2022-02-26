package com.example.febproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var Buttonadd:Button
    lateinit var Buttonsubtract:Button
    lateinit var Buttonmultiply:Button
    lateinit var Buttondivide:Button
    lateinit var Textanswer:TextView
    lateinit var Firstnum:EditText
    lateinit var Secondnum:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        Buttonadd=findViewById(R.id.Btn_add)
        Buttonsubtract=findViewById(R.id.Btn_subtract)
        Buttonmultiply=findViewById(R.id.Btn_multiply)
        Buttondivide=findViewById(R.id.Btn_division)
        Textanswer=findViewById(R.id.txt_answer)
        Firstnum=findViewById(R.id.Edt_firstnum)
        Secondnum=findViewById(R.id.Edt_secondnum)
        Buttonadd!!.setOnClickListener {

            var Fnum =Firstnum.text.toString()
            var Snum=Secondnum.text.toString()
            if (Fnum.isEmpty() or  Snum.isEmpty()){
                 Textanswer.text ="please fill in all the inputs"
            }else{
                var answer =Fnum.toDouble() + Snum.toDouble()
                Textanswer.text=answer.toString()
            }
        }
        Buttonsubtract!!.setOnClickListener {

            var Fnum =Firstnum.text.toString()
            var Snum=Secondnum.text.toString()
            if (Fnum.isEmpty() or  Snum.isEmpty()){
                Textanswer.text ="please fill in all the inputs"
            }else{
                var answer=Fnum.toDouble() - Snum.toDouble()
                Textanswer.text=answer.toString()
            }

        }
        Buttonmultiply!!.setOnClickListener {

            var Fnum =Firstnum.toString()
            var Snum=Secondnum.toString()
            if (Fnum.isEmpty() or  Snum.isEmpty()){
                Textanswer.text ="please fill in all the inputs"
            }else{
                var answer=Fnum.toDouble() * Snum.toDouble()
                Textanswer.text=answer.toString()
            }

        }
        Buttondivide!!.setOnClickListener {

            var Fnum =Firstnum.toString()
            var Snum=Secondnum.toString()
            if (Fnum.isEmpty() or Snum.isEmpty()){
                Textanswer.text ="please fill in all the inputs"
            }else{
                var answer=Fnum.toDouble() / Snum.toDouble()
                Textanswer.text=answer.toString()
            }

        }

    }
}