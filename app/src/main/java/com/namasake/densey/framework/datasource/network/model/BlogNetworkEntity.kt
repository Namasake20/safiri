package com.namasake.densey.framework.datasource.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class BlogNetworkEntity (
    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("imageUrl")
    @Expose
    var imageUrl: String,

    @SerializedName("blogUrl")
    @Expose
    var blogUrl: String,
    @SerializedName("mediaId")
    @Expose
    var mediaId: String,

    @SerializedName("description")
    @Expose
    var description: String
        )