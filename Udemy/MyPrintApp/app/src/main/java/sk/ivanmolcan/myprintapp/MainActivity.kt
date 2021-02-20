package sk.ivanmolcan.myprintapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myMap = hashMapOf("name" to "Ivan", "email" to "ico@ico.sk")
        val emailIs = myMap.getValue("email")
    }

    fun myFun(v: View){
        Toast.makeText(this, "Generating Dice", Toast.LENGTH_SHORT).show()

        var counterArr = arrayOf(-1,0,0,0,0,0,0)

        for(i in 1..1_000_000){
            counterArr[Random.nextInt(1,7)]++

//            when(newDice){
//                1 -> counterArr[1]++
//                2 -> counterArr[2]++
//                3 -> counterArr[3]++
//                4 -> counterArr[4]++
//                5 -> counterArr[5]++
//                else -> counterArr[6]++
//            }
        }

        for(i in 1 until counterArr.size){
            println("MY DICE | $i is ${counterArr[i]}")
        }

    }
}