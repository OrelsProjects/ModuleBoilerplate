package com.deepsiam.injection.module

import com.deepsiam.core.interactors.groups.FeaturesInteractorImpl
import com.deepsiam.injection.scope.AppScoped
import com.deepsiam.shared.models.interactors.FeaturesInteractor
import dagger.Module
import dagger.Provides

@Module
class InteractorsModule {
    @Provides
    @AppScoped
    fun provideGroupsInteractor(interactorImpl: FeaturesInteractorImpl): FeaturesInteractor =
        interactorImpl
}