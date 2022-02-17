package me.karounwi.common.githubprofile.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.karounwi.common.githubprofile.domain.model.Profile

@Composable
fun GithubProfileContent(profiles: List<Profile>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        profiles.forEach{
            item {
                UserProfileUi(it)
            }
        }
    }
}