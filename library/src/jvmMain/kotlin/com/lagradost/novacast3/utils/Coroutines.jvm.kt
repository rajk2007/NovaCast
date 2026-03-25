package com.rajk2007.novacast.utils

actual fun runOnMainThreadNative(work: () -> Unit) {
    work.invoke()
}