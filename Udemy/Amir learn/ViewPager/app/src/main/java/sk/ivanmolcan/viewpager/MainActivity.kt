package sk.ivanmolcan.viewpager

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val myViews: Array<Int> = arrayOf(R.layout.layout_one, R.layout.layout_two, R.layout.layout_three)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = MyAdapter (myViews, this)
    }
}

class MyAdapter (private val views: Array<Int>, private val context: Context): PagerAdapter(){
    override fun getCount(): Int = views.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val thisView = views[position]
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(thisView, container, false) as ViewGroup

        if(position ==2){
            val button = layout.findViewById<Button>(R.id.toastButton)
            button.setOnClickListener {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
            }
        }

        container.addView(layout)
        return layout
    }

    override fun destroyItem(container: ViewGroup, position: Int, view : Any) {
        container.removeView(view as View)
    }
}
