package com.kindleapp.app.modules.myproducts.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlesoywaxBinding
import com.kindleapp.app.modules.myproducts.`data`.model.ListkindlesoywaxRowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlesoywaxAdapter(
  var list: List<ListkindlesoywaxRowModel>
) : RecyclerView.Adapter<ListkindlesoywaxAdapter.RowListkindlesoywaxVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlesoywaxVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlesoywax,parent,false)
    return RowListkindlesoywaxVH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlesoywaxVH, position: Int) {
    val listkindlesoywaxRowModel = ListkindlesoywaxRowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlesoywaxRowModel = list[position]
    holder.binding.listkindlesoywaxRowModel = listkindlesoywaxRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListkindlesoywaxRowModel>) {
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
      item: ListkindlesoywaxRowModel
    ) {
    }
  }

  inner class RowListkindlesoywaxVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlesoywaxBinding = RowListkindlesoywaxBinding.bind(itemView)
    init {
      binding.txtGroup8799.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListkindlesoywaxRowModel())
      }
    }
  }
}
