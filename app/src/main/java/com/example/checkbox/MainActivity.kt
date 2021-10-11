package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //vary
    lateinit var mleko: CheckBox
    lateinit var jajka: CheckBox
    lateinit var kawa: CheckBox
    lateinit var button: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)// s
        setContentView(R.layout.activity_main)
        title="lista"
        mleko=findViewById(R.id.checkBox3)
        jajka=findViewById(R.id.checkBox)
        kawa=findViewById(R.id.checkBox2)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Wybrane przedmioty")
            if(mleko.isChecked){
                result.append("\nMleko 50")
                totalAmount += 50
            }
            if(jajka.isChecked){
                result.append("\njajka 75")
                totalAmount += 75
            }
            if(kawa.isChecked){
                result.append("\nKawa 100")
                totalAmount += 100
            }
            result.append("\nTotal: " + totalAmount + "Rs")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }

    }
}//s