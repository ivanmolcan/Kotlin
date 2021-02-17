package sk.ivanmolcan.kidsdrawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class DrawingView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var mDrawPath: CustomPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize: Float? = 0.toFloat()
    private var color = Color.BLACK




    internal inner class CustomPath(var color: Int, var brushThickness: Float ): Path() {

    }

}