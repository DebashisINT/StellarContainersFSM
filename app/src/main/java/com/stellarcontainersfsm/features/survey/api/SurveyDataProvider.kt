package com.stellarcontainersfsm.features.survey.api

import com.stellarcontainersfsm.features.photoReg.api.GetUserListPhotoRegApi
import com.stellarcontainersfsm.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}