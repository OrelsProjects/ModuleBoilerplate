package com.deepsiam.injection.module

import com.deepsiam.features.groups.FeaturesViewState
import com.deepsiam.injection.scope.AppScoped
import dagger.Module
import dagger.Provides

@Module
class ViewStateModule {

    @Provides
    @AppScoped
    fun provideGroupsViewState(): FeaturesViewState = FeaturesViewState()
}