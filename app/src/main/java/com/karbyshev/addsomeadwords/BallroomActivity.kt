package com.karbyshev.addsomeadwords

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.activity_ballroom.*

class BallroomActivity : AppCompatActivity() {
    private var danceNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ballroom)

        slowWaltzCardView.setOnClickListener(clickListener)
        tangoCardView.setOnClickListener(clickListener)
        viennesWaltzCardView.setOnClickListener(clickListener)
        foxtrotCardView.setOnClickListener(clickListener)
        quickStepCardView.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener {view ->
        when (view.id) {
            R.id.slowWaltzCardView -> danceNumber = 1
            R.id.tangoCardView -> danceNumber = 2
            R.id.viennesWaltzCardView -> danceNumber = 3
            R.id.foxtrotCardView -> danceNumber = 4
            R.id.quickStepCardView -> danceNumber = 5
        }

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DANCE, danceNumber)
        startActivity(intent)
    }
}
