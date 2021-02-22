package sk.ivanmolcan.scrollviewevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.abs

class MainActivity : AppCompatActivity() {

    var scrolling = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scrollView.setOnScrollChangeListener {view, curX, curY, oldX, oldY ->

        scrolling = abs(curY - oldY) > 2

            if(!scrolling){
                Toast.makeText(this, "Ended", Toast.LENGTH_SHORT).show()
            }

        }
    }
}