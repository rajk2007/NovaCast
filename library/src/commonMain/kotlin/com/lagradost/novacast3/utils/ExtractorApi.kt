package com.rajk2007.novacast.utils

import com.fasterxml.jackson.annotation.JsonIgnore
import com.rajk2007.novacast.AudioFile
import com.rajk2007.novacast.IDownloadableMinimum
import com.rajk2007.novacast.SubtitleFile
import com.rajk2007.novacast.USER_AGENT
import com.rajk2007.novacast.app
import com.rajk2007.novacast.extractors.Acefile
import com.rajk2007.novacast.extractors.Ahvsh
import com.rajk2007.novacast.extractors.Aico
import com.rajk2007.novacast.extractors.Asnwish
import com.rajk2007.novacast.extractors.Auvexiug
import com.rajk2007.novacast.extractors.Awish
import com.rajk2007.novacast.extractors.BgwpCC
import com.rajk2007.novacast.extractors.BigwarpArt
import com.rajk2007.novacast.extractors.BigwarpIO
import com.rajk2007.novacast.extractors.Blogger
import com.rajk2007.novacast.extractors.ByseSX
import com.rajk2007.novacast.extractors.Bysezejataos
import com.rajk2007.novacast.extractors.ByseBuho
import com.rajk2007.novacast.extractors.ByseVepoin
import com.rajk2007.novacast.extractors.ByseQekaho
import com.rajk2007.novacast.extractors.Cavanhabg
import com.rajk2007.novacast.extractors.Cda
import com.rajk2007.novacast.extractors.Cdnplayer
import com.rajk2007.novacast.extractors.CdnwishCom
import com.rajk2007.novacast.extractors.CloudMailRu
import com.rajk2007.novacast.extractors.ContentX
import com.rajk2007.novacast.extractors.CsstOnline
import com.rajk2007.novacast.extractors.D0000d
import com.rajk2007.novacast.extractors.D000dCom
import com.rajk2007.novacast.extractors.DBfilm
import com.rajk2007.novacast.extractors.Dailymotion
import com.rajk2007.novacast.extractors.DatabaseGdrive
import com.rajk2007.novacast.extractors.DatabaseGdrive2
import com.rajk2007.novacast.extractors.DesuArcg
import com.rajk2007.novacast.extractors.DesuDrive
import com.rajk2007.novacast.extractors.DesuOdchan
import com.rajk2007.novacast.extractors.DesuOdvip
import com.rajk2007.novacast.extractors.Dhcplay
import com.rajk2007.novacast.extractors.Dhtpre
import com.rajk2007.novacast.extractors.Dokicloud
import com.rajk2007.novacast.extractors.DoodCxExtractor
import com.rajk2007.novacast.extractors.DoodLaExtractor
import com.rajk2007.novacast.extractors.DoodPmExtractor
import com.rajk2007.novacast.extractors.DoodShExtractor
import com.rajk2007.novacast.extractors.DoodSoExtractor
import com.rajk2007.novacast.extractors.DoodToExtractor
import com.rajk2007.novacast.extractors.DoodWatchExtractor
import com.rajk2007.novacast.extractors.DoodWfExtractor
import com.rajk2007.novacast.extractors.DoodWsExtractor
import com.rajk2007.novacast.extractors.DoodYtExtractor
import com.rajk2007.novacast.extractors.Doodspro
import com.rajk2007.novacast.extractors.Dsvplay
import com.rajk2007.novacast.extractors.Doodporn
import com.rajk2007.novacast.extractors.DoodstreamCom
import com.rajk2007.novacast.extractors.Dooood
import com.rajk2007.novacast.extractors.Ds2play
import com.rajk2007.novacast.extractors.Ds2video
import com.rajk2007.novacast.extractors.DsstOnline
import com.rajk2007.novacast.extractors.Dumbalag
import com.rajk2007.novacast.extractors.Dwish
import com.rajk2007.novacast.extractors.Embedgram
import com.rajk2007.novacast.extractors.EmturbovidExtractor
import com.rajk2007.novacast.extractors.Evoload
import com.rajk2007.novacast.extractors.Evoload1
import com.rajk2007.novacast.extractors.Ewish
import com.rajk2007.novacast.extractors.FEmbed
import com.rajk2007.novacast.extractors.FEnet
import com.rajk2007.novacast.extractors.Fastream
import com.rajk2007.novacast.extractors.FeHD
import com.rajk2007.novacast.extractors.Fembed9hd
import com.rajk2007.novacast.extractors.FileMoon
import com.rajk2007.novacast.extractors.FileMoonIn
import com.rajk2007.novacast.extractors.FileMoonSx
import com.rajk2007.novacast.extractors.FilemoonV2
import com.rajk2007.novacast.extractors.Filesim
import com.rajk2007.novacast.extractors.Multimoviesshg
import com.rajk2007.novacast.extractors.FlaswishCom
import com.rajk2007.novacast.extractors.FourCX
import com.rajk2007.novacast.extractors.FourPichive
import com.rajk2007.novacast.extractors.FourPlayRu
import com.rajk2007.novacast.extractors.Fplayer
import com.rajk2007.novacast.extractors.FsstOnline
import com.rajk2007.novacast.extractors.GDMirrorbot
import com.rajk2007.novacast.extractors.GUpload
import com.rajk2007.novacast.extractors.GamoVideo
import com.rajk2007.novacast.extractors.Gdriveplayer
import com.rajk2007.novacast.extractors.Gdriveplayerapi
import com.rajk2007.novacast.extractors.Gdriveplayerapp
import com.rajk2007.novacast.extractors.Gdriveplayerbiz
import com.rajk2007.novacast.extractors.Gdriveplayerco
import com.rajk2007.novacast.extractors.Gdriveplayerfun
import com.rajk2007.novacast.extractors.Gdriveplayerio
import com.rajk2007.novacast.extractors.Gdriveplayerme
import com.rajk2007.novacast.extractors.Gdriveplayerorg
import com.rajk2007.novacast.extractors.Gdriveplayerus
import com.rajk2007.novacast.extractors.Geodailymotion
import com.rajk2007.novacast.extractors.Gofile
import com.rajk2007.novacast.extractors.GoodstreamExtractor
import com.rajk2007.novacast.extractors.Guccihide
import com.rajk2007.novacast.extractors.Guxhag
import com.rajk2007.novacast.extractors.HDMomPlayer
import com.rajk2007.novacast.extractors.HDPlayerSystem
import com.rajk2007.novacast.extractors.HDStreamAble
import com.rajk2007.novacast.extractors.Habetar
import com.rajk2007.novacast.extractors.Haxloppd
import com.rajk2007.novacast.extractors.HglinkTo
import com.rajk2007.novacast.extractors.HgplayCDN
import com.rajk2007.novacast.extractors.Hotlinger
import com.rajk2007.novacast.extractors.HubCloud
import com.rajk2007.novacast.extractors.Hxfile
import com.rajk2007.novacast.extractors.HlsWish
import com.rajk2007.novacast.extractors.InternetArchive
import com.rajk2007.novacast.extractors.JWPlayer
import com.rajk2007.novacast.extractors.Jeniusplay
import com.rajk2007.novacast.extractors.Jodwish
import com.rajk2007.novacast.extractors.Keephealth
import com.rajk2007.novacast.extractors.KotakAnimeid
import com.rajk2007.novacast.extractors.Kotakajair
import com.rajk2007.novacast.extractors.Krakenfiles
import com.rajk2007.novacast.extractors.Kswplayer
import com.rajk2007.novacast.extractors.LayarKaca
import com.rajk2007.novacast.extractors.Linkbox
import com.rajk2007.novacast.extractors.LuluStream
import com.rajk2007.novacast.extractors.Lulustream1
import com.rajk2007.novacast.extractors.Lulustream2
import com.rajk2007.novacast.extractors.Luluvdoo
import com.rajk2007.novacast.extractors.Luxubu
import com.rajk2007.novacast.extractors.Lvturbo
import com.rajk2007.novacast.extractors.MailRu
import com.rajk2007.novacast.extractors.Maxstream
import com.rajk2007.novacast.extractors.Mediafire
import com.rajk2007.novacast.extractors.Megacloud
import com.rajk2007.novacast.extractors.Meownime
import com.rajk2007.novacast.extractors.MetaGnathTuggers
import com.rajk2007.novacast.extractors.Minoplres
import com.rajk2007.novacast.extractors.MixDrop
import com.rajk2007.novacast.extractors.MixDropAg
import com.rajk2007.novacast.extractors.MixDropBz
import com.rajk2007.novacast.extractors.MixDropCh
import com.rajk2007.novacast.extractors.MixDropTo
import com.rajk2007.novacast.extractors.MixDropPs
import com.rajk2007.novacast.extractors.Mdy
import com.rajk2007.novacast.extractors.MixDropSi
import com.rajk2007.novacast.extractors.MxDropTo
import com.rajk2007.novacast.extractors.Movhide
import com.rajk2007.novacast.extractors.Moviehab
import com.rajk2007.novacast.extractors.MoviehabNet
import com.rajk2007.novacast.extractors.Moviesm4u
import com.rajk2007.novacast.extractors.Mp4Upload
import com.rajk2007.novacast.extractors.Multimovies
import com.rajk2007.novacast.extractors.Mvidoo
import com.rajk2007.novacast.extractors.MyVidPlay
import com.rajk2007.novacast.extractors.Mwish
import com.rajk2007.novacast.extractors.NathanFromSubject
import com.rajk2007.novacast.extractors.Nekostream
import com.rajk2007.novacast.extractors.Nekowish
import com.rajk2007.novacast.extractors.Neonime7n
import com.rajk2007.novacast.extractors.Neonime8n
import com.rajk2007.novacast.extractors.Obeywish
import com.rajk2007.novacast.extractors.Odnoklassniki
import com.rajk2007.novacast.extractors.OkRuHTTP
import com.rajk2007.novacast.extractors.OkRuHTTPMobile
import com.rajk2007.novacast.extractors.OkRuSSL
import com.rajk2007.novacast.extractors.OkRuSSLMobile
import com.rajk2007.novacast.extractors.PeaceMakerst
import com.rajk2007.novacast.extractors.Peytonepre
import com.rajk2007.novacast.extractors.Pichive
import com.rajk2007.novacast.extractors.PixelDrain
import com.rajk2007.novacast.extractors.PixelDrainDev
import com.rajk2007.novacast.extractors.PlayLtXyz
import com.rajk2007.novacast.extractors.PlayRu
import com.rajk2007.novacast.extractors.PlayerVoxzer
import com.rajk2007.novacast.extractors.Playerwish
import com.rajk2007.novacast.extractors.Rabbitstream
import com.rajk2007.novacast.extractors.RapidVid
import com.rajk2007.novacast.extractors.Rasacintaku
import com.rajk2007.novacast.extractors.SBfull
import com.rajk2007.novacast.extractors.Sbasian
import com.rajk2007.novacast.extractors.Sbface
import com.rajk2007.novacast.extractors.Sbflix
import com.rajk2007.novacast.extractors.Sblona
import com.rajk2007.novacast.extractors.Sblongvu
import com.rajk2007.novacast.extractors.Sbnet
import com.rajk2007.novacast.extractors.Sbrapid
import com.rajk2007.novacast.extractors.Sbsonic
import com.rajk2007.novacast.extractors.Sbspeed
import com.rajk2007.novacast.extractors.Sbthe
import com.rajk2007.novacast.extractors.SecvideoOnline
import com.rajk2007.novacast.extractors.Sendvid
import com.rajk2007.novacast.extractors.Server1uns
import com.rajk2007.novacast.extractors.SfastwishCom
import com.rajk2007.novacast.extractors.ShaveTape
import com.rajk2007.novacast.extractors.SibNet
import com.rajk2007.novacast.extractors.Simpulumlamerop
import com.rajk2007.novacast.extractors.Smoothpre
import com.rajk2007.novacast.extractors.Sobreatsesuyp
import com.rajk2007.novacast.extractors.Ssbstream
import com.rajk2007.novacast.extractors.StreamEmbed
import com.rajk2007.novacast.extractors.StreamHLS
import com.rajk2007.novacast.extractors.StreamM4u
import com.rajk2007.novacast.extractors.StreamSB
import com.rajk2007.novacast.extractors.StreamSB1
import com.rajk2007.novacast.extractors.StreamSB10
import com.rajk2007.novacast.extractors.StreamSB11
import com.rajk2007.novacast.extractors.StreamSB2
import com.rajk2007.novacast.extractors.StreamSB3
import com.rajk2007.novacast.extractors.StreamSB4
import com.rajk2007.novacast.extractors.StreamSB5
import com.rajk2007.novacast.extractors.StreamSB6
import com.rajk2007.novacast.extractors.StreamSB7
import com.rajk2007.novacast.extractors.StreamSB8
import com.rajk2007.novacast.extractors.StreamSB9
import com.rajk2007.novacast.extractors.StreamSilk
import com.rajk2007.novacast.extractors.StreamTape
import com.rajk2007.novacast.extractors.StreamTapeNet
import com.rajk2007.novacast.extractors.StreamTapeXyz
import com.rajk2007.novacast.extractors.Watchadsontape
import com.rajk2007.novacast.extractors.StreamWishExtractor
import com.rajk2007.novacast.extractors.StreamhideCom
import com.rajk2007.novacast.extractors.StreamhideTo
import com.rajk2007.novacast.extractors.Streamhub2
import com.rajk2007.novacast.extractors.Streamix
import com.rajk2007.novacast.extractors.Streamlare
import com.rajk2007.novacast.extractors.StreamoUpload
import com.rajk2007.novacast.extractors.Streamplay
import com.rajk2007.novacast.extractors.Streamsss
import com.rajk2007.novacast.extractors.Streamup
import com.rajk2007.novacast.extractors.Streamwish2
import com.rajk2007.novacast.extractors.Strwish
import com.rajk2007.novacast.extractors.Strwish2
import com.rajk2007.novacast.extractors.Supervideo
import com.rajk2007.novacast.extractors.Swdyu
import com.rajk2007.novacast.extractors.Swhoi
import com.rajk2007.novacast.extractors.TRsTX
import com.rajk2007.novacast.extractors.Tantifilm
import com.rajk2007.novacast.extractors.TauVideo
import com.rajk2007.novacast.extractors.Techinmind
import com.rajk2007.novacast.extractors.Tubeless
import com.rajk2007.novacast.extractors.Uasopt
import com.rajk2007.novacast.extractors.Up4FunTop
import com.rajk2007.novacast.extractors.Up4Stream
import com.rajk2007.novacast.extractors.Upstream
import com.rajk2007.novacast.extractors.UpstreamExtractor
import com.rajk2007.novacast.extractors.Uqload
import com.rajk2007.novacast.extractors.Uqload1
import com.rajk2007.novacast.extractors.Uqload2
import com.rajk2007.novacast.extractors.Uqloadcx
import com.rajk2007.novacast.extractors.Uqloadbz
import com.rajk2007.novacast.extractors.UqloadsXyz
import com.rajk2007.novacast.extractors.Urochsunloath
import com.rajk2007.novacast.extractors.Userload
import com.rajk2007.novacast.extractors.Userscloud
import com.rajk2007.novacast.extractors.Uservideo
import com.rajk2007.novacast.extractors.Videa
import com.rajk2007.novacast.extractors.Vicloud
import com.rajk2007.novacast.extractors.VidHidePro
import com.rajk2007.novacast.extractors.VidHidePro1
import com.rajk2007.novacast.extractors.VidHidePro2
import com.rajk2007.novacast.extractors.VidHidePro3
import com.rajk2007.novacast.extractors.VidHidePro4
import com.rajk2007.novacast.extractors.VidHidePro5
import com.rajk2007.novacast.extractors.VidHidePro6
import com.rajk2007.novacast.extractors.VidHideHub
import com.rajk2007.novacast.extractors.Ryderjet
import com.rajk2007.novacast.extractors.VidMoxy
import com.rajk2007.novacast.extractors.VidStack
import com.rajk2007.novacast.extractors.VideoSeyred
import com.rajk2007.novacast.extractors.Videzz
import com.rajk2007.novacast.extractors.Vidgomunime
import com.rajk2007.novacast.extractors.Vidgomunimesb
import com.rajk2007.novacast.extractors.VidhideExtractor
import com.rajk2007.novacast.extractors.Vidmoly
import com.rajk2007.novacast.extractors.Vidmolyme
import com.rajk2007.novacast.extractors.Vidmolyto
import com.rajk2007.novacast.extractors.Vidmolybiz
import com.rajk2007.novacast.extractors.Vido
import com.rajk2007.novacast.extractors.Vidoza
import com.rajk2007.novacast.extractors.VinovoSi
import com.rajk2007.novacast.extractors.VinovoTo
import com.rajk2007.novacast.extractors.VidNest
import com.rajk2007.novacast.extractors.Vidara
import com.rajk2007.novacast.extractors.Vide0Net
import com.rajk2007.novacast.extractors.Vidsonic
import com.rajk2007.novacast.extractors.VkExtractor
import com.rajk2007.novacast.extractors.Voe
import com.rajk2007.novacast.extractors.Voe1
import com.rajk2007.novacast.extractors.Vtbe
import com.rajk2007.novacast.extractors.Wibufile
import com.rajk2007.novacast.extractors.WishembedPro
import com.rajk2007.novacast.extractors.Wishfast
import com.rajk2007.novacast.extractors.Wishonly
import com.rajk2007.novacast.extractors.XStreamCdn
import com.rajk2007.novacast.extractors.Xenolyzb
import com.rajk2007.novacast.extractors.Yipsu
import com.rajk2007.novacast.extractors.YourUpload
import com.rajk2007.novacast.extractors.YoutubeExtractor
import com.rajk2007.novacast.extractors.YoutubeMobileExtractor
import com.rajk2007.novacast.extractors.YoutubeNoCookieExtractor
import com.rajk2007.novacast.extractors.YoutubeShortLinkExtractor
import com.rajk2007.novacast.extractors.Yufiles
import com.rajk2007.novacast.extractors.Yuguaab
import com.rajk2007.novacast.extractors.Zplayer
import com.rajk2007.novacast.extractors.ZplayerV2
import com.rajk2007.novacast.extractors.Ztreamhub
import com.rajk2007.novacast.mvvm.logError
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.ensureActive
import me.xdrop.fuzzywuzzy.FuzzySearch
import org.jsoup.Jsoup
import java.net.URI
import java.util.UUID
import kotlin.coroutines.cancellation.CancellationException

