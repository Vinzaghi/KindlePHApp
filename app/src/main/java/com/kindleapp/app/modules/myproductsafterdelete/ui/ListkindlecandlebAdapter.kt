package com.kindleapp.app.modules.myproductsafterdelete.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlecandlebBinding
import com.kindleapp.app.modules.myproductsafterdelete.`data`.model.ListkindlecandlebRowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlecandlebAdapter(
  var list: List<ListkindlecandlebRowModel>
) : RecyclerView.Adapter<ListkindlecandlebAdapter.RowListkindlecandlebVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlecandlebVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlecandleb,parent,false)
    return RowListkindlecandlebVH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlecandlebVH, position: Int) {
    val listkindlecandlebRowModel = ListkindlecandlebRowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlecandlebRowModel = list[position]
    holder.binding.listkindlecandlebRowModel = listkindlecandlebRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlecandlebRowModel>) {
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
      item: ListkindlecandlebRowModel
    ) {
    }
  }

  inner class RowListkindlecandlebVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlecandlebBinding = RowListkindlecandlebBinding.bind(itemView)
  }
}
