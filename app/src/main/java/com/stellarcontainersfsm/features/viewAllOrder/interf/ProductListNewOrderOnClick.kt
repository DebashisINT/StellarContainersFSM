package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.app.domain.NewOrderGenderEntity
import com.stellarcontainersfsm.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}