/**
 * For use in the ConcatenatingMediaSource.
 * If features are missing (headers), please report and we can add it.
 * @param durationUs use Long.toUs() for easier input
 * */
data class PlayListItem(
    val url: String,
    val durationUs: Long,
)

/**
 * Converts Seconds to MicroSeconds, multiplication by 1_000_000
 * */
fun Long.toUs(): Long {
    return this * 1_000_000
}

/**
 * If your site has an unorthodox m3u8-like system where there are multiple smaller videos concatenated
 * use this.
 * */
@Suppress("DEPRECATION")
data class ExtractorLinkPlayList(
    override val source: String,
    override val name: String,
    val playlist: List<PlayListItem>,
    override var referer: String,
    override var quality: Int,
    override var headers: Map<String, String> = mapOf(),
    /** Used for getExtractorVerifierJob() */
    override var extractorData: String? = null,
    override var type: ExtractorLinkType,
    override var audioTracks: List<AudioFile> = emptyList(),
) : ExtractorLink(
    source = source,
    name = name,
    url = "",
    referer = referer,
    quality = quality,
    headers = headers,
    extractorData = extractorData,
    type = type,
    audioTracks = audioTracks
) {
    constructor(
        source: String,
        name: String,
        playlist: List<PlayListItem>,
        referer: String,
        quality: Int,
        isM3u8: Boolean = false,
        headers: Map<String, String> = mapOf(),
        extractorData: String? = null,
    ) : this(
        source = source,
        name = name,
        playlist = playlist,
        referer = referer,
        quality = quality,
        type = if (isM3u8) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO,
        headers = headers,
        extractorData = extractorData,
    )
}

