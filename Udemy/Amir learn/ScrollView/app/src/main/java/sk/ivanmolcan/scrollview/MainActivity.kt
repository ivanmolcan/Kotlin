package sk.ivanmolcan.scrollview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            addToLinearLayout()
        }
    }

    fun addToLinearLayout (){
        val newTextView = TextView(this)

        val params = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        params.setMargins(0,10,0,10)
        newTextView.layoutParams = params
        newTextView.text = "Hello"
        newTextView.textSize = 24F
        newTextView.gravity = Gravity.CENTER
        newTextView.setPadding(20,20,20,20)
        newTextView.setBackgroundColor(Color.GRAY)
        newTextView.setTextColor(Color.WHITE)

        linearLayout.addView(newTextView)
    }
}