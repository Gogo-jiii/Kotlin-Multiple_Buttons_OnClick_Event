package com.example.multiplebuttonsonclickevent

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mutiplebuttonsclickevent.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.button1 -> Toast.makeText(this@MainActivity, "ONE", Toast.LENGTH_LONG).show()
            R.id.button2 -> Toast.makeText(this@MainActivity, "TWO", Toast.LENGTH_LONG).show()
            R.id.button3 -> Toast.makeText(this@MainActivity, "THREE", Toast.LENGTH_LONG).show()
        }
    }
}