package com.example.slotmachine.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.slotmachine.R
import com.example.slotmachine.View.Wheel.Wheel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {

        val img:ImageView = findViewById(R.id.slot1)
        val img2:ImageView = findViewById(R.id.slot2)
        val img3:ImageView = findViewById(R.id.slot3)
        val but: Button = findViewById(R.id.button)
        val wh = Wheel()

        but.setOnClickListener{

            val list = wh.startWheel()
            img.setImageResource(list[0])
            img2.setImageResource(list[1])
            img3.setImageResource(list[2])
            if(wh.checkPrize(list)){
                Toast.makeText(this,"Win Price",Toast.LENGTH_SHORT).show()
            }


        }
        super.onStart()

    }


}