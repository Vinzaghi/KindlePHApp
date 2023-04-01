package com.kindleapp.app.modules.allkindleminipotandscented.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowToreceive3Binding
import com.kindleapp.app.modules.allkindleminipotandscented.`data`.model.Toreceive3RowModel
import kotlin.Int
import kotlin.collections.List

class ToReceiveAdapter(
  var list: List<Toreceive3RowModel>
) : RecyclerView.Adapter<ToReceiveAdapter.RowToreceive3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowToreceive3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_toreceive3,parent,false)
    return RowToreceive3VH(view)
  }

  override fun onBindViewHolder(holder: RowToreceive3VH, position: Int) {
    val toreceive3RowModel = Toreceive3RowModel()
    // TODO uncomment following line after integration with data source
    // val toreceive3RowModel = list[position]
    holder.binding.toreceive3RowModel = toreceive3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Toreceive3RowModel>) {
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
      item: Toreceive3RowModel
    ) {
    }
  }

  inner class RowToreceive3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowToreceive3Binding = RowToreceive3Binding.bind(itemView)
  }
}
