package com.detmir.recycli.adapters

import android.view.ViewGroup
import androidx.annotation.Keep
import androidx.recyclerview.widget.RecyclerView
import java.util.*

@Keep
interface RecyclerBinder {

    val stateToIndexMap: HashMap<String, Int>

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int, state: String, item: RecyclerItem)

    fun getItemViewType(recyclerItemState: String): Int
}