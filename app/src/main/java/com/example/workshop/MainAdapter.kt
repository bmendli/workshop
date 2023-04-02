package com.example.workshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.techno.R

class MainAdapter(
    private val items: List<Movie>
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, null)
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val icon: ImageView = itemView.findViewById(R.id.icon)
        private val tag: TextView = itemView.findViewById(R.id.tag)
        private val title: TextView = itemView.findViewById(R.id.title)
        private val description: TextView = itemView.findViewById(R.id.description)
        private val rating: TextView = itemView.findViewById(R.id.rating)

        fun bind(movie: Movie) {
            icon.setImageResource(movie.icon)
            tag.setText(movie.tag.title)
            tag.backgroundTintList = ContextCompat.getColorStateList(itemView.context, movie.tag.backgroundColorRes)
            title.text = movie.title
            description.text = movie.description
            rating.text = itemView.context.getString(R.string.rating_pattern, movie.rating)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context, movie.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}