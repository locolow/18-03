package com.example.a18_03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM_NOME = "nome";


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Formulario")
    }

    fun sendText(view: View) {
        val editText = findViewById<EditText>(R.id.et1)
        val textView = findViewById<TextView>(R.id.tv1)

        if (editText.text.toString() == "") {
            Toast.makeText(this, "Please fill the edit text", Toast.LENGTH_SHORT).show()
        } else {
            textView.setText(editText.text)
            //textView.text = editText.text
        }
    }

    fun nextPage(view: View) {
        val editText = findViewById<EditText>(R.id.et1)
        val intent = Intent(this, DashboardActivity::class.java).apply {
            putExtra(PARAM_NOME,editText.text.toString())
        }

    startActivity(intent)

    }
}