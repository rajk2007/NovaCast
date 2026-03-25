package com.rajk2007.novacast.extractors

import com.rajk2007.novacast.SubtitleFile
import com.rajk2007.novacast.utils.ExtractorApi
import com.rajk2007.novacast.utils.ExtractorLink
import com.rajk2007.novacast.app
import com.rajk2007.novacast.utils.INFER_TYPE
import com.rajk2007.novacast.utils.Qualities
import com.rajk2007.novacast.utils.newExtractorLink


class Luluvdoo : LuluStream() {
    override var mainUrl = "https://luluvdoo.com"
}

class Lulustream1 : LuluStream() {
    override val name = "Lulustream"
    override val mainUrl = "https://lulustream.com"
}

class Lulustream2 : LuluStream() {
    override val name = "Lulustream"
    override val mainUrl = "https://kinoger.pw"
}

open class LuluStream : ExtractorApi() {
    override val  name = "LuluStream"
    override val mainUrl = "https://luluvdo.com"
    override val requiresReferer = true

    override suspend fun getUrl(
        url: String,
        referer: String?,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        val filecode = url.substringAfterLast("/")
        val postUrl = "$mainUrl/dl"
        val post = app.post(
            postUrl,
            data = mapOf(
                "op" to "embed",
                "file_code" to filecode,
                "auto" to "1",
                "referer" to (referer ?: "")
            )
        ).document
        post.selectFirst("script:containsData(vplayer)")?.data()
            ?.let { script ->
                Regex("file:\"(.*)\"").find(script)?.groupValues?.get(1)?.let { link ->
                    callback(
                        newExtractorLink(
                            name,
                            name,
                            link,
                        ) {
                            this.referer = mainUrl
                            this.quality = Qualities.P1080.value
                        }
                    )
                }
            }
    }
}
