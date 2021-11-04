package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView

    private var operand: Double = 0.0

    private var operation: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun numberClicked(clickedView: View) {

        if(clickedView is TextView) {
            var result = resultTextView.text.toString()
            val number = clickedView.text.toString()

            if (result == "0") {
                result == ""
            }


            resultTextView.text = result +  number


        }
    }
    fun operationClick(clickedView: View) {
        if(clickedView is TextView) {
            val result: String = resultTextView.text.toString()

            if(result.isNotEmpty()) {
                operand = result.toDouble()

            }

            operation = clickedView.text.toString()
            resultTextView.text = ""

        }
    }

    fun equalsClick(clickedView: View) {

        val secOperandText: String = resultTextView.text.toString()
        var secOperand: Double = 0.0
        if(secOperandText.isNotEmpty()) {
            secOperand =  secOperandText.toDouble()

        }

        when(operation) {
            "+" -> resultTextView.text = (operand + secOperand).toString()
            "-" -> resultTextView.text = (operand - secOperand).toString()
            "*" -> resultTextView.text = (operand * secOperand).toString()
            "/" -> resultTextView.text = (operand / secOperand).toString()
            "√" -> resultTextView.text = (kotlin.math.sqrt(operand)).toString()
            "C" -> resultTextView.text = ""
            "^" -> resultTextView.text = (operand.pow(secOperand)).toString()


        }
    }
}