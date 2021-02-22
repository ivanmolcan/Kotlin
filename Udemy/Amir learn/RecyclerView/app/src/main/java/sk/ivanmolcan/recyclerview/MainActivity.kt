package sk.ivanmolcan.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var myCountries = arrayOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCountries = arrayOf("Canada", "US", "Mexico", "Cuba", "Jamaica", "Guatemala", "Honduras", "Spain", "Canada", "US", "Mexico", "Cuba", "Jamaica", "Guatemala", "Honduras", "Spain", "Canada", "US", "Mexico", "Cuba", "Jamaica", "Guatemala", "Honduras", "Spain")

        myRv.layoutManager = LinearLayoutManager(this)
        myRv.adapter = MyAdapter(myCountries)
    }
}

class MyAdapter(private val array: Array<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
   class MyViewHolder(val textView: TextView): RecyclerView.ViewHolder (textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_item, parent,false) as TextView

        val newViewHolder = MyViewHolder(textView)
        return newViewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = array[position]
    }

    override fun getItemCount() = array.size
}