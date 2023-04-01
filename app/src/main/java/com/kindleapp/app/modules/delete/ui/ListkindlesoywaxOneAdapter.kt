package com.kindleapp.app.modules.delete.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlesoywaxOneBinding
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlesoywaxOneAdapter(
  var list: List<ListkindlesoywaxOneRowModel>
) : RecyclerView.Adapter<ListkindlesoywaxOneAdapter.RowListkindlesoywaxOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlesoywaxOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlesoywax_one,parent,false)
    return RowListkindlesoywaxOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlesoywaxOneVH, position: Int) {
    val listkindlesoywaxOneRowModel = ListkindlesoywaxOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlesoywaxOneRowModel = list[position]
    holder.binding.listkindlesoywaxOneRowModel = listkindlesoywaxOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlesoywaxOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListkindlesoywaxOneRowModel
    ) {
    }
  }

  inner class RowListkindlesoywaxOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlesoywaxOneBinding = RowListkindlesoywaxOneBinding.bind(itemView)
  }
}
