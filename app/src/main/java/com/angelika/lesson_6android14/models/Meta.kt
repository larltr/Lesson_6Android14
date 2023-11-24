package com.angelika.lesson_6android14.models

import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("copyright")
    val copyright: String,
    @SerializedName("pagination")
    val pagination: Pagination,
    @SerializedName("generateAt")
    val generatedAt: String
)