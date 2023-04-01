package com.kindleapp.app.modules.allkindlememoryandminipot.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowToreceive2Binding
import com.kindleapp.app.modules.allkindlememoryandminipot.`data`.model.Toreceive2RowModel
import kotlin.Int
import kotlin.collections.List

class ToReceiveAdapter(
  var list: List<Toreceive2RowModel>
) : RecyclerView.Adapter<ToReceiveAdapter.RowToreceive2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowToreceive2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_toreceive2,parent,false)
    return RowToreceive2VH(view)
  }

  override fun onBindViewHolder(holder: RowToreceive2VH, position: Int) {
    val toreceive2RowModel = Toreceive2RowModel()
    // TODO uncomment following line after integration with data source
    // val toreceive2RowModel = list[position]
    holder.binding.toreceive2RowModel = toreceive2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Toreceive2RowModel>) {
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
      item: Toreceive2RowModel
    ) {
    }
  }

  inner class RowToreceive2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowToreceive2Binding = RowToreceive2Binding.bind(itemView)
  }
}
