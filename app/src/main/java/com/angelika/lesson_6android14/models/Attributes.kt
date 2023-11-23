package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("wiki")
    val wiki: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("name")
    val name: String
)