package com.deepsiam.features.groups

import android.os.Bundle
import com.deepsiam.utls.ActivityUtils
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class FeatureActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var addGroupFragment: FeatureFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!ActivityUtils.hideDefaultTitleBar(this))
            supportActionBar?.hide()
        setContentView(R.layout.activity_groups)
        var fragment = supportFragmentManager.findFragmentById(R.id.contentFrame)
        if (fragment == null) {
            fragment = addGroupFragment
            ActivityUtils.addFragmentToActivity(
                supportFragmentManager,
                fragment,
                R.id.contentFrame
            )
        }
    }

}

