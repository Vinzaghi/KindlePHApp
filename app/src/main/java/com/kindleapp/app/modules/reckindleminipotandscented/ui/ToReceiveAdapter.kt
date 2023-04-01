package com.kindleapp.app.modules.reckindleminipotandscented.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowToreceive1Binding
import com.kindleapp.app.modules.reckindleminipotandscented.`data`.model.Toreceive1RowModel
import kotlin.Int
import kotlin.collections.List

class ToReceiveAdapter(
  var list: List<Toreceive1RowModel>
) : RecyclerView.Adapter<ToReceiveAdapter.RowToreceive1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowToreceive1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_toreceive1,parent,false)
    return RowToreceive1VH(view)
  }

  override fun onBindViewHolder(holder: RowToreceive1VH, position: Int) {
    val toreceive1RowModel = Toreceive1RowModel()
    // TODO uncomment following line after integration with data source
    // val toreceive1RowModel = list[position]
    holder.binding.toreceive1RowModel = toreceive1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Toreceive1RowModel>) {
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
      item: Toreceive1RowModel
    ) {
    }
  }

  inner class RowToreceive1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowToreceive1Binding = RowToreceive1Binding.bind(itemView)
  }
}
