package com.kindleapp.app.modules.paymentmenu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kindleapp.app.R
import com.kindleapp.app.databinding.RowPaymentMenuBinding
import com.kindleapp.app.modules.paymentmenu.`data`.model.PaymentMenuRowModel
import kotlin.Int
import kotlin.collections.List

class PaymentMenuAdapter(
  var list: List<PaymentMenuRowModel>
) : RecyclerView.Adapter<PaymentMenuAdapter.RowPaymentMenuVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPaymentMenuVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_payment_menu,parent,false)
    return RowPaymentMenuVH(view)
  }

  override fun onBindViewHolder(holder: RowPaymentMenuVH, position: Int) {
    val paymentMenuRowModel = PaymentMenuRowModel()
    // TODO uncomment following line after integration with data source
    // val paymentMenuRowModel = list[position]
    holder.binding.paymentMenuRowModel = paymentMenuRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PaymentMenuRowModel>) {
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
      item: PaymentMenuRowModel
    ) {
    }
  }

  inner class RowPaymentMenuVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPaymentMenuBinding = RowPaymentMenuBinding.bind(itemView)
  }
}
