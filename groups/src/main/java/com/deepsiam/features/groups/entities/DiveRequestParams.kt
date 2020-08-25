package com.deepsiam.features.groups.entities

import com.google.gson.annotations.SerializedName

class DiveRequestParams {

    data class CreateGroup(
        @SerializedName("Handle")
        var Handle: String? = "",
        @SerializedName("DateTime")
        var DateTime: String? = "",
        @SerializedName("ContactName")
        var ContactName: String? = "",
        @SerializedName("ContactPhone")
        var ContactPhone: String? = ""
    )

    data class SetActivityDescription(
        var Handle: String,
        var Description: String
    )

}
