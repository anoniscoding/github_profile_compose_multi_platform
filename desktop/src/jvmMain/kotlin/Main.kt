package me.karounwi.desktop

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import me.karounwi.common.DesktopApp

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