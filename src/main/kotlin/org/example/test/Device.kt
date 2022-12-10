package org.example.test

sealed class Device {
    object Ios: Device()
    object Android: Device()
}

object Browser
