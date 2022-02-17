package me.karounwi.common.githubprofile.domain.model

import com.google.gson.annotations.SerializedName

data class Profile(
    @SerializedName("avatar_url")
    val avatarUrl:  String,
    @SerializedName("login")
    val name: String
)
