package sk.ivanmolcan.recyclerviewinfragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val frag = inflater.inflate(R.layout.fragment_my, container, false)

        val recycleView = frag.findViewById<RecyclerView>(R.id.recyclerView)
        recycleView.layoutManager = LinearLayoutManager(activity as Context)

        val items = arrayOf("Canada", "USA", "Mexico", "Chile")

        recycleView.adapter = MyAdapter(items)

        return frag
    }

    companion object {
        fun newInstance() : MyFragment{
            return MyFragment()
        }
    }

    class MyViewHolder (inflater: LayoutInflater, parent: ViewGroup) :
            RecyclerView.ViewHolder(inflater.inflate(R.layout.row,parent,false))

    internal inner class MyAdapter(private val array: Array<String>): RecyclerView.Adapter<MyViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return MyViewHolder(inflater ,parent)
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            (holder.itemView as TextView).text = array[position]
        }

        override fun getItemCount() = array.size
    }
}