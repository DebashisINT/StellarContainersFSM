package com.stellarcontainersfsm.features.viewAllOrder.interf

import com.stellarcontainersfsm.features.viewAllOrder.model.ProductOrder

interface EmptyProductOnClick {
    fun emptyProductOnCLick(emptyFound:Boolean)
    fun delProductOnCLick(isDel:Boolean)
}