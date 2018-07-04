package com.karbyshev.addsomeadwords

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import kotlinx.android.synthetic.main.activity_latin.*

class LatinActivity : AppCompatActivity() {

    private var danceNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latin)

        sambaCardView.setOnClickListener(clickListener)
        chachaCardView.setOnClickListener(clickListener)
        rumbaCardView.setOnClickListener(clickListener)
        pasodobleCardView.setOnClickListener(clickListener)
        jiveCardView.setOnClickListener(clickListener)
    }

    private val clickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.sambaCardView -> danceNumber = 6
            R.id.chachaCardView -> danceNumber = 7
            R.id.rumbaCardView -> danceNumber = 8
            R.id.pasodobleCardView -> danceNumber = 9
            R.id.jiveCardView -> danceNumber = 10
        }

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DANCE, danceNumber)
        startActivity(intent)
    }
}
