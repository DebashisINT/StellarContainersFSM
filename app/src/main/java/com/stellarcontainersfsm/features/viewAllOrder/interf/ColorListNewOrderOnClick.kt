package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.app.domain.NewOrderColorEntity
import com.stellarcontainersfsm.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}