package com.dev.naturetourismapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailNatureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_nature)

        val titleTextView = findViewById<TextView>(R.id.tv_detail_nature_title)
        val descriptionTextView = findViewById<TextView>(R.id.tv_detail_nature_description)
        val imageView = findViewById<ImageView>(R.id.img_detail_nature_photo)

        // Terima data yang dikirim dari MainActivity
        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")
        val photo = intent.getIntExtra("photo", 0)

        // Tampilkan data di halaman detail
        titleTextView.text = title
        descriptionTextView.text = description
        imageView.setImageResource(photo)
    }
}
