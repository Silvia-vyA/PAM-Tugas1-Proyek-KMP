package com.ntahlah.pamtugas1

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "PAM tugas1_Proyek KMP",
    ) {
        App()
    }
}