package com.rajk2007.novacast.actions.temp

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.core.net.toUri
import com.rajk2007.novacast.actions.OpenInAppAction
import com.rajk2007.novacast.ui.result.LinkLoadingResult
import com.rajk2007.novacast.ui.result.ResultEpisode
import com.rajk2007.novacast.utils.ExtractorLinkType
import com.rajk2007.novacast.utils.txt

/** https://github.com/proninyaroslav/libretorrent */
class LibreTorrentPackage : OpenInAppAction(
    appName = txt("LibreTorrent"),
    packageName = "org.proninyaroslav.libretorrent",
    intentClass = "org.proninyaroslav.libretorrent.ui.addtorrent.AddTorrentActivity"
) {
    // Only torrents are supported by the app
    override val sourceTypes: Set<ExtractorLinkType> =
        setOf(ExtractorLinkType.MAGNET, ExtractorLinkType.TORRENT)

    override val oneSource: Boolean = true

    override suspend fun putExtra(
        context: Context,
        intent: Intent,
        video: ResultEpisode,
        result: LinkLoadingResult,
        index: Int?
    ) {
        intent.data = result.links[index!!].url.toUri()
    }

    override fun onResult(activity: Activity, intent: Intent?) = Unit
}