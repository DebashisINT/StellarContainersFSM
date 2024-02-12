package com.stellarcontainersfsm.features.lead.api

import com.stellarcontainersfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.stellarcontainersfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}