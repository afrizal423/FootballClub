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

class ArsenalFC : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nama = intent.getStringExtra("data8")
        verticalLayout{
            id = main_root
            orientation = LinearLayout.VERTICAL
            padding = dip(16)
            imageView {
                setImageResource(R.drawable.img_arsenal)
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
                text = "Arsenal Football Club is a professional football club based in Islington, London, England, that plays in the Premier League, the top flight of English football. The club has won 13 League titles, a record 13 FA Cups, two League Cups, the League Centenary Trophy, 15 FA Community Shields, one UEFA Cup Winners' Cup and one Inter-Cities Fairs Cup."
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                gravity = Gravity.CENTER
                margin = sp(12)
            }
        }


    }

}