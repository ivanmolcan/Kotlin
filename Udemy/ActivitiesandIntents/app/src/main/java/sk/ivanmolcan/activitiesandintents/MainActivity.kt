package sk.ivanmolcan.activitiesandintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greenBtn.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)

            intent.putExtra("myKey", "Hi from Main")

            startActivity(intent)
        }

        nextBtn.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)

            startActivity(intent)
        }

    }
}