/** Metadata about the file type used for downloads and exoplayer hint,
 * if you respond with the wrong one the file will fail to download or be played */
enum class ExtractorLinkType {
    /** Single stream of bytes no matter the actual file type */
    VIDEO,

    /** Split into several .ts files, has support for encrypted m3u8s */
    M3U8,

    /** Like m3u8 but uses xml, currently no download support */
    DASH,

    /** No support at the moment */
    TORRENT,

    /** No support at the moment */
    MAGNET;

    // See https://www.iana.org/assignments/media-types/media-types.xhtml
    fun getMimeType(): String {
        return when (this) {
            VIDEO -> "video/mp4"
            M3U8 -> "application/x-mpegURL"
            DASH -> "application/dash+xml"
            TORRENT -> "application/x-bittorrent"
            MAGNET -> "application/x-bittorrent"
        }
    }
}

private fun inferTypeFromUrl(url: String): ExtractorLinkType {
    val path = try {
        URI(url).path
    } catch (_: Throwable) {
        // don't log magnet links as errors
        null
    }
    return when {
        path?.endsWith(".m3u8") == true -> ExtractorLinkType.M3U8
        path?.endsWith(".mpd") == true -> ExtractorLinkType.DASH
        path?.endsWith(".torrent") == true -> ExtractorLinkType.TORRENT
        url.startsWith("magnet:") -> ExtractorLinkType.MAGNET
        else -> ExtractorLinkType.VIDEO
    }
}

