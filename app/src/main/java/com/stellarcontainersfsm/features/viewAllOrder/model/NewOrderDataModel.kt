package com.stellarcontainersfsm.features.viewAllOrder.model

import com.stellarcontainersfsm.app.domain.NewOrderColorEntity
import com.stellarcontainersfsm.app.domain.NewOrderGenderEntity
import com.stellarcontainersfsm.app.domain.NewOrderProductEntity
import com.stellarcontainersfsm.app.domain.NewOrderSizeEntity
import com.stellarcontainersfsm.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

