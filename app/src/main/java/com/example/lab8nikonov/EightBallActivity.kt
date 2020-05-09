package com.example.lab8nikonov

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_yes_no.*
import kotlin.math.floor
import kotlin.random.Random

class EightBallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes_no)

        var answers= arrayOf("NO","Unlikely","Miracle would not occur","Maybe","With some luck","Likely","<VERY POSSIBLE>","With certainty")

        buttonAnswer.setOnClickListener {
            var alpha= Random.nextDouble()
            answerLabel.visibility= View.VISIBLE
            answerText.text=answers[floor(alpha*answers.size).toInt()]
            answerText.visibility=View.VISIBLE
            buttonAnswer.visibility= View.INVISIBLE
        }

        buttonBack.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
