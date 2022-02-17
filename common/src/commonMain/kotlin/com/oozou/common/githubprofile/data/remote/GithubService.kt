package com.oozou.common.githubprofile.data.remote

import com.oozou.common.githubprofile.domain.model.Profile
import retrofit2.http.GET

interface GithubService {
    @GET("/users")
    suspend fun getProfiles(): List<Profile>
}