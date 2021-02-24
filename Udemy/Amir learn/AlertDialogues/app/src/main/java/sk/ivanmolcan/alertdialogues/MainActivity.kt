package sk.ivanmolcan.alertdialogues

import android.app.Dialog
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        customBtn.setOnClickListener {
            val customDialog = Dialog(this)
            customDialog.setContentView(R.layout.custom_alert_layout)
            customDialog.show()
        }

        defaultBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Enter a color")
            builder.setTitle("BG Color")

            val color = EditText(this)
            builder.setView(color)

            builder.setPositiveButton("Save"){ dialog, _ ->
                if(color.text.toString() == "red"){
                   rootLayout.setBackgroundColor(Color.RED)
                }
            }

            builder.setNegativeButton("Cancel"){ dialog, _ ->

            }

            builder.setNeutralButton("Non"){ dialog, _ ->

            }

            val dialog = builder.create()
            dialog.show()
        }
    }
}