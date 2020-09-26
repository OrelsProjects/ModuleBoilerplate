package com.deepsiam.core.interactors.groups

import android.content.Context
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.interactors.GroupsInteractor
import javax.inject.Inject
import javax.inject.Named

@AppScoped
class GroupsInteractorImpl @Inject constructor(@Named("DeepModuleContext") private val context: Context) :
    GroupsInteractor {}