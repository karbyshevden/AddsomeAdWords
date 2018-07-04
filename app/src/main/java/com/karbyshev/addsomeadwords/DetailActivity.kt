package com.karbyshev.addsomeadwords

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    lateinit var mAdView: AdView

    private var image: Int = 0
    private var historyText = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        mAdView = findViewById(R.id.adViewLatin)
        val adRequest = AdRequest.Builder()
                .addTestDevice("A1971963E261767D18E086F7CD5A28B4")
                .build()
        mAdView.loadAd(adRequest)

        val danceNumber: Int = intent.getIntExtra(DANCE, 0)

        when (danceNumber){
            1 -> {
                image = R.drawable.waltz
                historyText = R.string.waltz
            }

            2 -> {
                image = R.drawable.tango
                historyText = R.string.tango
            }

            3 -> {
                image = R.drawable.v_waltz
                historyText = R.string.viennese_waltz
            }

            4 -> {
                image = R.drawable.foxtrot
                historyText = R.string.foxtrot
            }

            5 -> {
                image = R.drawable.quickstep
                historyText = R.string.quickstep
            }

            6 -> {
                image = R.drawable.samba
                historyText = R.string.samba
            }

            7 -> {
                image = R.drawable.chacha
                historyText = R.string.cha
            }

            8 -> {
                image = R.drawable.rumba
                historyText = R.string.rumba
            }

            9 -> {
                image = R.drawable.paso
                historyText = R.string.paso
            }

            10 -> {
                image = R.drawable.jive
                historyText = R.string.jive
            }

        }

        Picasso.get().load(image).into(detailImageView)
        aboutTextView.setText(historyText)
    }
}
