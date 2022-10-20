package com.example.lr1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextString: EditText
    private lateinit var textView2: TextView
    private lateinit var textView3: TextView
    private var list: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextString = findViewById(R.id.editTextString)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
    }

    fun addToString(view: View){
        var newItem = editTextString.text.toString()
        list.add(newItem)
        editTextString.setText(null)
        textView2.append(newItem + "\n ")
    }


     fun wordsString(view: View){

        val words = Words()
        val newItem2: MutableList<String> = words.wordsString(list)

        textView3.setText(null)
        textView3.append(newItem2.toString())

    }

}


