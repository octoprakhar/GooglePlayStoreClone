package com.example.googleplaystorew1.gamescreenhelpers

import android.content.Context
import android.net.Uri
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import com.example.googleplaystorew1.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VideoAdvertisementPager(context: Context){

    val videoAdvertisementContentList : List<VideoAdvertisementContentItems> = listOf(
        VideoAdvertisementContentItems(
            name = "Carrom Pool: Disc Game",
            description = "sports : Billiards : Casual : Offline",
            rating = "4.5",
            space = "97",
            logo = R.drawable.carromimage,
            videoFileName = "carromvideo"
        ),
        VideoAdvertisementContentItems(
            name = "Desert Riders: Car Battle Game",
            description = "Action : Vehicle Combat",
            rating = "4.3",
            space = "62",
            logo = R.drawable.desertcarimage,
            videoFileName = "desertcarvideo"
        ),
        VideoAdvertisementContentItems(
            name = "DRAGON VILLAGE",
            description = "Tap Pocket : Simulation : Breeding",
            rating = "4.4",
            space = "100",
            logo = R.drawable.dragonimage,
            videoFileName = "dragonvideo"
        )
    )

    val pagerState = rememberPagerState (
        pageCount = {videoAdvertisementContentList.size}
    )
    HorizontalPager(state = pagerState) { page: Int ->
        VideoAdvertisementContent(context = context, videoAdvertisementContentItems = videoAdvertisementContentList[page] )

    }

}

@Composable
fun VideoAdvertisementContent(context: Context,videoAdvertisementContentItems: VideoAdvertisementContentItems){
    val videoUri = Uri.parse("android.resource://${context.packageName}/raw/${videoAdvertisementContentItems.videoFileName}")
    val imageBitmap = ImageBitmap.imageResource(id = videoAdvertisementContentItems.logo)
    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .padding(8.dp)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .weight(2f)
                .padding(4.dp)
            ){

                VideoPlayer(videoUri = videoUri, modifier = Modifier.fillMaxSize())

            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            ){
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .weight(1f)

                ){
                    Image(
                        bitmap = imageBitmap,
                        contentDescription = null,
                        contentScale = ContentScale.Fit
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(3f)
                        .padding(start = 4.dp)
                ) {
                    Text(text = videoAdvertisementContentItems.name)
                    Text(text = videoAdvertisementContentItems.description)
                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Start
                    ){
                        Text(text = videoAdvertisementContentItems.rating)
                        Text(text = "    ${videoAdvertisementContentItems.space}MB")

                    }
                }
            }

        }

    }
}

@Composable
fun VideoPlayer(
    modifier: Modifier = Modifier,
    videoUri: Uri
){
    val context = LocalContext.current

    //Remember exoplayer instance
    val exoPlayer = remember {
        initializePlayer(context,videoUri)
    }

    DisposableEffect(
        AndroidView(factory = {
            PlayerView(context).apply {
                player = exoPlayer
                useController = true
                layoutParams = FrameLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT

                )
            }
        },
            modifier = modifier
        )
    ){
        onDispose {
            exoPlayer.release()
        }
    }
}

fun initializePlayer(context: Context, videoUri: Uri): ExoPlayer{
    val exoPlayer = ExoPlayer.Builder(context).build()
    val mediaItem = MediaItem.fromUri(videoUri)
    exoPlayer.setMediaItem(mediaItem)
    exoPlayer.prepare()
    exoPlayer.playWhenReady = true
    return exoPlayer
}

data class VideoAdvertisementContentItems(
    val name : String,
    val description : String,
    val rating: String,
    val space : String,
    val logo : Int,
    val videoFileName : String
)