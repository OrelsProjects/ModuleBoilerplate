package com.deepsiam.deepsiamgroups

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deepsiam.features.groups.entities.DiveActivityEntity
import com.deepsiam.features.groups.entities.DiveActivityServer
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import java.util.HashMap


class MainActivity : AppCompatActivity() {
    private val mediaType: MediaType =
        "application/x-www-form-urlencoded; charset=UTF-8".toMediaTypeOrNull()!!
    private val client = OkHttpClient().newBuilder()
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        createGroup(DiveRequestParams.CreateGroup("1", "2", "3", "4"))
//        jsonToDiveEntities("")
    }



//    fun jsonToDiveEntities(json: String): HashMap<String, DiveEntity> {
//        val diveEntityMap: HashMap<String, DiveEntity> = HashMap()
//        val gson = GsonBuilder()
//            .setLenient()
//            .create()
//        val listType = object : TypeToken<DiveEntity>() {}.type
//        val diveEntitiesList = setJson(json)
//        diveEntitiesList.forEach {
//            val type = it.substring(1, it.indexOf(':') - 1)
//            val element = it.substring(it.indexOf(':') + 1, it.indexOf('}') + 1)
//            diveEntityMap[type] = (gson.fromJson<DiveEntity>(element, listType!!))
//        }
//        return diveEntityMap
//    }
//
//    private fun setJson(json: String): MutableList<String> {
//        val diveEntitiesList = json.split("},").toMutableList()
//        diveEntitiesList.forEachIndexed { index, diveEntity ->
//            when (index) {
//                0 -> {
//                    diveEntitiesList[0] =
//                        diveEntitiesList[0].substring(1, diveEntitiesList[0].length) + "}"
//                }
//                diveEntitiesList.size - 1 -> {
//                    diveEntitiesList[index] =
//                        diveEntitiesList[index].substring(0, diveEntitiesList[index].length - 1)
//                }
//                else -> {
//                    diveEntitiesList[index] = diveEntitiesList[index] + "}"
//                }
//            }
//        }
//        return diveEntitiesList
//    }

}


//        val x = DeepSiamRequestsImpl().getCall()
//        x.requestAllActivities().enqueue(object : Callback<JSONArray> {
//            override fun onFailure(call: Call<JSONArray>, t: Throwable) {
//                val x = 4
//            }
//
//            override fun onResponse(
//                call: Call<JSONArray> ,
//                response: Response<JSONArray>
//            ) {
//                val y = 4
//            }
//        })
