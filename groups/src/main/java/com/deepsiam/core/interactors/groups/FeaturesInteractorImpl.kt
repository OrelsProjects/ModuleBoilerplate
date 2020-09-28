package com.deepsiam.core.interactors.groups

import android.content.Context
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.interactors.FeaturesInteractor
import javax.inject.Inject
import javax.inject.Named

@AppScoped
class FeaturesInteractorImpl @Inject constructor() :
    FeaturesInteractor {
    @Inject
    @Named("FeatureModuleContext")
    lateinit var context: Context
}