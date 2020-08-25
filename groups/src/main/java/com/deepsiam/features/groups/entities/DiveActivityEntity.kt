package com.deepsiam.features.groups.entities



data class DiveActivityEntity(
    var handle: String,
     var title: String,
     var type: String

) {
    override fun toString(): String {
        return title
    }
}
