package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.app.domain.NewOrderProductEntity
import com.stellarcontainersfsm.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}