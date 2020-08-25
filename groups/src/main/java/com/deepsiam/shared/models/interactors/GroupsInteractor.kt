package com.deepsiam.shared.models.interactors

import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.shared.models.callbacks.GroupsCallback

interface GroupsInteractor {
    fun getAllActivities(callback: GroupsCallback)
    fun createGroup(callback: GroupsCallback, group: DiveRequestParams.CreateGroup)
}