val INFER_TYPE: ExtractorLinkType? = null

/**
 * UUID for the ClearKey DRM scheme.
 *
 *
 * ClearKey is supported on Android devices running Android 5.0 (API Level 21) and up.
 */
val CLEARKEY_UUID = UUID(-0x1d8e62a7567a4c37L, 0x781AB030AF78D30EL)

/**
 * UUID for the Widevine DRM scheme.
 *
 *
 * Widevine is supported on Android devices running Android 4.3 (API Level 18) and up.
 */
val WIDEVINE_UUID = UUID(-0x121074568629b532L, -0x5c37d8232ae2de13L)

/**
 * UUID for the PlayReady DRM scheme.
 *
 *
 * PlayReady is supported on all AndroidTV devices. Note that most other Android devices do not
 * provide PlayReady support.
 */
val PLAYREADY_UUID = UUID(-0x65fb0f8667bfbd7aL, -0x546d19a41f77a06bL)

suspend fun newExtractorLink(
    source: String,
    name: String,
    url: String,
    type: ExtractorLinkType? = null,
    initializer: suspend ExtractorLink.() -> Unit = { }
): ExtractorLink {

    @Suppress("DEPRECATION_ERROR")
    val builder =
        ExtractorLink(
            source = source,
            name = name,
            url = url,
            type = type ?: INFER_TYPE
        )

    builder.initializer()
    return builder
}

