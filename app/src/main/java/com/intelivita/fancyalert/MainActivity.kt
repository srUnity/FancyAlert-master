package com.intelivita.fancyalert

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.intelivita.customalertviewlib.FancyAlertBox
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fancyAlertBox = FancyAlertBox(this@MainActivity)

        clickMe.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var title ="Warning"
                var message = "Please check your internet connection and try again!"
                fancyAlertBox.showAlert((v!!.getParent() as ViewGroup), title, message)
            }
        })
    }
}
