package com.deepsiam.features.groups

import com.deepsiam.features.base.BaseViewModel
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.interactors.FeaturesInteractor
import javax.inject.Inject

@AppScoped
class FeaturesViewModel @Inject constructor(
    groupsInteractor: FeaturesInteractor,
    private val viewState: FeaturesViewState
) : BaseViewModel<FeaturesViewState>(groupsInteractor, viewState){}