package com.stellarcontainersfsm.features.activities.api

import com.stellarcontainersfsm.features.member.api.TeamApi
import com.stellarcontainersfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}