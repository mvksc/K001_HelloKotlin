package m.vk.k001_hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIsKotlin.setOnClickListener(this)
        btnIsJava.setOnClickListener{
            tvShowText.text = "Hello Java."
        }

    }

    override fun onClick(v: View?) {
       if (v == btnIsKotlin){
           tvShowText.text = "Hello Kotlin."
       }
    }
}
