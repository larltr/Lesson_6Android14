package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("next")
    val next: String,
    @SerializedName("current")
    val current: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("self")
    val self: String
)