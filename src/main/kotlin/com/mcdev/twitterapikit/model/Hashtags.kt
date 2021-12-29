package com.mcdev.twitterapikit.model

import com.google.gson.annotations.SerializedName

data class Hashtags(@SerializedName(value = "start")var start: Int = 0,
                    @SerializedName(value = "end") var end: Int? = 0,
                    @SerializedName(value = "tag") var tag: String? = null)
