package com.example.imagepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.example.imagepicker.ui.theme.DeepBlue
import com.example.imagepicker.ui.theme.ImagePickerTheme

class ConsLayout : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagePickerTheme() {
                HomeScreen()
                /*var constraintSet = ConstraintSet {

                    val greenBox = createRefFor("green")
                    val redBox = createRefFor("red")
                    val guideline = createGuidelineFromTop(0.5f)

                    constrain(greenBox){
                        top.linkTo(guideline)
                        start.linkTo(parent.start)
                        height = Dimension.value(100.dp)
                        width = Dimension.value(100.dp)
                    }

                    constrain(redBox){
                        top.linkTo(parent.top)
                        start.linkTo(greenBox.end)
                        height = Dimension.value(100.dp)
                        width = Dimension.value(100.dp)
                    }
                  //  createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Packed)
                  //  createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.Spread)
                    createHorizontalChain(greenBox,redBox, chainStyle = ChainStyle.SpreadInside)
                }

                ConstraintLayout(constraintSet, modifier = Modifier.fillMaxSize()) {
                    Box(modifier = Modifier.background(Color.Green).layoutId("green"),)
                    Box(modifier = Modifier.background(Color.Red).layoutId("red"),)
                }*/

            }
        }
    }

}