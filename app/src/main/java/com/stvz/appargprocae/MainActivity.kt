package com.stvz.appargprocae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editText1 = findViewById<EditText>(R.id.editText)
        val editText2 = findViewById<EditText>(R.id.editText1)
        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)

        button.setOnClickListener {
            val palabra1 = editText1.text.toString()
            val palabra2 = editText2.text.toString()

            if (palabra1 == palabra2) {
                resultadoTextView.text = "Las palabras son iguales"
            } else {
                resultadoTextView.text = "Las palabras son diferentes"
            }
        }
    }
}