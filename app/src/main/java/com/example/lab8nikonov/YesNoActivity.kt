package com.example.lab8nikonov

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_yes_no.*
import kotlin.random.Random

class YesNoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yes_no)
        val yesChance=0.5
        buttonAnswer.setOnClickListener {
            var alpha= Random.nextDouble()
            if (alpha<yesChance)
            {
                answerLabel.visibility= View.VISIBLE
                answerText.setBackgroundColor(Color.GREEN)
                answerText.text="YES!"
            }
            else
            {
                answerLabel.visibility= View.VISIBLE
                answerText.setBackgroundColor(Color.RED)
                answerText.text="NO!"
            }
            answerText.visibility=View.VISIBLE
            buttonAnswer.visibility=View.INVISIBLE
        }

        buttonBack.setOnClickListener {
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
