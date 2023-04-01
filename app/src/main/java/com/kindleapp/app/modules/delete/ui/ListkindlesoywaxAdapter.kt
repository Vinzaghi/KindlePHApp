package com.kindleapp.app.modules.delete.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlesoywax1Binding
import com.kindleapp.app.modules.delete.`data`.model.Listkindlesoywax1RowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlesoywaxAdapter(
  var list: List<Listkindlesoywax1RowModel>
) : RecyclerView.Adapter<ListkindlesoywaxAdapter.RowListkindlesoywax1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlesoywax1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlesoywax1,parent,false)
    return RowListkindlesoywax1VH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlesoywax1VH, position: Int) {
    val listkindlesoywax1RowModel = Listkindlesoywax1RowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlesoywax1RowModel = list[position]
    holder.binding.listkindlesoywax1RowModel = listkindlesoywax1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listkindlesoywax1RowModel>) {
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
      item: Listkindlesoywax1RowModel
    ) {
    }
  }

  inner class RowListkindlesoywax1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlesoywax1Binding = RowListkindlesoywax1Binding.bind(itemView)
  }
}
