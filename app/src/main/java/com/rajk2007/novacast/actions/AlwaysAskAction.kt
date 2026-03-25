package com.rajk2007.novacast.actions

import android.content.Context
import com.rajk2007.novacast.R
import com.rajk2007.novacast.ui.result.LinkLoadingResult
import com.rajk2007.novacast.ui.result.ResultEpisode
import com.rajk2007.novacast.utils.txt

class AlwaysAskAction : VideoClickAction() {
    override val name = txt(R.string.player_settings_always_ask)
    override val isPlayer = true

    // Only show in settings, not on a video
    override fun shouldShow(context: Context?, video: ResultEpisode?): Boolean = video == null
    
    override suspend fun runAction(
        context: Context?,
        video: ResultEpisode,
        result: LinkLoadingResult,
        index: Int?
    ) {
        // This is handled specially in ResultViewModel2.kt by detecting the AlwaysAskAction
        // and showing the player selection dialog instead of executing the action directly
        throw NotImplementedError("AlwaysAskAction is handled specially by the calling code")
    }
}
