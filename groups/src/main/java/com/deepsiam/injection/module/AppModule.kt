package com.deepsiam.injection.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule {

    @Provides
    fun bindContext(@Named("FeatureModuleContext") application: Application): Context = application
}