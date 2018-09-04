package io.armcha.motionlayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return object : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)) {}
    }

    override fun getItemCount(): Int = 50

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
}
