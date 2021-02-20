package sk.ivanmolcan.accessinguicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView.text = "Kotlin"

        val resTxtView: TextView = findViewById(R.id.myTextView)
        resTxtView.text = "Kotlin2"

        myButton.setOnClickListener{
            myTextView.text = "Hurray"
        }
    }

    fun newButtonFunction(v: View){
        myTextView.text = "This is Kotlin"
    }
}