package sk.ivanmolcan.propertyfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        backButton.setOnClickListener {
            finish()
        }

        val intent = intent
        val extras: Bundle? = intent.extras

        val title: String? = extras!!.getString("titleKey")
        titleTextView.text = title

        val description: String? = extras!!.getString("descriptionKey")
        descriptionTextView.text = description

        val beds: Int = extras.getInt("bedsKey")
        bedroomsTextView.text = beds.toString()

        val baths: Int = extras.getInt("bathsKey")
        bathroomsTextView.text = baths.toString()

        val years: Int = extras.getInt("yearsKey")
        yearsTextView.text = years.toString()



    }
}