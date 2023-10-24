package com.example.check

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val check=findViewById<Button>(R.id.btn_check)
        val word=findViewById<EditText>(R.id.et_check)
        val text=findViewById<TextView>(R.id.txt_check)
        check.setOnClickListener(View.OnClickListener {
            val et = word.editableText.toString().toLowerCase()
            if (et.equals("")){
                val toast = Toast.makeText(applicationContext, "enter to text", Toast.LENGTH_LONG)
                toast.show()


            }
            else if (et.equals("welcome"))
            {
                text.text="Welcome"
                val toast2 = Toast.makeText(applicationContext, "Congratulations", Toast.LENGTH_LONG)
                toast2.show()
            }
            else
            {
                val toast3 = Toast.makeText(applicationContext, "failed", Toast.LENGTH_LONG)
                toast3.show()
            }
        })
    }
}