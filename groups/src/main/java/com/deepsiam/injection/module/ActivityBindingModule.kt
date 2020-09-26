package com.deepsiam.injection.module

import com.deepsiam.features.groups.FeatureActivity
import com.deepsiam.features.groups.di.FeaturesModule
import com.deepsiam.injection.scope.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [FeaturesModule::class])
    internal abstract fun featureActivity() : FeatureActivity
}