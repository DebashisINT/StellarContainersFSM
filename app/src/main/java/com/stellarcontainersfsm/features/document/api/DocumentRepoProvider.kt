package com.stellarcontainersfsm.features.document.api

import com.stellarcontainersfsm.features.dymanicSection.api.DynamicApi
import com.stellarcontainersfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}