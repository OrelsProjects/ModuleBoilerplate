package com.deepsiam.shared.models.callbacks

import java.lang.Exception

interface GroupsCallback {
    fun onResponse(json:String?)
    fun onFailure(exception: Exception)
}