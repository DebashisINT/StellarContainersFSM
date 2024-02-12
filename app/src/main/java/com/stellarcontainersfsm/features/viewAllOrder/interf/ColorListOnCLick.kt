package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.app.domain.NewOrderGenderEntity
import com.stellarcontainersfsm.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}