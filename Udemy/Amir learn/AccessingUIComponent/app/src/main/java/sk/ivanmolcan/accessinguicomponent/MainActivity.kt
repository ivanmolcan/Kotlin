package sk.ivanmolcan.accessinguicomponent

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent.KEYCODE_ENTER
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

        button3.setOnClickListener{
            myView.setBackgroundColor(Color.CYAN)
        }

        myImageView.setOnClickListener {
            myImageView.setImageResource(R.drawable.aloe)
        }

        mySwitch.setOnClickListener {
            if(mySwitch.isChecked){
                mySwitchText.text = "It is ON"
            }else{
                mySwitchText.text = "It is OFF"
            }
        }

        editButton.setOnClickListener {
            val txt = editName.text.toString()
            editNameView.text = txt
        }

        //pouzitie bez buttonu ak sa stlaci enter
        editName.setOnKeyListener { v, keyCode, event ->
            if(keyCode == KEYCODE_ENTER){
                editNameView.text = editName.text
            }
            false
        }
    }

    fun newButtonFunction(v: View){
        myTextView.text = "This is Kotlin"
    }
}