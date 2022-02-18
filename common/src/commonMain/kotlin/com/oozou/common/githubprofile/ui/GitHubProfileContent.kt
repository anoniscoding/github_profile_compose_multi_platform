package com.oozou.common.githubprofile.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.oozou.common.util.DataState

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun GithubProfileContent(dataState: DataState<GithubProfileViewData>) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        dataState.toData()?.profiles?.forEach {
            item {
                UserProfileUi(it)
            }
        }
    }

    AnimatedVisibility(
        visible = dataState.isLoading() ?: false,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            CircularProgressIndicator()
        }
    }

    AnimatedVisibility(
        visible = dataState.isError() ?: false,
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(dataState.toErrorMessage() ?: "An error occurred")
        }
    }
}