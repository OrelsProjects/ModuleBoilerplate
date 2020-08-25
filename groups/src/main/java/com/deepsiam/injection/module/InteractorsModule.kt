package com.deepsiam.injection.module

import com.deepsiam.core.interactors.groups.GroupsInteractorImpl
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.interactors.GroupsInteractor
import dagger.Module
import dagger.Provides

@Module
class InteractorsModule {

    @Provides
    @AppScoped
    fun provideGroupsInteractor(interactorImpl: GroupsInteractorImpl): GroupsInteractor =
        interactorImpl
}