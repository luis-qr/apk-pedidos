package com.quispe.luis.pedidos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class PedidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val btnSave = findViewById<Button>(R.id.btnSave)

        val edtImage = findViewById<EditText>(R.id.edtImage)
        val edtTitle = findViewById<EditText>(R.id.edtTitle)
        val edtBand = findViewById<EditText>(R.id.edtNameBand)
        val edtTime = findViewById<EditText>(R.id.edtTime)

        val cvMusic1 = findViewById<CardView>(R.id.cvMusic1)
        val cvMusic2 = findViewById<CardView>(R.id.cvMusic2)
        val cvMusic3 = findViewById<CardView>(R.id.cvMusic3)
        val cvMusic4 = findViewById<CardView>(R.id.cvMusic4)
        val cvMusic5 = findViewById<CardView>(R.id.cvMusic5)
        val cvMusic6 = findViewById<CardView>(R.id.cvMusic6)

        val imvMusic1 = findViewById<ImageView>(R.id.imvMusic1)
        val imvMusic2 = findViewById<ImageView>(R.id.imvMusic2)
        val imvMusic3 = findViewById<ImageView>(R.id.imvMusic3)
        val imvMusic4 = findViewById<ImageView>(R.id.imvMusic4)
        val imvMusic5 = findViewById<ImageView>(R.id.imvMusic5)
        val imvMusic6 = findViewById<ImageView>(R.id.imvMusic6)

        val tvnameSong1 = findViewById<TextView>(R.id.tvNameSong1)
        val tvNameSong2 = findViewById<TextView>(R.id.tvNameSong2)
        val tvNameSong3 = findViewById<TextView>(R.id.tvNameSong3)
        val tvNameSong4 = findViewById<TextView>(R.id.tvNameSong4)
        val tvNameSong5 = findViewById<TextView>(R.id.tvNameSong5)
        val tvNameSong6 = findViewById<TextView>(R.id.tvNameSong6)

        val tvNameBand1 = findViewById<TextView>(R.id.tvNameBand1)
        val tvNameBand2 = findViewById<TextView>(R.id.tvNameBand2)
        val tvNameBand3 = findViewById<TextView>(R.id.tvNameBand3)
        val tvNameBand4 = findViewById<TextView>(R.id.tvNameBand4)
        val tvNameBand5 = findViewById<TextView>(R.id.tvNameBand5)
        val tvNameBand6 = findViewById<TextView>(R.id.tvNameBand6)

        val tvTimeSong1 = findViewById<TextView>(R.id.tvTimeSong1)
        val tvTimeSong2 = findViewById<TextView>(R.id.tvTimeSong2)
        val tvTimeSong3 = findViewById<TextView>(R.id.tvTimeSong3)
        val tvTimeSong4 = findViewById<TextView>(R.id.tvTimeSong4)
        val tvTimeSong5 = findViewById<TextView>(R.id.tvTimeSong5)
        val tvTimeSong6 = findViewById<TextView>(R.id.tvTimeSong6)

        btnSave.setOnClickListener {

            val image = edtImage.text
            val uriImage = "@drawable/$image"
            val imageId = getResources().getIdentifier(uriImage, null, getPackageName())
            val title = edtTitle.text
            val band = edtBand.text
            val time = edtTime.text

            if (cvMusic1.visibility == View.GONE) {

                imvMusic1.setImageDrawable(resources.getDrawable(imageId))
                tvnameSong1.text = title
                tvNameBand1.text = band
                tvTimeSong1.text = time


                cvMusic1.visibility = View.VISIBLE
            } else if (cvMusic2.visibility == View.GONE) {

                imvMusic2.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong2.text = title
                tvNameBand2.text = band
                tvTimeSong2.text = time


                cvMusic2.visibility = View.VISIBLE
            } else if (cvMusic3.visibility == View.GONE) {

                imvMusic3.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong3.text = title
                tvNameBand3.text = band
                tvTimeSong3.text = time


                cvMusic3.visibility = View.VISIBLE
            }else if (cvMusic4.visibility == View.GONE) {

                imvMusic4.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong4.text = title
                tvNameBand4.text = band
                tvTimeSong4.text = time


                cvMusic4.visibility = View.VISIBLE
            }else if (cvMusic5.visibility == View.GONE) {

                imvMusic5.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong5.text = title
                tvNameBand5.text = band
                tvTimeSong5.text = time


                cvMusic5.visibility = View.VISIBLE
            }else if (cvMusic6.visibility == View.GONE) {

                imvMusic6.setImageDrawable(resources.getDrawable(imageId))
                tvNameSong6.text = title
                tvNameBand6.text = band
                tvTimeSong6.text = time


                cvMusic6.visibility = View.VISIBLE
            }


            edtImage.text.clear()
            edtTitle.text.clear()
            edtBand.text.clear()
            edtTime.text.clear()
        }
    }
}