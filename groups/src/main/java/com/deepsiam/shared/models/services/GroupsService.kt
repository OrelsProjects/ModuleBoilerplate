package com.deepsiam.shared.models.services

import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.shared.models.callbacks.GroupsCallback

interface GroupsService {
    fun getAllActivities(callback: GroupsCallback)
    fun createGroup(callback: GroupsCallback, group: DiveRequestParams.CreateGroup)
}