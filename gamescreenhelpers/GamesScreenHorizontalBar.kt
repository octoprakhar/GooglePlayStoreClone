package com.example.googleplaystorew1.gamescreenhelpers

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.googleplaystorew1.multiscreensuihelpers.BlendingTwoBackgroundsInBoxLayout
import com.example.googleplaystorew1.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GamesScreenHorizontalBar(){

    val horizontalBarContentItemsList : List<HorizontalBarContentItems> = listOf(
        HorizontalBarContentItems(
            name = "Sniper 3D : Gun Shooting games",
            title = "Get ready for an epic event!",
            offer = "Ends in 1 day",
            description = "wildlife Studios",
            rating = "4.2",
            ageLimit = "12",
            backgroundImage = R.drawable.ghostskeleton,
            ageLimitImage = R.drawable.pegitwelve,
            logo = R.drawable.sniper,
            backgroundColorLight = 0xFFffdf87,
            backgroundColorDark = 0xFFa37903,
            offerBackgroundColor = 0xFFe0decc
        ),
        HorizontalBarContentItems(
            name = "Squad Busters",
            title = "Explore a land fresh out of the centre of the Earth in Lava World",
            offer = "Update Available",
            description = "Supercell",
            rating = "4.1",
            ageLimit = "7",
            backgroundImage = R.drawable.lavacity,
            ageLimitImage = R.drawable.pegiseven,
            logo = R.drawable.squalbuster,
            backgroundColorLight = 0xFFde481b,
            backgroundColorDark = 0xFF7a2005,
            offerBackgroundColor = 0xFFa1064c
        ),
        HorizontalBarContentItems(
            name = "Ant Legion: For The Swarm",
            title = "Ant Legion Heads to the Beach in Summer",
            offer = "Ends in 6 day",
            description = "37GAMES",
            rating = "4.1",
            ageLimit = "12",
            backgroundImage = R.drawable.beachworld,
            ageLimitImage = R.drawable.pegitwelve,
            logo = R.drawable.antworld,
            backgroundColorLight = 0xFF34c0eb,
            backgroundColorDark = 0xFF056785,
            offerBackgroundColor = 0xFF76d7f5
        )
    )

    val pagerState = rememberPagerState (
        pageCount = {horizontalBarContentItemsList.size}
    )
    
    HorizontalPager(
        state = pagerState
    ) {page: Int ->
        HorizontalBarContent(items = horizontalBarContentItemsList[page])
    }

}

@Composable
fun HorizontalBarContent(items: HorizontalBarContentItems){

    fun String.truncate(maxLength: Int): String {
        return if (this.length > maxLength) {
            this.substring(0, maxLength) + "..."
        } else {
            this
        }
    }

    val sniperImageBitmap = ImageBitmap.imageResource(id = items.logo)
    val pegiTwelveBitmap = ImageBitmap.imageResource(id = items.ageLimitImage)

    BlendingTwoBackgroundsInBoxLayout(
        image = items.backgroundImage,
        color = items.backgroundColorLight,
        imageAlpha = 0.9f,
        externalBoxHeight = 250.dp,
        externalBoxPadding = 8.dp,
        imageCoverFactor = 0.5
    )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Text(text = items.offer, modifier = Modifier.background(Color(items.offerBackgroundColor)))
            Spacer(modifier = Modifier.weight(1f))
            Column (
                verticalArrangement = Arrangement.Bottom
            ){
                Text(text = items.title, fontSize = 26.sp, fontWeight = FontWeight.Bold)
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, start = 8.dp, end = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Box(
                        modifier = Modifier
                            .size(100.dp)
                            .weight(1f)
                    ){
                        Image(
                            bitmap = sniperImageBitmap,
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Fit
                        )

                    }
                    Column(
                        modifier = Modifier
                            .padding(4.dp)
                            .weight(2f)
                    ){
                        Text(text = items.name.truncate(18))
                        Text(text = items.description, fontSize = 12.sp)
                        Row (
                            modifier = Modifier.fillMaxWidth(),
//                            horizontalArrangement = Arrangement.SpaceAround,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Row (
                                modifier = Modifier.padding(end = 4.dp)
                            ){
                                Text(text = items.rating, fontSize = 10.sp)
                                Box(modifier = Modifier
                                    .size(14.dp)
                                    ){
                                    Icon(painter = painterResource(id =
                                    R.drawable.baseline_star_24
                                    ), contentDescription =null )
                                }
                            }
                            Row{
                                Box(modifier = Modifier
                                    .size(14.dp)
                                    ){
                                    Image(
                                        bitmap = pegiTwelveBitmap,
                                        contentDescription = null,
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Fit
                                    )
                                }
                                Text(text = "Rated for ${items.ageLimit}+", fontSize = 10.sp)
                            }
                        }
                        Text(text = "Contains ads", fontSize = 10.sp)
                    }
                    Column (
                        modifier = Modifier
//                            .border(2.dp, Color.Black)
                            .weight(1f),
                        verticalArrangement = Arrangement.Center
                    ){
                        FilledTonalButton(
                            onClick = { /*TODO*/ },
                            colors = ButtonColors(
                                containerColor = Color(items.backgroundColorDark),
                                contentColor = Color.Black ,
                                disabledContentColor = Color.Black,
                                disabledContainerColor = Color(items.backgroundColorDark)
                            )
                        ) {
                            Text(text = "Install")
                        }
                        Text(text = "In-app purchases", fontSize = 8.sp, modifier = Modifier.padding(start = 6.dp))
                    }
                }
            }
        }
    }


}

data class HorizontalBarContentItems(
    val name : String,
    val title : String,
    val offer : String,
    val description: String,
    val rating : String,
    val ageLimit : String,
    val backgroundImage : Int,
    val ageLimitImage: Int,
    val logo: Int,
    val backgroundColorLight: Long,
    val backgroundColorDark : Long,
    val offerBackgroundColor : Long
)