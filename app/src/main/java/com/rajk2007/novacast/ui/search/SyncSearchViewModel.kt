package com.rajk2007.novacast.ui.search

import com.rajk2007.novacast.Score
import com.rajk2007.novacast.SearchQuality
import com.rajk2007.novacast.SearchResponse
import com.rajk2007.novacast.TvType

//TODO Relevance of this class since it's not used
class SyncSearchViewModel {
    data class SyncSearchResultSearchResponse(
        override val name: String,
        override val url: String,
        override val apiName: String,
        override var type: TvType?,
        override var posterUrl: String?,
        override var id: Int?,
        override var quality: SearchQuality? = null,
        override var posterHeaders: Map<String, String>? = null,
        override var score: Score? = null,
    ) : SearchResponse
}