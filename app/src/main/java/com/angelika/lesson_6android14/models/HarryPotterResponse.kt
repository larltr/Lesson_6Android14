package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class HarryPotterResponse(
    @SerializedName("data")
    val data: List<DataItem>?,
    @SerializedName("meta")
    val meta: Meta,
    @SerializedName("links")
    val links: Links
)