package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class DataItem(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("links")
    val links: Links,
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String
)