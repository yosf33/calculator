package com.example.calculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var one: Button
    lateinit var two: Button
    lateinit var three: Button
    lateinit var four: Button
    lateinit var five: Button
    lateinit var six: Button
    lateinit var seven: Button
    lateinit var eight: Button
    lateinit var nine: Button
    lateinit var multiply: Button
    lateinit var divide: Button
    lateinit var sum: Button
    lateinit var subtract: Button
    lateinit var equal: Button
    lateinit var screen: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        multiply = findViewById(R.id.multiply)
        subtract = findViewById(R.id.subtract)
        divide = findViewById(R.id.divide)
        subtract = findViewById(R.id.subtract)
        screen = findViewById(R.id.screen)
    }

    fun click(view: View) {
        val button = view as Button
        val currentText = screen.text.toString()
        val newText = if (currentText.isNotEmpty()) {
            currentText + button.text
        } else {
            button.text
        }
        screen.text = newText
    }

    fun equality(view: View) {
        val numbers = screen.text.split('+', '-', 'x', '/')
        val firstNumber = numbers[0].toInt()
        val secondNumber = numbers[1].toInt()
        var result: Int=0

        if (screen.text.contains('+'))
            result = firstNumber + secondNumber
        else if (screen.text.contains('-'))
            result = firstNumber - secondNumber
        else if (screen.text.contains('x'))
            result = firstNumber * secondNumber
        else if (screen.text.contains('/'))
            result = firstNumber / secondNumber

        screen.text = result.toString()


    }

}