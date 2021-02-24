package sk.ivanmolcan.recyclerviewinfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container,
                    MyFragment.newInstance(),
                    "myRv").commit()
        }
    }
}