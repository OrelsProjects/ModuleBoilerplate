package com.deepsiam.features.groups

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.deepsiam.features.base.BaseFragment
import com.deepsiam.features.groups.entities.DiveActivityEntity
import com.deepsiam.features.groups.entities.DiveActivityServer
import com.deepsiam.features.groups.entities.DiveRequestParams
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.fragment_add_group.*
import java.util.HashMap
import javax.inject.Inject


class AddGroupFragment @Inject constructor(override var viewModel: GroupsViewModel) :
    BaseFragment<GroupsViewModel, GroupsViewState>(viewModel) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(GroupsViewModel::class.java)
        setHasOptionsMenu(true)
    }

    override fun updateUI(state: GroupsViewState) {
        if (state.isCreateGroupRequestDone) {
            if (state.group != null) { // Adding group succeeded
                Toast.makeText(activity, "Success", Toast.LENGTH_LONG).show()
            } else { // Adding group failed
                Toast.makeText(activity, "Failed", Toast.LENGTH_LONG).show()
            }
        } else if (state.isGetActivitiesRequestDone) {
            if (state.diveActivitiesJson != null) {
                Toast.makeText(activity, "Success", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(activity, "Failed", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun attachClickListeners() {
        addGroupButton.setOnClickListener {
//            viewModel.handleAddGroupClick(
////                DiveRequestParams.CreateGroup(
////                    "4",
////                    "3",
////                    "2",
////                    "1"
////                )
//            )
            jsonToDiveEntities()
        }
        getActivitiesButton.setOnClickListener {
            viewModel.handleGetActivitiesRequest()
        }
    }


    fun jsonToDiveEntities(): HashMap<String, DiveActivityEntity> {
        val diveEntityMap: HashMap<String, DiveActivityEntity> = HashMap()
        val gson = GsonBuilder()
            .setLenient()
            .create()
        val listType = object : TypeToken<DiveActivityServer>() {}.type
//        val diveEntitiesList = setJson(json)
//        val testJson = "\"Data\":[\"aaa\":\"bbb\", \"ccc\":\"ddd\"]"
        val testJson =
            "{\"Title\":\"\\u05dc\\u05d9\\u05e0\\u05d4\",\"Data\":[\"aaa\":\"bbb\", \"ccc\":\"ddd\"]}"
        val title = testJson.substring(testJson.indexOf(':') + 1, testJson.indexOf(","))
        val data = testJson.substring(testJson.indexOf('[') + 1, testJson.indexOf(']'))
        val splitData = data.split(", ")
        splitData.forEach {
            val a = it.substring(0, it.indexOf(':'))
            val b = it.substring(it.indexOf(':') + 1, it.length - 1)
            val x = 4
        }
//        val x = (gson.fromJson<DiveActivityServer>(testJson, listType!!))
//        diveEntitiesList.forEach {
////            val type = it.substring(1, it.indexOf(':') - 1)
////            val element = it.substring(it.indexOf(':') + 1, it.indexOf('}') + 1)
//            val x = (gson.fromJson<DiveActivityServer>(it, listType!!))
//            val y = 4
//        }
        return diveEntityMap
    }

    private fun setJson(json: String): MutableList<String> {
//        val jsonNoQuotationMarks = json.replace("\"", "")
        val diveEntitiesJsonListWithTypes = json.split(":{", "},").toMutableList()
        val diveEntitiesJsonList: ArrayList<String> = ArrayList()
        diveEntitiesJsonListWithTypes.forEach { diveEntityJson ->
            if (diveEntityJson.contains("Title") && diveEntityJson.contains("Data")) {
                diveEntitiesJsonList.add("{$diveEntityJson}")
            }
        }
//        diveEntitiesJsonList[0] = "[${diveEntitiesJsonList[0]}"
//        diveEntitiesJsonList[diveEntitiesJsonList.size - 1] =
//            "${diveEntitiesJsonList[diveEntitiesJsonList.size - 1]}]"
        return diveEntitiesJsonList
    }


    override fun getLayoutResourceFile(): Int = R.layout.fragment_add_group
}