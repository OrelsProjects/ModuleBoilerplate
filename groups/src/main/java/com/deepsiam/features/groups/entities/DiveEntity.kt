package com.deepsiam.features.groups.entities

import com.google.gson.annotations.SerializedName

data class DiveEntity(

    @SerializedName("Title")
    var Title: String,
    @SerializedName("Data")
    var Data: Array<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DiveEntity

        if (Title != other.Title) return false
        if (!Data.contentEquals(other.Data)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = Title.hashCode()
        result = 31 * result + Data.contentHashCode()
        return result
    }
}
