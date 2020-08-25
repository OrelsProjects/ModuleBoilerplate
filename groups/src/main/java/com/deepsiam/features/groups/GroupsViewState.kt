package com.deepsiam.features.groups

import com.deepsiam.features.base.BaseViewState
import com.deepsiam.features.groups.entities.DiveEntity
import com.deepsiam.features.groups.entities.DiveRequestParams
import java.lang.Exception

class GroupsViewState(
    var isLoading: Boolean = false,
    var isCreateGroupRequestDone: Boolean = false,
    var isGetActivitiesRequestDone: Boolean = false,
    var group: DiveRequestParams.CreateGroup? = null,
    var diveActivitiesJson: String? = null,
    var exception: Exception? = null
) : BaseViewState()