package com.deepsiam.features.groups

import com.deepsiam.features.base.BaseViewModel
import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.callbacks.GroupsCallback
import com.deepsiam.shared.models.interactors.GroupsInteractor
import java.lang.Exception
import javax.inject.Inject

@AppScoped
class GroupsViewModel @Inject constructor(
    groupsInteractor: GroupsInteractor,
    private val viewState: GroupsViewState
) : BaseViewModel<GroupsViewState>(groupsInteractor, viewState){


    fun handleAddGroupClick(group: DiveRequestParams.CreateGroup){
        groupsInteractor.createGroup(addGroupCallback, group)
        viewState.isLoading = true
    }

    fun handleGetActivitiesRequest(){
        viewState.isLoading = true
        groupsInteractor.getAllActivities(getActivitiesCallback)
    }


    private var addGroupCallback = object:GroupsCallback{
        override fun onResponse(json: String?) {
            viewState.isLoading = false
            viewState.group = DiveRequestParams.CreateGroup()
            viewState.isCreateGroupRequestDone = true
            updateUI()
        }

        override fun onFailure(exception: Exception) {
            viewState.isLoading = false
            viewState.isCreateGroupRequestDone = true
            viewState.exception = exception
            updateUI()
        }
    }

    private var getActivitiesCallback = object:GroupsCallback{
        override fun onResponse(json: String?) {
            viewState.isLoading = false
            viewState.isGetActivitiesRequestDone = true
            viewState.diveActivitiesJson = json
            updateUI()
        }

        override fun onFailure(exception: Exception) {
            viewState.isLoading = false
            viewState.isGetActivitiesRequestDone = true
            viewState.exception = exception
            updateUI()
        }

    }

}