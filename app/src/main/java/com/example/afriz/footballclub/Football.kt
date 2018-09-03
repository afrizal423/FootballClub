package com.example.afriz.footballclub

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.afriz.footballclub.R.id.image
import com.example.afriz.footballclub.R.id.name
import com.example.afriz.footballclub.R.layout.item_list
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_list.*
import org.jetbrains.anko.intentFor

class Football(private val context: Context, private val items: List<Item>)
    : RecyclerView.Adapter<Football.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(context).inflate(item_list, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemCount(): Int = items.size


    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
            LayoutContainer {
        fun bindItem(items: Item) {
            var context = containerView.context
            name.text = items.name
            Glide.with(containerView).load(items.image).into(image)
            containerView.setOnClickListener {
                    when (getAdapterPosition()) {
                        0 -> context.startActivity(context.intentFor<BarcelonaFC>("data" to name.text.toString()))
                        1 -> context.startActivity(context.intentFor<RealMadridFC>("data2" to name.text.toString()))
                        2 -> context.startActivity(context.intentFor<BayernMunchFC>("data3" to name.text.toString()))
                        3 -> context.startActivity(context.intentFor<ManCityFC>("data4" to name.text.toString()))
                        4 -> context.startActivity(context.intentFor<ManUnFC>("data5" to name.text.toString()))
                        5 -> context.startActivity(context.intentFor<ChelseaFC>("data6" to name.text.toString()))
                        6 -> context.startActivity(context.intentFor<ACMilanFC>("data7" to name.text.toString()))
                        7 -> context.startActivity(context.intentFor<ArsenalFC>("data8" to name.text.toString()))
                    }
            }
        }
    }
}