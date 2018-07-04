package com.karbyshev.addsomeadwords

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Picasso.get().load(R.drawable.ballroom).into(ballroomImageView)
        Picasso.get().load(R.drawable.latin).into(latinImageView)

        ballroomCardView.setOnClickListener {
            val intent = Intent(this, BallroomActivity::class.java)
            startActivity(intent)
        }

        latinCardView.setOnClickListener {
            val intent = Intent(this, LatinActivity::class.java)
            startActivity(intent)
        }
    }
}