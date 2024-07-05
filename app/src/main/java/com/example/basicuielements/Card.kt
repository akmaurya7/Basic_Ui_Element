package com.example.basicuielements

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.material3.*
import androidx.compose.ui.graphics.RectangleShape

@Composable
fun CardScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Card(
            modifier = Modifier
                .width(200.dp)
                .height(350.dp),

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.dogimage),
                    contentDescription ="",
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(RoundedCornerShape(10))
                )
                //Spacer(modifier = Modifier.padding(8.dp))

                Text(
                    text = "Animal: Dog",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "Age: 10yr",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Justify
                )
                Text(
                    text = "Name: Kalu",
                    fontSize = 35.sp,
                    textAlign = TextAlign.Justify
                )

                Spacer(modifier = Modifier.padding(8.dp))
                Button(onClick = { navController.navigate("ButtonScreen") },
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Now go back")
                }
            }

        }
    }
}

