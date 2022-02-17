package com.oozou.desktop

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.oozou.common.DesktopApp

fun main() = application {
    Window(
        title = "Github Profiles",
        onCloseRequest = ::exitApplication,
        resizable = false
    ) {
        DesktopMaterialTheme {
            DesktopApp()
        }
    }
}