package com.kindleapp.app.modules.delete.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlesoywaxThree1Binding
import com.kindleapp.app.modules.delete.`data`.model.ListkindlesoywaxThree1RowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlesoywaxThreeAdapter(
  var list: List<ListkindlesoywaxThree1RowModel>
) : RecyclerView.Adapter<ListkindlesoywaxThreeAdapter.RowListkindlesoywaxThree1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlesoywaxThree1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlesoywax_three1,parent,false)
    return RowListkindlesoywaxThree1VH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlesoywaxThree1VH, position: Int) {
    val listkindlesoywaxThree1RowModel = ListkindlesoywaxThree1RowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlesoywaxThree1RowModel = list[position]
    holder.binding.listkindlesoywaxThree1RowModel = listkindlesoywaxThree1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlesoywaxThree1RowModel>) {
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
      item: ListkindlesoywaxThree1RowModel
    ) {
    }
  }

  inner class RowListkindlesoywaxThree1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlesoywaxThree1Binding = RowListkindlesoywaxThree1Binding.bind(itemView)
  }
}
