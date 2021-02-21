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

        fetchData()
    }

    fun fetchData() {

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


        val images = extras.getIntegerArrayList("imagesKey")
        var index = 0
        imageView.setImageResource(images!![index])

        imageView.setOnClickListener{
            index++
            showNextImage(index, images)
        }
    }

    fun showNextImage(index: Int, imageArr: ArrayList<Int>){
        var mIndex = index
        if(mIndex == imageArr.size){
            mIndex = 0
        }
        imageView.setImageResource(imageArr[index])
    }
}