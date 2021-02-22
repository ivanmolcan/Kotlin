package sk.ivanmolcan.startactivity

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sk.ivanmolcan.startactivity.databinding.ActivityFirstBinding
import sk.ivanmolcan.startactivity.databinding.ActivityMainBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFinish.setOnClickListener{
            setResult(Activity.RESULT_OK)
            finish()
        }

    }
}