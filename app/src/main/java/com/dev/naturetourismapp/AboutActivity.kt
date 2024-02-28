package com.dev.naturetourismapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val photoImageView = findViewById<ImageView>(R.id.img_profile)
        val nameTextView = findViewById<TextView>(R.id.tv_name)
        val emailTextView = findViewById<TextView>(R.id.tv_email)

        nameTextView.text = getString(R.string.namalengkap)
        emailTextView.text = getString(R.string.email)
        photoImageView.setImageResource(R.drawable.profil)
    }
}
