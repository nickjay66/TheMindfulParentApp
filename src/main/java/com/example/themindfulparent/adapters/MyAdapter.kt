package com.example.themindfulparent.adapters

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.themindfulparent.R
import com.example.themindfulparent.activities.MeditationPlayer
import com.example.themindfulparent.activities.ParentMeditation
import kotlinx.android.synthetic.main.activity_main.view.*

class MyAdapter (private val myDataset: Array<String>) : RecyclerView.Adapter<MyAdapter.ViewHolder>()
{

    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        val messageButton = itemView.findViewById<Button>(R.id.message_button)
        val image = itemView.findViewById<ImageView>(R.id.imageView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val recyclerItem = inflater.inflate(R.layout.recyclerview_item, parent, false)
        // Return a new holder instance
        return ViewHolder(recyclerItem)
    }

    // Involves populating data into the item through holder
    override fun onBindViewHolder(viewHolder: MyAdapter.ViewHolder, position: Int) {
        val button = viewHolder.messageButton
        val image = viewHolder.image
        if (position % 2 == 0) {
            button.setBackgroundColor(Color.parseColor("#A9D4CC"))
        } else {
            button.setBackgroundColor(Color.parseColor("#9ED4F5"))
        }
        button.text = myDataset[position]
    }

    // Returns the total count of items in the list
    override fun getItemCount(): Int {
        return myDataset.size
    }
}

