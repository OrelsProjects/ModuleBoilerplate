package com.deepsiam.features.groups

import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.deepsiam.features.base.BaseFragment
import com.deepsiam.features.groups.entities.DiveActivityEntity
import com.deepsiam.features.groups.entities.DiveActivityServer
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.fragment_add_group.*
import java.util.HashMap
import javax.inject.Inject


class FeatureFragment @Inject constructor(override var viewModel: FeaturesViewModel) :
    BaseFragment<FeaturesViewModel, FeaturesViewState>(viewModel) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(FeaturesViewModel::class.java)
        setHasOptionsMenu(true)
    }

    override fun updateUI(state: FeaturesViewState) {}

    override fun attachClickListeners() {}

    override fun getLayoutResourceFile(): Int = R.layout.fragment_add_group
}