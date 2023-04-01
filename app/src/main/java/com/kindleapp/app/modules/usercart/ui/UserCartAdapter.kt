package com.kindleapp.app.modules.usercart.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowUserCartBinding
import com.kindleapp.app.modules.usercart.`data`.model.UserCartRowModel
import kotlin.Int
import kotlin.collections.List

class UserCartAdapter(
  var list: List<UserCartRowModel>
) : RecyclerView.Adapter<UserCartAdapter.RowUserCartVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowUserCartVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_user_cart,parent,false)
    return RowUserCartVH(view)
  }

  override fun onBindViewHolder(holder: RowUserCartVH, position: Int) {
    val userCartRowModel = UserCartRowModel()
    // TODO uncomment following line after integration with data source
    // val userCartRowModel = list[position]
    holder.binding.userCartRowModel = userCartRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<UserCartRowModel>) {
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
      item: UserCartRowModel
    ) {
    }
  }

  inner class RowUserCartVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowUserCartBinding = RowUserCartBinding.bind(itemView)
  }
}
