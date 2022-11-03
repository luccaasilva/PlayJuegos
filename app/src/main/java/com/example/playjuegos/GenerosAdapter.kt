package com.example.playjuegos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GenerosAdapter(var items: ArrayList<Genero>) :
    RecyclerView.Adapter<GenerosAdapter.GenerosViewHolder>() {

    class GenerosViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var texto: TextView

        init {
            texto = itemView.findViewById(R.id.id1)
        }



    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): GenerosViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.activity_search_viewer, viewGroup, false)
        return GenerosViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: GenerosViewHolder, pos: Int) {
        val item = items.get(pos)

    }

    override fun getItemCount(): Int {
        return items.size
    }
}
