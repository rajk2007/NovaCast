package com.rajk2007.novacast.extractors

import com.rajk2007.novacast.SubtitleFile
import com.rajk2007.novacast.app
import com.rajk2007.novacast.utils.ExtractorApi
import com.rajk2007.novacast.utils.ExtractorLink
import com.rajk2007.novacast.utils.getQualityFromName
import com.rajk2007.novacast.utils.httpsify
import com.rajk2007.novacast.utils.newExtractorLink

open class Embedgram : ExtractorApi() {
    override val name = "Embedgram"
    override val mainUrl = "https://embedgram.com"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val document = app.get(url, referer = referer).document
        val link = document.select("video source:last-child").attr("src")
        val quality = document.select("video source:last-child").attr("title")
        callback.invoke(
            newExtractorLink(
                this.name,
                this.name,
                httpsify(link),
            ) {
                this.referer = "$mainUrl/"
                this.quality = getQualityFromName(quality)
                this.headers = mapOf(
                    "Range" to "bytes=0-"
                )
            }
        )
    }
}