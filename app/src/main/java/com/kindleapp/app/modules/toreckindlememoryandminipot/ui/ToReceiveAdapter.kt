package com.kindleapp.app.modules.toreckindlememoryandminipot.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowToreceiveBinding
import com.kindleapp.app.modules.toreckindlememoryandminipot.`data`.model.ToreceiveRowModel
import kotlin.Int
import kotlin.collections.List

class ToReceiveAdapter(
  var list: List<ToreceiveRowModel>
) : RecyclerView.Adapter<ToReceiveAdapter.RowToreceiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowToreceiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_toreceive,parent,false)
    return RowToreceiveVH(view)
  }

  override fun onBindViewHolder(holder: RowToreceiveVH, position: Int) {
    val toreceiveRowModel = ToreceiveRowModel()
    // TODO uncomment following line after integration with data source
    // val toreceiveRowModel = list[position]
    holder.binding.toreceiveRowModel = toreceiveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ToreceiveRowModel>) {
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
      item: ToreceiveRowModel
    ) {
    }
  }

  inner class RowToreceiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowToreceiveBinding = RowToreceiveBinding.bind(itemView)
  }
}
