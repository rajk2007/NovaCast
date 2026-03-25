package com.rajk2007.novacast.utils

import com.rajk2007.novacast.InternalAPI

@InternalAPI
object AppDebug {
    @Volatile
    var isDebug: Boolean = false
}
