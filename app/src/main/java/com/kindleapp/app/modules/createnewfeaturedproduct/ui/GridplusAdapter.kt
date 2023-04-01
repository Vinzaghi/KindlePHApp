package com.kindleapp.app.modules.createnewfeaturedproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowGridplusBinding
import com.kindleapp.app.modules.createnewfeaturedproduct.`data`.model.GridplusRowModel
import kotlin.Int
import kotlin.collections.List

class GridplusAdapter(
  var list: List<GridplusRowModel>
) : RecyclerView.Adapter<GridplusAdapter.RowGridplusVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridplusVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridplus,parent,false)
    return RowGridplusVH(view)
  }

  override fun onBindViewHolder(holder: RowGridplusVH, position: Int) {
    val gridplusRowModel = GridplusRowModel()
    // TODO uncomment following line after integration with data source
    // val gridplusRowModel = list[position]
    holder.binding.gridplusRowModel = gridplusRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridplusRowModel>) {
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
      item: GridplusRowModel
    ) {
    }
  }

  inner class RowGridplusVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridplusBinding = RowGridplusBinding.bind(itemView)
  }
}
