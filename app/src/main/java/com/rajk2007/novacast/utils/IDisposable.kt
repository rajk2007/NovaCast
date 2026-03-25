package com.rajk2007.novacast.utils

interface IDisposable {
    fun dispose()
}

object IDisposableHelper {
    fun <T : IDisposable> using(disposeObject: T, work: (T) -> Unit) {
        work.invoke(disposeObject)
        disposeObject.dispose()
    }
}