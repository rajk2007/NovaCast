package com.rajk2007.novacast.actions.temp

import android.app.Activity
import android.content.Context
import com.rajk2007.novacast.R
import com.rajk2007.novacast.actions.VideoClickAction
import com.rajk2007.novacast.ui.player.ExtractorUri
import com.rajk2007.novacast.ui.player.GeneratorPlayer
import com.rajk2007.novacast.ui.player.LOADTYPE_INAPP
import com.rajk2007.novacast.ui.player.SubtitleData
import com.rajk2007.novacast.ui.player.VideoGenerator
import com.rajk2007.novacast.ui.result.LinkLoadingResult
import com.rajk2007.novacast.ui.result.ResultEpisode
import com.rajk2007.novacast.utils.ExtractorLink
import com.rajk2007.novacast.utils.ExtractorLinkType
import com.rajk2007.novacast.utils.UIHelper.navigate
import com.rajk2007.novacast.utils.txt

class PlayMirrorAction : VideoClickAction() {
    override val name = txt(R.string.episode_action_play_mirror)

    override val oneSource = true

    override val isPlayer = true

    override val sourceTypes: Set<ExtractorLinkType> = LOADTYPE_INAPP

    override fun shouldShow(context: Context?, video: ResultEpisode?) = true

    override suspend fun runAction(
        context: Context?,
        video: ResultEpisode,
        result: LinkLoadingResult,
        index: Int?
    ) {
        //Implemented a generator to handle the single
        val activity = context as? Activity ?: return
        val generatorMirror = object : VideoGenerator<ResultEpisode>(listOf(video)) {
            override val hasCache: Boolean = false
            override val canSkipLoading: Boolean = false

            override suspend fun generateLinks(
                clearCache: Boolean,
                sourceTypes: Set<ExtractorLinkType>,
                callback: (Pair<ExtractorLink?, ExtractorUri?>) -> Unit,
                subtitleCallback: (SubtitleData) -> Unit,
                offset: Int,
                isCasting: Boolean
            ): Boolean {
                index?.let { callback(result.links[it] to null) }
                result.subs.forEach { subtitle -> subtitleCallback(subtitle) }
                return true
            }
        }

        activity.navigate(
            R.id.global_to_navigation_player,
            GeneratorPlayer.newInstance(
                generatorMirror, result.syncData
            )
        )
    }
}