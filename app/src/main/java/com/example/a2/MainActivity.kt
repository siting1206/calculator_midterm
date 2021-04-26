package com.example.a2
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.set

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt1 = findViewById<Button>(R.id.Button1)
        bt1.setOnClickListener {
           plus(it)
        }

        val bt2 = findViewById<Button>(R.id.Button2)
        bt2.setOnClickListener {
            minus(it)
        }

        val bt3 = findViewById<Button>(R.id.Button3)
        bt3.setOnClickListener {
            mul(it)
        }

        val bt4 = findViewById<Button>(R.id.Button4)
        bt4.setOnClickListener {
            div(it)
        }

        val bt_clear = findViewById<Button>(R.id.clear)
        bt_clear.setOnClickListener {
            clear(it)
        }
    }

    private fun plus(view: View) {
       val num1 = findViewById<EditText>(R.id.value1).text.toString()?.toDouble()
       val num2 = findViewById<EditText>(R.id.value2).text.toString()?.toDouble()
       val answer = num1+num2
       val output = findViewById<TextView>(R.id.answervalue)
       output.text = "%.2f".format(answer)

        //Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun minus(view: View) {
        val num1 = findViewById<EditText>(R.id.value1).text.toString()?.toDouble()
        val num2 = findViewById<EditText>(R.id.value2).text.toString()?.toDouble()
        val answer = num1-num2
        val output = findViewById<TextView>(R.id.answervalue)
        output.text = "%.2f".format(answer)

        //Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun mul(view: View) {
        val num1 = findViewById<EditText>(R.id.value1).text.toString()?.toDouble()
        val num2 = findViewById<EditText>(R.id.value2).text.toString()?.toDouble()
        val answer = num1*num2
        val output = findViewById<TextView>(R.id.answervalue)
        output.text = "%.2f".format(answer)

        //Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun div(view: View) {
        val num1 = findViewById<EditText>(R.id.value1).text.toString()?.toDouble()
        val num2 = findViewById<EditText>(R.id.value2).text.toString()?.toDouble()
        val answer = num1/num2
        val output = findViewById<TextView>(R.id.answervalue)
        output.text = "%.2f".format(answer)

        //Hide the keyboard.
        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun clear(view: View){
        val num1 = findViewById<EditText>(R.id.value1).text
        val num2 = findViewById<EditText>(R.id.value2).text
        val answer = findViewById<TextView>(R.id.answervalue)
        answer.text = ""
        num1.clear()
        num2.clear()
    }
}