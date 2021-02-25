package com.example.dicecupcompulsory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val diceId = intArrayOf(0, R.drawable.dice1,
            R.drawable.dice2,
            R.drawable.dice3,
            R.drawable.dice4,
            R.drawable.dice5,
            R.drawable.dice6)

    private val mRandomGenerator = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BtnRoll.setOnClickListener { v -> onClickRoll() }
        populateSpinner()
    }
    private fun onClickRoll(){
        val e1 = mRandomGenerator.nextInt(6) + 1
        val e2 = mRandomGenerator.nextInt(6) + 1
        val p = Pair(e1,e2)
        //update history
        // set dices
        updateDicesWith(p)
    }
    private fun updateDicesWith(p: Pair<Int, Int>) {
        imgDice1.setImageResource( diceId[p.first] )
        imgDice2.setImageResource( diceId[p.second] )
    }
    private fun populateSpinner(){
        ArrayAdapter.createFromResource(
            this,
            R.array.dices,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            SpDices.adapter = adapter

            SpDices.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?) {}
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                            when (position) {
                                0 -> {

                                }
                                1 -> {

                                }
                                2 -> {

                                }
                                3 -> {

                                }
                                4 -> {

                                }
                                5 -> {

                                }
                            }

                }
            }
        }}
}