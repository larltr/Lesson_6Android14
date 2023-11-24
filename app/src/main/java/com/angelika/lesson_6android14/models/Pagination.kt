package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class Pagination(
    @SerializedName("next")
    val next: Int,
    @SerializedName("current")
    val current: Int,
    @SerializedName("last")
    val last: Int,
    @SerializedName("records")
    val records: Int,
)