suspend fun newDrmExtractorLink(
    source: String,
    name: String,
    url: String,
    type: ExtractorLinkType? = null,
    uuid: UUID,
    initializer: suspend DrmExtractorLink.() -> Unit = { }
): DrmExtractorLink {

    @Suppress("DEPRECATION_ERROR")
    val builder =
        DrmExtractorLink(
            source = source,
            name = name,
            url = url,
            uuid = uuid,
            type = type ?: INFER_TYPE
        )

    builder.initializer()
    return builder
}

/** Class holds extracted DRM media info to be passed to the player.
 * @property source Name of the media source, appears on player layout.
 * @property name Title of the media, appears on player layout.
 * @property url Url string of media file
 * @property referer Referer that will be used by network request.
 * @property quality Quality of the media file
 * @property headers Headers <String, String> map that will be used by network request.
 * @property extractorData Used for getExtractorVerifierJob()
 * @property type the type of the media, use [INFER_TYPE] if you want to auto infer the type from the url
 * @property kid  Base64 value of The KID element (Key Id) contains the identifier of the key associated with a license.
 * @property key Base64 value of Key to be used to decrypt the media file.
 * @property uuid Drm UUID [WIDEVINE_UUID], [PLAYREADY_UUID], [CLEARKEY_UUID] (by default) .. etc
 * @property kty Key type "oct" (octet sequence) by default
 * @property keyRequestParameters Parameters that will used to request the key.
 * @see newDrmExtractorLink
 * */
@Suppress("DEPRECATION")
open class DrmExtractorLink private constructor(
    override val source: String,
    override val name: String,
    override val url: String,
    override var referer: String,
    override var quality: Int,
    override var headers: Map<String, String> = mapOf(),
    /** Used for getExtractorVerifierJob() */
    override var extractorData: String? = null,
    override var type: ExtractorLinkType,
    open var kid: String? = null,
    open var key: String? = null,
    open var uuid: UUID,
    open var kty: String? = null,
    open var keyRequestParameters: HashMap<String, String>,
    open var licenseUrl: String? = null,
    override var audioTracks: List<AudioFile> = emptyList(),
) : ExtractorLink(
    source, name, url, referer, quality, headers, extractorData, type, audioTracks
) {
    @Deprecated("Use newDrmExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String? = null,
        quality: Int? = null,
        /** the type of the media, use INFER_TYPE if you want to auto infer the type from the url */
        type: ExtractorLinkType? = INFER_TYPE,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null,
        kid: String? = null,
        key: String? = null,
        uuid: UUID = CLEARKEY_UUID,
        kty: String? = "oct",
        keyRequestParameters: HashMap<String, String> = hashMapOf(),
        licenseUrl: String? = null,
    ) : this(
        source = source,
        name = name,
        url = url,
        referer = referer ?: "",
        quality = quality ?: Qualities.Unknown.value,
        headers = headers,
        extractorData = extractorData,
        type = type ?: inferTypeFromUrl(url),
        kid = kid,
        key = key,
        uuid = uuid,
        keyRequestParameters = keyRequestParameters,
        kty = kty,
        licenseUrl = licenseUrl,
    )

    @Deprecated("Use newDrmExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String,
        quality: Int,
        /** the type of the media, use INFER_TYPE if you want to auto infer the type from the url */
        type: ExtractorLinkType?,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null,
        kid: String? = null,
        key: String? = null,
        uuid: UUID = CLEARKEY_UUID,
        kty: String? = "oct",
        keyRequestParameters: HashMap<String, String> = hashMapOf(),
        licenseUrl: String? = null,
    ) : this(
        source = source,
        name = name,
        url = url,
        referer = referer,
        quality = quality,
        headers = headers,
        extractorData = extractorData,
        type = type ?: inferTypeFromUrl(url),
        kid = kid,
        key = key,
        uuid = uuid,
        keyRequestParameters = keyRequestParameters,
        kty = kty,
        licenseUrl = licenseUrl,
    )
}

/** Class holds extracted media info to be passed to the player.
 * @property source Name of the media source, appears on player layout.
 * @property name Title of the media, appears on player layout.
 * @property url Url string of media file
 * @property referer Referer that will be used by network request.
 * @property quality Quality of the media file
 * @property headers Headers <String, String> map that will be used by network request.
 * @property extractorData Used for getExtractorVerifierJob()
 * @property type Extracted link type (Video, M3u8, Dash, Torrent or Magnet)
 * @property audioTracks List of separate audio tracks that can be used with this video
 * @see newExtractorLink
 * */
