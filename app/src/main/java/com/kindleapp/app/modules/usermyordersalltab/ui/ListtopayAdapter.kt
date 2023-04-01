package com.kindleapp.app.modules.usermyordersalltab.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListtopayBinding
import com.kindleapp.app.modules.usermyordersalltab.`data`.model.ListtopayRowModel
import kotlin.Int
import kotlin.collections.List

class ListtopayAdapter(
  var list: List<ListtopayRowModel>
) : RecyclerView.Adapter<ListtopayAdapter.RowListtopayVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtopayVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtopay,parent,false)
    return RowListtopayVH(view)
  }

  override fun onBindViewHolder(holder: RowListtopayVH, position: Int) {
    val listtopayRowModel = ListtopayRowModel()
    // TODO uncomment following line after integration with data source
    // val listtopayRowModel = list[position]
    holder.binding.listtopayRowModel = listtopayRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtopayRowModel>) {
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
      item: ListtopayRowModel
    ) {
    }
  }

  inner class RowListtopayVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtopayBinding = RowListtopayBinding.bind(itemView)
    init {
      binding.linearProduct.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListtopayRowModel())
      }
    }
  }
}
