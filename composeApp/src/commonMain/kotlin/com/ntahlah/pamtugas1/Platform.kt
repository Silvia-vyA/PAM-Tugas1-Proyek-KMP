package com.ntahlah.pamtugas1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform