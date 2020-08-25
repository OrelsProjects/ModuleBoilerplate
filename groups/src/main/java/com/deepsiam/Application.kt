package com.deepsiam

import com.deepsiam.injection.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class Application : DaggerApplication() {

    private val applicationInjector: AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder()
            .application(this)
            .build()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        applicationInjector


}