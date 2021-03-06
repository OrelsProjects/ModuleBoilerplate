package com.deepsiam.features.base

import android.os.Bundle
import kotlin.reflect.KClass

open class BaseViewState (
    var newActivity: KClass<*>? = null,
    var clearActivityOnIntent: Boolean = false,
    var intentExtras: Bundle = Bundle()
)