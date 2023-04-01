package com.kindleapp.app.modules.usermyordersalltab.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlememorycBinding
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListkindlememorycRowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlememorycAdapter(
  var list: List<ListkindlememorycRowModel>
) : RecyclerView.Adapter<ListkindlememorycAdapter.RowListkindlememorycVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlememorycVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlememoryc,parent,false)
    return RowListkindlememorycVH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlememorycVH, position: Int) {
    val listkindlememorycRowModel = ListkindlememorycRowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlememorycRowModel = list[position]
    holder.binding.listkindlememorycRowModel = listkindlememorycRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlememorycRowModel>) {
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
      item: ListkindlememorycRowModel
    ) {
    }
  }

  inner class RowListkindlememorycVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlememorycBinding = RowListkindlememorycBinding.bind(itemView)
  }
}
