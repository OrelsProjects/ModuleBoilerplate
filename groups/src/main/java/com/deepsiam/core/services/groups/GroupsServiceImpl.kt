package com.deepsiam.core.services.groups

import android.content.Context
import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.injection.scope.ActivityScoped
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.callbacks.GroupsCallback
import com.deepsiam.shared.models.services.GroupsService
import com.google.gson.Gson
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException
import javax.inject.Inject
import javax.inject.Named

@AppScoped
class GroupsServiceImpl @Inject constructor(@Named("DeepModuleContext") context: Context): GroupsService {
    private val mediaType: MediaType =
        "application/x-www-form-urlencoded; charset=UTF-8".toMediaTypeOrNull()!!
    private val client = OkHttpClient().newBuilder()
        .build()

    override fun getAllActivities(callback: GroupsCallback) {
        val url = "https://www.deepsiam.club/api/diving-school-activities/get-activities-list"
        val content = "application/x-www-form-urlencoded; charset=UTF-8"
        val body = content.toRequestBody(mediaType)
        val request: Request = Request.Builder()
            .url(url)
            .method("POST", body)
            .addHeader("Token", "QFSD3030402020")
            .addHeader("content-type", "application/x-www-form-urlencoded; charset=UTF-8")
            .addHeader("Accept", "*/*")
            .addHeader("Cache-Control", "no-cache")
            .addHeader("Host", "www.deepsiam.club")
//            .addHeader("Accept-Encoding", "gzip, deflate")
            .addHeader("Connection", "keep-alive")
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) =
                callback.onResponse(response.body?.string())

            override fun onFailure(call: Call, e: IOException) =
                callback.onFailure(e)

        })
    }

    override fun createGroup(callback: GroupsCallback, group: DiveRequestParams.CreateGroup) {
        val json = Gson().toJson(group)
        val url = "http://www.deepsiam.club/api/diving-school-groups/create-group/?params=$json"
        val body = FormBody.Builder()
            .add("Handle", group.Handle!!)
            .add("DateTime", group.DateTime!!)
            .add("ContactName", group.ContactPhone!!)
            .add("ContactPhone", group.ContactName!!)
            .build();
        val request: Request = Request.Builder()
            .url(url)
            .method("POST", body)
            .addHeader("Token", "QFSD3030402020")
            .addHeader("content-type", "application/json")
            .addHeader("Accept", "*/*")
            .addHeader("Host", "www.deepsiam.club")
            .addHeader("Accept-Encoding", "gzip, deflate")
            .addHeader("Connection", "keep-alive")
            .addHeader("Cache-Control", "no-cache")
            .build()
        client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) =
                callback.onResponse(response.body?.string())


            override fun onFailure(call: Call, e: IOException) =
                callback.onFailure(e)

        })
    }
}