open class ExtractorLink
@Deprecated("Use newExtractorLink", level = DeprecationLevel.WARNING)
constructor(
    open val source: String,
    open val name: String,
    override val url: String,
    override var referer: String,
    open var quality: Int,
    override var headers: Map<String, String> = mapOf(),
    /** Used for getExtractorVerifierJob() */
    open var extractorData: String? = null,
    open var type: ExtractorLinkType,
    /** List of separate audio tracks that can be merged with this video */
    open var audioTracks: List<AudioFile> = emptyList(),
) : IDownloadableMinimum {
    val isM3u8: Boolean get() = type == ExtractorLinkType.M3U8
    val isDash: Boolean get() = type == ExtractorLinkType.DASH

    // Cached video size
    private var videoSize: Long? = null

    /**
     * Get video size in bytes with one head request. Only available for ExtractorLinkType.Video
     * @param timeoutSeconds timeout of the head request.
     */
    suspend fun getVideoSize(timeoutSeconds: Long = 3L): Long? {
        // Content-Length is not applicable to other types of formats
        if (this.type != ExtractorLinkType.VIDEO) return null

        videoSize = videoSize ?: runCatching {
            val response =
                app.head(this.url, headers = headers, referer = referer, timeout = timeoutSeconds)
            response.headers["Content-Length"]?.toLong()
        }.getOrNull()

        return videoSize
    }

    @JsonIgnore
    fun getAllHeaders(): Map<String, String> {
        if (referer.isBlank()) {
            return headers
        } else if (headers.keys.none { it.equals("referer", ignoreCase = true) }) {
            return headers + mapOf("referer" to referer)
        }
        return headers
    }

    @Suppress("DEPRECATION")
    @Deprecated("Use newExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String? = null,
        quality: Int? = null,
        /** the type of the media, use INFER_TYPE if you want to auto infer the type from the url */
        type: ExtractorLinkType? = INFER_TYPE,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null,
    ) : this(
        source = source,
        name = name,
        url = url,
        referer = referer ?: "",
        quality = quality ?: Qualities.Unknown.value,
        headers = headers,
        extractorData = extractorData,
        type = type ?: inferTypeFromUrl(url)
    )

    @Suppress("DEPRECATION")
    @Deprecated("Use newExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String,
        quality: Int,
        /** the type of the media, use INFER_TYPE if you want to auto infer the type from the url */
        type: ExtractorLinkType?,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null,
    ) : this(
        source = source,
        name = name,
        url = url,
        referer = referer,
        quality = quality,
        headers = headers,
        extractorData = extractorData,
        type = type ?: inferTypeFromUrl(url)
    )

    /**
     * Old constructor without isDash, allows for backwards compatibility with extensions.
     * Should be removed after all extensions have updated their novacast.jar
     **/
    @Suppress("DEPRECATION_ERROR")
    @Deprecated("Use newExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String,
        quality: Int,
        isM3u8: Boolean = false,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null
    ) : this(source, name, url, referer, quality, isM3u8, headers, extractorData, false)

    @Suppress("DEPRECATION")
    @Deprecated("Use newExtractorLink", level = DeprecationLevel.ERROR)
    constructor(
        source: String,
        name: String,
        url: String,
        referer: String,
        quality: Int,
        isM3u8: Boolean = false,
        headers: Map<String, String> = mapOf(),
        /** Used for getExtractorVerifierJob() */
        extractorData: String? = null,
        isDash: Boolean,
    ) : this(
        source = source,
        name = name,
        url = url,
        referer = referer,
        quality = quality,
        headers = headers,
        extractorData = extractorData,
        type = if (isDash) ExtractorLinkType.DASH else if (isM3u8) ExtractorLinkType.M3U8 else ExtractorLinkType.VIDEO
    )

    override fun toString(): String {
        return "ExtractorLink(name=$name, url=$url, referer=$referer, type=$type)"
    }
}

/**
 * Removes https:// and www.
 * To match urls regardless of schema, perhaps Uri() can be used?
 */
val schemaStripRegex = Regex("""^(https:|)//(www\.|)""")

enum class Qualities(var value: Int, val defaultPriority: Int) {
    Unknown(400, 4),
    P144(144, 0), // 144p
    P240(240, 2), // 240p
    P360(360, 3), // 360p
    P480(480, 4), // 480p
    P720(720, 5), // 720p
    P1080(1080, 6), // 1080p
    P1440(1440, 7), // 1440p
    P2160(2160, 8); // 4k or 2160p

    companion object {
        fun getStringByInt(qual: Int?): String {
            return when (qual) {
                0 -> "Auto"
                Unknown.value -> ""
                P2160.value -> "4K"
                null -> ""
                else -> "${qual}p"
            }
        }

        fun getStringByIntFull(quality: Int): String {
            return when (quality) {
                0 -> "Auto"
                Unknown.value -> "Unknown"
                P2160.value -> "4K"
                else -> "${quality}p"
            }
        }
    }
}

fun getQualityFromName(qualityName: String?): Int {
    if (qualityName == null)
        return Qualities.Unknown.value

    val match = qualityName.lowercase().replace("p", "").trim()
    return when (match) {
        "4k" -> Qualities.P2160
        else -> null
    }?.value ?: match.toIntOrNull() ?: Qualities.Unknown.value
}

private val packedRegex = Regex("""eval\(function\(p,a,c,k,e,.*\)\)""")
fun getPacked(string: String): String? {
    return packedRegex.find(string)?.value
}

fun getAndUnpack(string: String): String {
    val packedText = getPacked(string)
    return JsUnpacker(packedText).unpack() ?: string
}

suspend fun unshortenLinkSafe(url: String): String {
    return try {
        if (ShortLink.isShortLink(url))
            ShortLink.unshorten(url)
        else url
    } catch (e: Exception) {
        logError(e)
        url
    }
}

suspend fun loadExtractor(
    url: String,
    subtitleCallback: (SubtitleFile) -> Unit,
    callback: (ExtractorLink) -> Unit
): Boolean {
    return loadExtractor(
        url = url,
        referer = null,
        subtitleCallback = subtitleCallback,
        callback = callback
    )
}


/**
 * Tries to load the appropriate extractor based on link, returns true if any extractor is loaded.
 * */
@Throws(CancellationException::class)
suspend fun loadExtractor(
    url: String,
    referer: String? = null,
    subtitleCallback: (SubtitleFile) -> Unit,
    callback: (ExtractorLink) -> Unit
): Boolean {
    // Ensure this coroutine has not timed out
    coroutineScope { ensureActive() }

    val currentUrl = unshortenLinkSafe(url)
    val compareUrl = currentUrl.lowercase().replace(schemaStripRegex, "")

    // Iterate in reverse order so the new registered ExtractorApi takes priority
    for (index in extractorApis.lastIndex downTo 0) {
        val extractor = extractorApis[index]
        if (compareUrl.startsWith(extractor.mainUrl.replace(schemaStripRegex, ""))) {
            try {
                extractor.getUrl(currentUrl, referer, subtitleCallback, callback)
            } catch (e: Exception) {
                logError(e)
                // Rethrow if we have timed out
                if (e is CancellationException) {
                    throw e
                }
            }
            return true
        }
    }

    // this is to match mirror domains - like example.com, example.net
    for (index in extractorApis.lastIndex downTo 0) {
        val extractor = extractorApis[index]
        if (FuzzySearch.partialRatio(
                extractor.mainUrl,
                currentUrl
            ) > 80
        ) {
            try {
                extractor.getUrl(currentUrl, referer, subtitleCallback, callback)
            } catch (e: Exception) {
                logError(e)
                // Rethrow if we have timed out
                if (e is CancellationException) {
                    throw e
                }
            }
            return true
        }
    }

    return false
}

