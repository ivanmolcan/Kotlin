package sk.ivanmolcan.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

interface OnRemoveButtonTapListener{
    fun onRemoveButtonTapped()
}

class MyFragment : Fragment() {

    private lateinit var caller: OnRemoveButtonTapListener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val fragmentView: View = inflater.inflate(R.layout.fragment_my, container, false)

        val myButton = fragmentView.findViewById<Button>(R.id.removeButton)

        myButton.setOnClickListener {
            caller.onRemoveButtonTapped()
        }

        return fragmentView
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        if(context is OnRemoveButtonTapListener){
            caller = context
        }
    }

    companion object {

        fun newInstance() : MyFragment{
            return MyFragment()
        }

    }
}