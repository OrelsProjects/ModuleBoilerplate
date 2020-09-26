package com.deepsiam.features.groups

import com.deepsiam.features.base.BaseViewModel
import com.deepsiam.features.groups.entities.DiveRequestParams
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.callbacks.GroupsCallback
import com.deepsiam.shared.models.interactors.GroupsInteractor
import java.lang.Exception
import javax.inject.Inject

@AppScoped
class FeaturesViewModel @Inject constructor(
    groupsInteractor: GroupsInteractor,
    private val viewState: FeaturesViewState
) : BaseViewModel<FeaturesViewState>(groupsInteractor, viewState){}