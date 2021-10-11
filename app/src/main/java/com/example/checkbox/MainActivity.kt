package com.example.checkbox

import android.R.attr.data
import android.app.PendingIntent.getActivity
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    //vary
    lateinit var mleko: CheckBox
    lateinit var jajka: CheckBox
    lateinit var kawa: CheckBox
    lateinit var button: Button
    lateinit var TextV: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// s
        setContentView(R.layout.activity_main)
        title = "lista"
        mleko = findViewById(R.id.checkBox3)
        jajka = findViewById(R.id.checkBox)
        kawa = findViewById(R.id.checkBox2)
        button = findViewById(R.id.button)
        TextV = findViewById(R.id.textView)
        /*button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Wybrane przedmioty")
            if (mleko.isChecked) {
                result.append("\nMleko 3zł")
                totalAmount += 3
            }
            if (jajka.isChecked) {
                result.append("\njajka 7zł")
                totalAmount += 7
            }
            if (kawa.isChecked) {
                result.append("\nKawa 12zł")
                totalAmount += 12
            }
            result.append("\nRazem " + totalAmount + "zł")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
        */

        var totalAmount: Int = 0
        val result = StringBuilder()
        mleko.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                result.append("\nMleko 3zł")
                totalAmount += 3
                result.append("\nRazem " + totalAmount + "zł")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }



        }
        jajka.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                result.append("\njajka 7zł")
                totalAmount += 7
                result.append("\nRazem " + totalAmount + "zł")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }
        kawa.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                result.append("\nKawa 12zł")
                totalAmount += 12
                result.append("\nRazem " + totalAmount + "zł")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }

        }
        button.setOnClickListener{

        }


    }
}