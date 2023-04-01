package com.kindleapp.app.modules.succesfulfeaturedcreate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowGridplus1Binding
import com.kindleapp.app.modules.succesfulfeaturedcreate.`data`.model.Gridplus1RowModel
import kotlin.Int
import kotlin.collections.List

class GridplusAdapter(
  var list: List<Gridplus1RowModel>
) : RecyclerView.Adapter<GridplusAdapter.RowGridplus1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridplus1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridplus1,parent,false)
    return RowGridplus1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridplus1VH, position: Int) {
    val gridplus1RowModel = Gridplus1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridplus1RowModel = list[position]
    holder.binding.gridplus1RowModel = gridplus1RowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridplus1RowModel>) {
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
      item: Gridplus1RowModel
    ) {
    }
  }

  inner class RowGridplus1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridplus1Binding = RowGridplus1Binding.bind(itemView)
  }
}
