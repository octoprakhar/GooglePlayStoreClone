package com.example.googleplaystorew1.multiscreensuihelpers

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize

@Composable
fun BlendingTwoBackgroundsInBoxLayout(
    image : Int,
    color: Long,
    imageAlpha : Float,
    externalBoxHeight : Dp,
    externalBoxPadding : Dp,
    imageCoverFactor : Double,
    content : @Composable () -> Unit
){
    val imageBitmap = ImageBitmap.imageResource(id = image)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(externalBoxHeight)
            .padding(externalBoxPadding)
            .drawBehind {
                val width = size.width
                val height = size.height


                //drawing image in upper half
                drawImage(
                    image = imageBitmap,
                    dstSize = IntSize(width.toInt(), (height * imageCoverFactor).toInt()),
                    alpha = imageAlpha
                )

                //Drawing other color in second half
                drawRect(
                    color = Color(color),
                    topLeft = Offset(0f, (height * imageCoverFactor).toFloat()),
                    size = Size(width, (height * (1 - imageCoverFactor)).toFloat())
                )

                //Blending the image and the color
                drawRect(
                    brush = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color(color)),
                        startY = (height * imageCoverFactor).toFloat() - 150,
                        endY = (height * imageCoverFactor).toFloat() + 150
                    ),
                    size = Size(width, (height * imageCoverFactor).toFloat())
                )

            }
            .clickable(onClick = {/*TODO*/ })

    ){
        content()
    }
}