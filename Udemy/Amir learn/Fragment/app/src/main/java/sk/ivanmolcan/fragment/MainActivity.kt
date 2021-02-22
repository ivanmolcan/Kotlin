package sk.ivanmolcan.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnRemoveButtonTapListener {

    override fun onRemoveButtonTapped() {
        val frag = supportFragmentManager.findFragmentByTag("MyTag")
        supportFragmentManager.beginTransaction().remove(frag!!).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(savedInstanceState == null){
                supportFragmentManager
                    .beginTransaction()
                    .add(
                        R.id.fragmentContainer,
                        MyFragment.newInstance(),
                        "MyTag"
                    ).commit()
            }
        }
    }
}