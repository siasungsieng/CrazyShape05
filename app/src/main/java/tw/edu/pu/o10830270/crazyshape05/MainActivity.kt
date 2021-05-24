package tw.edu.pu.o10830270.crazyshape05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*


@GlideModule
public final class MyAppGlideModule : AppGlideModule()



class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val shape = intArrayOf(R.drawable.circle,R.drawable.square,R.drawable.triangle,R.drawable.star)
        val i:Int = (0..3).random()
        imgNext.setImageResource(shape[i])

        val img: ImageView = findViewById(R.id.imgTitle)
        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(img)




        Toast.makeText(baseContext, "作者：謝純善", Toast.LENGTH_LONG).show()
//
        imgNext.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {

                intent = Intent(this@MainActivity,GameAcitivity05::class.java)
                startActivity(intent)

                return true
            }
    })
imgNext.setOnClickListener(object : View.OnClickListener{
    override fun onClick(p0: View?) {
        imgNext.setImageResource(shape[i])
        recreate()
    }
})
}
}