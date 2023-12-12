package com.pmdm.primeraappcompose

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.pmdm.primeraappcompose.ui.theme.PrimeraAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeraAppComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FirstApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}



@Composable
fun ConstraintExample(){
    ConstraintLayout(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        val(box1, box2, box3, box4, box5, box6, box7, box8, box9) = createRefs()
        val tamanyo = 65

        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Blue).constrainAs(box1) {
            bottom.linkTo(box2.top)
            start.linkTo(box2.end)
        })

        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Cyan).constrainAs(box2) {
            bottom.linkTo(box4.top)
            end.linkTo(box4.start)
        })
        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Cyan).constrainAs(box3) {
            bottom.linkTo(box4.top)
            start.linkTo(box4.end)
        })

        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Black).constrainAs(box4) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
        })

        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Cyan).constrainAs(box5) {
            top.linkTo(box4.bottom)
            end.linkTo(box4.start)
        })
        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Cyan).constrainAs(box6) {
            top.linkTo(box4.bottom)
            start.linkTo(box4.end)
        })

        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Blue).constrainAs(box7) {
            top.linkTo(box5.bottom)
            end.linkTo(box5.start)
        })
        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Blue).constrainAs(box8) {
            top.linkTo(box5.bottom)
            start.linkTo(box5.end)
        })
        Box(modifier = Modifier.size(tamanyo.dp).background(Color.Blue).constrainAs(box9) {
            top.linkTo(box6.bottom)
            start.linkTo(box6.end)
        })
    }
}

@Composable
fun FirstApp() {
    Column(
        modifier = Modifier
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Título",
            modifier = Modifier
                .background(Color.Blue),

            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Subtítulo",
            modifier = Modifier
                .background(Color.Gray),
            fontSize = 20.sp
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Opción 1",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
            Text(
                text = "Opción 2",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
            Text(
                text = "Opción 3",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Texto 1",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
            Text(
                text = "Texto 2",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
            Text(
                text = "Texto 3",
                modifier = Modifier
                    .background(Color.Blue),
                textAlign = TextAlign.Center,
                fontSize = 20.sp,
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeraAppComposeTheme {
        ConstraintExample()
    }
}