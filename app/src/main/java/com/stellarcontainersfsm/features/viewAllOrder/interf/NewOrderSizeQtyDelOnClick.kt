package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.app.domain.NewOrderGenderEntity
import com.stellarcontainersfsm.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}