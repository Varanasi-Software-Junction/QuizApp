package com.varanasisoftwarejunction.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var questions = emptyArray<Question>()
    var start:Int=0
    var current:Int=-1
    var end:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        questions=QuestionSupplier.GetQuestions()
        start=0
        end=questions.size-1
        setContentView(R.layout.activity_main)
        val bttnleft=findViewById<Button>(R.id.bttnLeft)
        val bttnsubmit=findViewById<Button>(R.id.bttnSubmit)
        val bttnright=findViewById<Button>(R.id.bttnRight)
        bttnleft.setOnClickListener(View.OnClickListener { goLeft() })
        bttnsubmit.setOnClickListener(View.OnClickListener { doSubmit() })
        bttnright.setOnClickListener(View.OnClickListener { goRight() })
    }
    fun goLeft()
    {
if(current<=start)
{
    shoWToast("No more questions")
    return
}
        current--
        var currentquestion:Question=questions[current]
        val tv:TextView=findViewById<TextView>(R.id.textView)
        val rd1:RadioButton=findViewById<RadioButton>(R.id.rd1)
        val rd2:RadioButton=findViewById<RadioButton>(R.id.rd2)
        val rd3:RadioButton=findViewById<RadioButton>(R.id.rd3)
        val rd4:RadioButton=findViewById<RadioButton>(R.id.rd4)
        tv.text=currentquestion.question
        rd1.text=currentquestion.opta
        rd2.text=currentquestion.optb
        rd3.text=currentquestion.optc
        rd4.text=currentquestion.optd
    }
    fun doSubmit()
    {
        val rd1:RadioButton=findViewById<RadioButton>(R.id.rd1)
        val rd2:RadioButton=findViewById<RadioButton>(R.id.rd2)
        val rd3:RadioButton=findViewById<RadioButton>(R.id.rd3)
        val rd4:RadioButton=findViewById<RadioButton>(R.id.rd4)

        var option:Int=0
        if(rd1.isChecked)
            option=1
        if(rd2.isChecked)
            option=2
        if(rd3.isChecked)
            option=3
        if(rd4.isChecked)
            option=4
        shoWToast("You selected option " + option.toString())

    }
    fun goRight()
    {
        if(current>=end)
        {
            shoWToast("No more questions")
            return
        }
        current++
        var currentquestion:Question=questions[current]
        val tv:TextView=findViewById<TextView>(R.id.textView)
        val rd1:RadioButton=findViewById<RadioButton>(R.id.rd1)
        val rd2:RadioButton=findViewById<RadioButton>(R.id.rd2)
        val rd3:RadioButton=findViewById<RadioButton>(R.id.rd3)
        val rd4:RadioButton=findViewById<RadioButton>(R.id.rd4)
        val bttnsubmit=findViewById<Button>(R.id.bttnSubmit)
        rd1.visibility=View.VISIBLE
        rd2.visibility=View.VISIBLE
        rd3.visibility=View.VISIBLE
        rd4.visibility=View.VISIBLE
        bttnsubmit.visibility=View.VISIBLE
        tv.text=currentquestion.question
        rd1.text=currentquestion.opta
        rd2.text=currentquestion.optb
        rd3.text=currentquestion.optc
        rd4.text=currentquestion.optd
    }
fun shoWToast(message:String)
{
    Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
}
}