package com.example.afriz.footballclub

import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.example.afriz.footballclub.R.id.deskripsi
import com.example.afriz.footballclub.R.id.name
import com.example.afriz.footballclub.R.id.main_root
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.*

class ACMilanFC : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nama = intent.getStringExtra("data7")
        verticalLayout{
            id = main_root
            orientation = LinearLayout.VERTICAL
            padding = dip(16)
            imageView {
                setImageResource(R.drawable.img_acm)
            }.lparams(width = dip(70), height = dip(70)) {
                gravity = Gravity.CENTER
            }
            textView {
                id = R.id.name
                text = "$nama"
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                gravity = Gravity.CENTER
                margin = sp(15)
            }
            textView {
                id = deskripsi
                text = "Associazione Calcio Milan (Italian pronunciation: [assotʃatˈtsjoːne ˈkaltʃo ˈmiːlan]), commonly referred to as A.C. Milan or simply Milan, is a professional football club in Milan, Italy, founded in 1899"
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                gravity = Gravity.CENTER
                margin = sp(12)
            }
        }


    }

}