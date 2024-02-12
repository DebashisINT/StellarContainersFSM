package com.stellarcontainersfsm.features.newcollection.model

import com.stellarcontainersfsm.app.domain.CollectionDetailsEntity
import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}