val extractorApis: MutableList<ExtractorApi> = arrayListOf(
    //AllProvider(),
    Mp4Upload(),
    StreamTape(),
    StreamTapeNet(),
    ShaveTape(),
    StreamTapeXyz(),
    Watchadsontape(),

    //mixdrop extractors
    MixDropBz(),
    MixDropCh(),
    MixDropTo(),
    MixDropAg(),
    MixDrop(),
    MixDropPs(),
    Mdy(),
    MxDropTo(),
    MixDropSi(),

    XStreamCdn(),

    StreamSB(),
    Sblona(),
    Vidgomunimesb(),
    StreamSilk(),
    StreamSB1(),
    StreamSB2(),
    StreamSB3(),
    StreamSB4(),
    StreamSB5(),
    StreamSB6(),
    StreamSB7(),
    StreamSB8(),
    StreamSB9(),
    StreamSB10(),
    StreamSB11(),
    SBfull(),
    // Streamhub(), cause Streamhub2() works
    Streamhub2(),
    Ssbstream(),
    Sbthe(),
    Vidgomunime(),
    Sbflix(),
    Streamsss(),
    Sbspeed(),
    Sbsonic(),
    Sbface(),
    Sbrapid(),
    Lvturbo(),

    Fastream(),
    Videa(),
    FEmbed(),
    FeHD(),
    Fplayer(),
    DBfilm(),
    Luxubu(),
    LayarKaca(),
    Rasacintaku(),
    FEnet(),
    Kotakajair(),
    Cdnplayer(),
    //  WatchSB(), 'cause StreamSB.kt works
    Uqload(),
    Uqload1(),
    Uqload2(),
    Uqloadcx(),
    Uqloadbz(),
    Evoload(),
    Evoload1(),
    UpstreamExtractor(),

    Odnoklassniki(),
    TauVideo(),
    SibNet(),
    ContentX(),
    Hotlinger(),
    FourCX(),
    PlayRu(),
    FourPlayRu(),
    Pichive(),
    FourPichive(),
    HDMomPlayer(),
    HDPlayerSystem(),
    VideoSeyred(),
    PeaceMakerst(),
    HDStreamAble(),
    RapidVid(),
    TRsTX(),
    VidMoxy(),
    Sobreatsesuyp(),
    PixelDrain(),
    PixelDrainDev(),
    MailRu(),

    OkRuSSL(),
    OkRuSSLMobile(),
    OkRuHTTP(),
    OkRuHTTPMobile(),
    Sendvid(),

    // dood extractors
    DoodCxExtractor(),
    DoodPmExtractor(),
    DoodToExtractor(),
    DoodSoExtractor(),
    DoodLaExtractor(),
    Dooood(),
    D0000d(),
    D000dCom(),
    DoodstreamCom(),
    DoodWsExtractor(),
    DoodShExtractor(),
    DoodWatchExtractor(),
    DoodWfExtractor(),
    DoodYtExtractor(),
    Doodspro(),
    Dsvplay(),

    // GenericM3U8(),
    Zplayer(),
    ZplayerV2(),
    Upstream(),

    Maxstream(),
    Tantifilm(),
    Userload(),
    Supervideo(),

    // StreamSB.kt works
    //  SBPlay(),
    //  SBPlay1(),
    //  SBPlay2(),

    PlayerVoxzer(),

    Blogger(),
    YourUpload(),

    Hxfile(),
    KotakAnimeid(),
    Neonime8n(),
    Neonime7n(),
    Yufiles(),
    Aico(),

    JWPlayer(),
    Meownime(),
    DesuArcg(),
    DesuOdchan(),
    DesuOdvip(),
    DesuDrive(),


    Keephealth(),
    Sbnet(),
    Sbasian(),
    Sblongvu(),
    Fembed9hd(),
    StreamM4u(),
    Krakenfiles(),
    Gofile(),
    Vicloud(),
    Uservideo(),
    Userscloud(),

    Movhide(),
    StreamhideCom(),
    StreamhideTo(),
    Wibufile(),
    FileMoonIn(),
    Moviesm4u(),
    Filesim(),
    Multimoviesshg(),
    Ahvsh(),
    Guccihide(),
    FileMoon(),
    FileMoonSx(),
    FilemoonV2(),

    Vido(),
    Linkbox(),
    Acefile(),
    Minoplres(), // formerly SpeedoStream
    Embedgram(),
    Mvidoo(),
    Streamplay(),
    Vidmoly(),
    Vidmolyme(),
    Vidmolyto(),
    Vidmolybiz(),
    Voe(),
    Voe1(),
    Tubeless(),
    Moviehab(),
    MoviehabNet(),
    Jeniusplay(),
    StreamoUpload(),
    Streamup(),
    Streamix(),
    Vidara(),

    GamoVideo(),
    Gdriveplayerapi(),
    Gdriveplayerapp(),
    Gdriveplayerfun(),
    Gdriveplayerio(),
    Gdriveplayerme(),
    Gdriveplayerbiz(),
    Gdriveplayerorg(),
    Gdriveplayerus(),
    Gdriveplayerco(),
    GoodstreamExtractor(),
    Gdriveplayer(),
    DatabaseGdrive(),
    DatabaseGdrive2(),
    Mediafire(),

    YoutubeExtractor(),
    YoutubeShortLinkExtractor(),
    YoutubeMobileExtractor(),
    YoutubeNoCookieExtractor(),
    Streamlare(),
    PlayLtXyz(),

    Cda(),
    Dailymotion(),
    Ztreamhub(),
    Rabbitstream(),
    Dokicloud(),
    Megacloud(),
    VidhideExtractor(),
    VidHidePro(),
    VidHidePro1(),
    VidHidePro2(),
    VidHidePro3(),
    VidHidePro4(),
    VidHidePro5(),
    VidHidePro6(),
    VidHideHub(),
    Ryderjet(),
    VidNest(),
    Dhtpre(),

    // CineMM Redirects
    Dhcplay(),
    HglinkTo(),

    // CineMM mirrors
    HgplayCDN(),
    Habetar(),
    Yuguaab(),
    Guxhag(),
    Auvexiug(),
    Xenolyzb(),
    Haxloppd(),
    Cavanhabg(),
    Dumbalag(),
    Uasopt(),

    Smoothpre(),
    Peytonepre(),
    LuluStream(),
    Lulustream1(),
    Lulustream2(),
    Luluvdoo(),
    StreamWishExtractor(),
    StreamHLS(),
    BigwarpIO(),
    BigwarpArt(),
    BgwpCC(),
    WishembedPro(),
    CdnwishCom(),
    FlaswishCom(),
    SfastwishCom(),
    Playerwish(),
    StreamEmbed(),
    EmturbovidExtractor(),
    Vtbe(),
    SecvideoOnline(),
    FsstOnline(),
    CsstOnline(),
    DsstOnline(),
    Simpulumlamerop(),
    Urochsunloath(),
    NathanFromSubject(),
    Yipsu(),
    MetaGnathTuggers(),
    Geodailymotion(),
    Mwish(),
    Dwish(),
    Ewish(),
    Kswplayer(),
    Wishfast(),
    Streamwish2(),
    Strwish(),
    Strwish2(),
    Awish(),
    Obeywish(),
    Jodwish(),
    Swhoi(),
    Multimovies(),
    UqloadsXyz(),
    Doodporn(),
    Asnwish(),
    Nekowish(),
    Nekostream(),
    Swdyu(),
    Wishonly(),
    Ds2play(),
    Ds2video(),
    Vidsonic(),
    InternetArchive(),
    VidStack(),
    GDMirrorbot(),
    Techinmind(),
    Server1uns(),
    VinovoSi(),
    VinovoTo(),
    Vidoza(),
    Videzz(),
    CloudMailRu(),
    HubCloud(),
    VkExtractor(),
    Bysezejataos(),
    ByseSX(),
    ByseVepoin(),
    ByseBuho(),
    MyVidPlay(),
    Vide0Net(),
    Up4Stream(),
    Up4FunTop(),
    GUpload(),
    HlsWish(),
    ByseQekaho(),
)


