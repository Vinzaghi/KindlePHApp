package com.kindleapp.app.modules.usermyorderstoreceivetab.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowListkindlememoryc1Binding
import com.kindleapp.app.modules.usermyorderstoreceivetab.`data`.model.Listkindlememoryc1RowModel
import kotlin.Int
import kotlin.collections.List

class ListkindlememorycAdapter(
  var list: List<Listkindlememoryc1RowModel>
) : RecyclerView.Adapter<ListkindlememorycAdapter.RowListkindlememoryc1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListkindlememoryc1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listkindlememoryc1,parent,false)
    return RowListkindlememoryc1VH(view)
  }

  override fun onBindViewHolder(holder: RowListkindlememoryc1VH, position: Int) {
    val listkindlememoryc1RowModel = Listkindlememoryc1RowModel()
    // TODO uncomment following line after integration with data source
    // val listkindlememoryc1RowModel = list[position]
    holder.binding.listkindlememoryc1RowModel = listkindlememoryc1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listkindlememoryc1RowModel>) {
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
      item: Listkindlememoryc1RowModel
    ) {
    }
  }

  inner class RowListkindlememoryc1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListkindlememoryc1Binding = RowListkindlememoryc1Binding.bind(itemView)
  }
}
