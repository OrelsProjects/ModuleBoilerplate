package com.deepsiam.features.groups.di

import com.deepsiam.features.groups.FeatureFragment
import com.deepsiam.features.groups.FeatureActivity
import com.deepsiam.injection.providers.BaseResourceProvider
import com.deepsiam.injection.providers.ResourceProvider
import com.deepsiam.injection.scope.ActivityScoped
import com.deepsiam.injection.scope.FragmentScoped
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module(includes = [FeaturesModule.GroupsAbstractModule::class])
class FeaturesModule {
    @ActivityScoped
    @Provides
    internal fun provideResourceProvider(context: FeatureActivity): BaseResourceProvider {
        return ResourceProvider(context)
    }

    @Module
    interface GroupsAbstractModule {
        @FragmentScoped
        @ContributesAndroidInjector
        fun addGroupsFragment(): FeatureFragment
    }
}
