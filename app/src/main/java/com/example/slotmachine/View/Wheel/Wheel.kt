package com.example.slotmachine.View.Wheel

import android.widget.ImageView
import com.example.slotmachine.R
import java.util.*
import kotlin.random.Random



class Wheel {

    companion object {
        val images = mutableListOf<Int>(R.drawable.limon,R.drawable.seven, R.drawable.pineapple, R.drawable.watermelon)
    }

    fun startWheel(): List<Int> {
        return List(3){ images[Random.nextInt(0,4)]}

    }

    fun checkPrize(list:List<Int>): Boolean {
        return list.toSet().size==1

    }
}