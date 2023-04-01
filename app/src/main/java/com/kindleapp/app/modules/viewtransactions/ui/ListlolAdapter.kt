package com.kindleapp.app.modules.viewtransactions.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListlolBinding
import com.kindleapp.app.modules.viewtransactions.`data`.model.ListlolRowModel
import kotlin.Int
import kotlin.collections.List

class ListlolAdapter(
  var list: List<ListlolRowModel>
) : RecyclerView.Adapter<ListlolAdapter.RowListlolVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlolVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlol,parent,false)
    return RowListlolVH(view)
  }

  override fun onBindViewHolder(holder: RowListlolVH, position: Int) {
    val listlolRowModel = ListlolRowModel()
    // TODO uncomment following line after integration with data source
    // val listlolRowModel = list[position]
    holder.binding.listlolRowModel = listlolRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlolRowModel>) {
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
      item: ListlolRowModel
    ) {
    }
  }

  inner class RowListlolVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlolBinding = RowListlolBinding.bind(itemView)
  }
}