fun getExtractorApiFromName(name: String): ExtractorApi {
    for (api in extractorApis) {
        if (api.name == name) return api
    }
    return extractorApis[0]
}

fun requireReferer(name: String): Boolean {
    return getExtractorApiFromName(name).requiresReferer
}

fun httpsify(url: String): String {
    return if (url.startsWith("//")) "https:$url" else url
}

suspend fun getPostForm(requestUrl: String, html: String): String? {
    val document = Jsoup.parse(html)
    val inputs = document.select("Form > input")
    if (inputs.size < 4) return null
    var op: String? = null
    var id: String? = null
    var mode: String? = null
    var hash: String? = null

    for (input in inputs) {
        val value = input.attr("value")
        when (input.attr("name")) {
            "op" -> op = value
            "id" -> id = value
            "mode" -> mode = value
            "hash" -> hash = value
            else -> Unit
        }
    }
    if (op == null || id == null || mode == null || hash == null) {
        return null
    }
    delay(5000) // ye this is needed, wont work with 0 delay

    return app.post(
        requestUrl,
        headers = mapOf(
            "content-type" to "application/x-www-form-urlencoded",
            "referer" to requestUrl,
            "user-agent" to USER_AGENT,
            "accept" to "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"
        ),
        data = mapOf("op" to op, "id" to id, "mode" to mode, "hash" to hash)
    ).text
}

fun ExtractorApi.fixUrl(url: String): String {
    if (url.startsWith("http") ||
        // Do not fix JSON objects when passed as urls.
        url.startsWith("{\"")
    ) {
        return url
    }
    if (url.isEmpty()) {
        return ""
    }

    val startsWithNoHttp = url.startsWith("//")
    if (startsWithNoHttp) {
        return "https:$url"
    } else {
        if (url.startsWith('/')) {
            return mainUrl + url
        }
        return "$mainUrl/$url"
    }
}

abstract class ExtractorApi {
    abstract val name: String
    abstract val mainUrl: String
    abstract val requiresReferer: Boolean

    /** Determines which plugin a given provider is from. This is the full path to the plugin. */
    var sourcePlugin: String? = null

    //suspend fun getSafeUrl(url: String, referer: String? = null): List<ExtractorLink>? {
    //    return safeAsync { getUrl(url, referer) }
    //}

    // this is the new extractorapi, override to add subtitles and stuff
    @Throws
    open suspend fun getUrl(
        url: String,
        referer: String? = null,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        getUrl(url, referer)?.forEach(callback)
    }

    suspend fun getSafeUrl(
        url: String,
        referer: String? = null,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ) {
        try {
            getUrl(url, referer, subtitleCallback, callback)
        } catch (e: Exception) {
            logError(e)
        }
    }

    /**
     * Will throw errors, use getSafeUrl if you don't want to handle the exception yourself
     */
    @Throws
    open suspend fun getUrl(url: String, referer: String? = null): List<ExtractorLink>? {
        return emptyList()
    }

    open fun getExtractorUrl(id: String): String {
        return id
    }
}
