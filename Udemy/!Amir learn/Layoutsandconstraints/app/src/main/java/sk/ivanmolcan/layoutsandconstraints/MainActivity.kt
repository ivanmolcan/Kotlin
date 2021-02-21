package sk.ivanmolcan.layoutsandconstraints

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val taped: RadioButton = findViewById<RadioButton>(checkedId)
        }
        
        myCalendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val cal: Calendar = GregorianCalendar(year, month, dayOfMonth)
            val dateFormatter =  SimpleDateFormat("yyyy/MM/dd")

            Toast.makeText(this, dateFormatter.format(cal.time), Toast.LENGTH_LONG).show()
        }

        myNumberPicker.minValue = 5
        myNumberPicker.maxValue = 20
        
        myNumberPicker.wrapSelectorWheel = false
        
        myNumberPicker.setOnValueChangedListener { picker, oldVal, newVal ->
            Toast.makeText(this,"Val is: $newVal", Toast.LENGTH_LONG).show()
        }

        mySeekBar.progress = 20
        mySeekBar.max = 100
        mySeekBar.setOnSeekBarChangeListener(
                object: SeekBar.onSeekBarChangeListener{

                }
        )

    }
}