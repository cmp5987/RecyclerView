package edu.rit.cmp5987.recyclerviewdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    public var titles = mutableListOf<String>()
    public var details = mutableListOf<String>()
    public var images = mutableListOf<Int>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemImage)
            itemDetail = itemView.findViewById(R.id.itemDetail)
        }
    }//View Holder

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemTitle.text = titles[position]
        viewHolder.itemDetail.text = details[position]
        viewHolder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

} //Adapter