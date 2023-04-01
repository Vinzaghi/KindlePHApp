package com.kindleapp.app.modules.myproducts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlesoywaxThreeBinding
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxThreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlesoywaxThreeAdapter(
  var list: List<ListkindlesoywaxThreeRowModel>
) : RecyclerView.Adapter<ListkindlesoywaxThreeAdapter.RowListkindlesoywaxThreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlesoywaxThreeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlesoywax_three,parent,false)
    return RowListkindlesoywaxThreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlesoywaxThreeVH, position: Int) {
    val listkindlesoywaxThreeRowModel = ListkindlesoywaxThreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlesoywaxThreeRowModel = list[position]
    holder.binding.listkindlesoywaxThreeRowModel = listkindlesoywaxThreeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlesoywaxThreeRowModel>) {
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
      item: ListkindlesoywaxThreeRowModel
    ) {
    }
  }

  inner class RowListkindlesoywaxThreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlesoywaxThreeBinding = RowListkindlesoywaxThreeBinding.bind(itemView)
  }
}
