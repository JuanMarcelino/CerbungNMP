package com.ubaya.cerbungnmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.ubaya.cerbungnmp.databinding.ActivityReadDetailBinding
import com.ubaya.cerbungnmp.databinding.ActivitySignUpBinding

class ReadDetail : AppCompatActivity() {
    private lateinit var binding:ActivityReadDetailBinding
    val CERBUNGID = "com.ubaya.cerbungnmp"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReadDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val storyId = intent.getIntExtra(CERBUNGID, -1)
        if (storyId != -1) {
            val selectedStory = Global.ceritaBersambung.firstOrNull { it.id == storyId }
            val urlPic = selectedStory?.url
            val date = selectedStory?.tanggalPembuatan
            val cerita = selectedStory?.cerita
            val penulis = selectedStory?.penulis
            val judul = selectedStory?.judul


            val builder = Picasso.Builder(this)
            builder.listener{picasso, uri, exception -> exception.printStackTrace()}
            Picasso.get().load(urlPic).into(binding.imageView)

            binding.txtContent1.text = cerita
            binding.txtAuthor1.text = "by " + penulis
            binding.txtDate.text = date
            binding.txtJudul1.text = judul
        }
    }
}