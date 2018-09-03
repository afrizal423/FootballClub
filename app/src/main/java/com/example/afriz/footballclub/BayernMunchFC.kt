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

class BayernMunchFC : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val nama = intent.getStringExtra("data3")
        verticalLayout{
            id = main_root
            orientation = LinearLayout.VERTICAL
            padding = dip(16)
            imageView {
                setImageResource(R.drawable.img_bayern)
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
                text = "FC Bayern München  is a German sports club based in Munich, Bavaria (Bayern). It is best known for its professional football team, which plays in the Bundesliga, the top tier of the German football league system, and is the most successful club in German football history, having won a record 28 national titles and 18 national cups."
                textAlignment = View.TEXT_ALIGNMENT_CENTER
            }.lparams(width = matchParent, height = wrapContent) {
                gravity = Gravity.CENTER
                margin = sp(12)
            }
        }

    }

}