package com.example.lab8nikonov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonStartYesNo.setOnClickListener {
            var intent= Intent(this,YesNoActivity::class.java)
            startActivity(intent)
            finish()
        }

        buttonStartBall.setOnClickListener {
            var intent= Intent(this,EightBallActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
