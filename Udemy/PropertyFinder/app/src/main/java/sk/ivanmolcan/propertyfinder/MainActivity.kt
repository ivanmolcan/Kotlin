package sk.ivanmolcan.propertyfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    val titles: MutableList<String> = mutableListOf()
    val descriptions: MutableList<String> = mutableListOf()
    val beds = intArrayOf(3,2,1)
    val baths = intArrayOf(2,2,1)
    val years = intArrayOf(1978, 2010, 2002)

    fun populateData(){
        descriptions.add("Waterfront Acreage & a magnificent home, shop & barn. A rare and fabulous offering! A Rancher style home on a 10.94 acre property. This location could not be better. The ultimate peaceful and quiet area, yet still close to town. Dream shop and barn, fenced, great for horses. One owner. - For more info click Multimedia (20423757)")
        descriptions.add("2.98 acre property is within minutes of downtown Merritt and the Coquihalla! Zoned CR1 this fully fenced property has a 44 X 30 garage with pit for the heavy duty mechanic or ? and a 15 X 20 shed/workshop/potential guest cabin/b& b plus a 2 car carport all with metal roofs & siding. The 1296 sq ft home has been FRESHLY PAINTED and a NEW APPLIANCE PACKAGE added. The 2 bedroom, 1 full bath home has had the Electrical Upgrade (Silver Seal) done recently. There is a huge greenhouse style addition (19'7\\\" X 17'10\\\") and the most gorgeous view of the city & mountains beyond. Owner says good producing drilled well approx 150 ft deep & previous subdivision plan on file in Kamloops. 100 amp service in house & 200 amp service for the garage & workshop. With a little TLC you'll be loving your country living with a spectacular view! (21511578)\")")
        descriptions.add("LOOKING FOR PRIVACY? HERE IT IS! Beautifully landscaped paradise, with massive 338 feet frontage, peaceful and extremely private 3 acres \\\"estate\\\" in Maple Ridge. It is perfect for you and your family to come back to nature. Minutes to Whonnock Elementary, Whonnock Lake and a golf course. Enjoy your own private forest out your front and back door. This fantastic location in the heart of wilderness offers unlimited options and all privacy one could want! Truly a rare find of park-like living. The value is mostly in land with solid, clean mobile home and Large shop plus double carport. (No for sale sign on the property) (22908001)\")")

        titles.add("\$825,000")
        titles.add("\$499,900")
        titles.add("\$839,900")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateData()

        card_1_title.text = titles[0]
        card_2_title.text = titles[1]
        card_3_title.text = titles[2]

        card_1.setOnClickListener(this)
        card_2.setOnClickListener(this)
        card_3.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        val intent = Intent(this, DetailsActivity::class.java)

        var index = 0

        when(view!!.id){
            R.id.card_1 -> index = 0
            R.id.card_2 -> index = 1
            R.id.card_3 -> index = 2
        }

        val extras = Bundle()

        extras.putInt("bedsKey", beds[index])
        extras.putInt("bathsKey", baths[index])
        extras.putInt("yearsKey", years[index])
        extras.putString("titleKey", titles[index])
        extras.putString("descriptionKey", descriptions[index])

        intent.putExtras(extras)
        startActivity(intent)
    }
}