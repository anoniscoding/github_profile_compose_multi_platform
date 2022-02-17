package me.karounwi.common.githubprofile.data.remote

import me.karounwi.common.githubprofile.domain.model.Profile
import retrofit2.http.GET

interface GithubService {
    @GET("/users")
    suspend fun getProfiles(): List<Profile>
}