package com.rajk2007.novacast.extractors

import com.rajk2007.novacast.app
import com.rajk2007.novacast.utils.ExtractorApi
import com.rajk2007.novacast.utils.ExtractorLink
import com.rajk2007.novacast.utils.ExtractorLinkType
import com.rajk2007.novacast.utils.INFER_TYPE
import com.rajk2007.novacast.utils.JsUnpacker
import com.rajk2007.novacast.utils.Qualities
import com.rajk2007.novacast.utils.newExtractorLink
import java.net.URI

open class Streamhub : ExtractorApi() {
    override var mainUrl = "https://streamhub.to"
    override var name = "Streamhub"
    override val requiresReferer = false

    override fun getExtractorUrl(id: String): String {
        return "$mainUrl/e/$id"
    }

    override suspend fun getUrl(url: String, referer: String?): List<ExtractorLink>? {
        val response = app.get(url).text
        Regex("eval((.|\\n)*?)</script>").find(response)?.groupValues?.get(1)?.let { jsEval ->
            JsUnpacker("eval$jsEval").unpack()?.let { unPacked ->
                Regex("sources:\\[\\{src:\"(.*?)\"").find(unPacked)?.groupValues?.get(1)?.let { link ->
                    return listOf(
                        newExtractorLink(
                            source = this.name,
                            this.name,
                            link,
                        )
                    )
                }
            }
        }
        return null
    }
}