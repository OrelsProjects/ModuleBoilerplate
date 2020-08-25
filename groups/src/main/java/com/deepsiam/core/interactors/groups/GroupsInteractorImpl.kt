package com.deepsiam.core.interactors.groups

import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.injection.scope.ActivityScoped
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.callbacks.GroupsCallback
import com.deepsiam.shared.models.interactors.GroupsInteractor
import com.deepsiam.shared.models.services.GroupsService
import javax.inject.Inject

@AppScoped
class GroupsInteractorImpl @Inject constructor(private val groupsService: GroupsService) :
    GroupsInteractor {
    override fun getAllActivities(callback: GroupsCallback) =
        groupsService.getAllActivities(callback)


    override fun createGroup(callback: GroupsCallback, group: DiveRequestParams.CreateGroup) =
        groupsService.createGroup(callback, group)


}