package com.stellarcontainersfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.stellarcontainersfsm.app.FileUtils
import com.stellarcontainersfsm.base.BaseResponse
import com.stellarcontainersfsm.features.NewQuotation.model.*
import com.stellarcontainersfsm.features.addshop.model.AddShopRequestData
import com.stellarcontainersfsm.features.addshop.model.AddShopResponse
import com.stellarcontainersfsm.features.damageProduct.model.DamageProductResponseModel
import com.stellarcontainersfsm.features.damageProduct.model.delBreakageReq
import com.stellarcontainersfsm.features.damageProduct.model.viewAllBreakageReq
import com.stellarcontainersfsm.features.login.model.userconfig.UserConfigResponseModel
import com.stellarcontainersfsm.features.myjobs.model.WIPImageSubmit
import com.stellarcontainersfsm.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}