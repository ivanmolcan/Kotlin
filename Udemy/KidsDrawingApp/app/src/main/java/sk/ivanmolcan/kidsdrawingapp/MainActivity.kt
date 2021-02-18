 package sk.ivanmolcan.kidsdrawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_brush_size.*
import sk.ivanmolcan.kidsdrawingapp.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {

     private lateinit var binding: ActivityMainBinding

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

         binding.drawingView.setSizeForBrush(20.toFloat())

         ib_brush.setOnClickListener {
             showBrushSizeChooserDialog()
         }
     }

     private fun showBrushSizeChooserDialog(){
         val brushDialog = Dialog(this)

         brushDialog.setContentView(R.layout.dialog_brush_size)
         brushDialog.setTitle("Brush size: ")
         val smallBtn = brushDialog.ib_small_brush
         smallBtn.setOnClickListener{
             binding.drawingView.setSizeForBrush(10.toFloat())
             brushDialog.dismiss()
         }

         val mediumBtn = brushDialog.ib_medium_brush
         mediumBtn.setOnClickListener{
             binding.drawingView.setSizeForBrush(20.toFloat())
             brushDialog.dismiss()
         }

         val largeBtn = brushDialog.ib_large_brush
         largeBtn.setOnClickListener{
             binding.drawingView.setSizeForBrush(30.toFloat())
             brushDialog.dismiss()
         }

         brushDialog.show()
     }
 }