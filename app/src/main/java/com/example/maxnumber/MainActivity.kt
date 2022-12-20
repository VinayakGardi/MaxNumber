package com.example.maxnumber

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val background :ConstraintLayout =findViewById(R.id.background)
        val lftbutton : Button = findViewById(R.id.lftbutton)
        val rgtbutton : Button = findViewById(R.id.rgtbutton)

        lftbutton.setOnClickListener {
              var leftnum =lftbutton.toString().toInt()
              var rightnum =rgtbutton.toString().toInt()

             //compare numbers
              if(leftnum>rightnum)
              {
                  Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
                  background.setBackgroundColor(Color.GREEN)
              }
            else
              {
                Toast.makeText(this, "Wrond", Toast.LENGTH_SHORT).show()
                  background.setBackgroundColor(Color.RED)
              }
        }

        rgtbutton.setOnClickListener {
            var leftnum =lftbutton.toString().toInt()
            var rightnum =rgtbutton.toString().toInt()

            //compare numbers
            if(rightnum>leftnum)
            {
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(Color.GREEN)
            }
            else
            {
                Toast.makeText(this, "Wrond", Toast.LENGTH_SHORT).show()
                background.setBackgroundColor(Color.RED)
            }
        }
    }


}