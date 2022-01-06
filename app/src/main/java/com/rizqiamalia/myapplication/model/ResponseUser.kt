package com.rizqiamalia.myapplication.model

import com.google.gson.annotations.SerializedName

data class ResponseUser(
    @SerializedName("status") val status: Boolean,
    @SerializedName("message") val message: String?,
    @SerializedName("data") val data: DataUser?
)