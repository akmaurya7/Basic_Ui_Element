package com.example.basicuielements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

    @Composable
    fun Button(navController: NavController) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                androidx.compose.material3.Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Normal Button")
                }

                Spacer(modifier = Modifier.padding(8.dp))

                FilledTonalButton(onClick = { /*TODO*/ }) {
                    Text(text = "Filled Tonal Button")

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Outlined Button")

                }

                Spacer(modifier = Modifier.padding(8.dp))

                ElevatedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Elevated Button")

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    Text(text = "FAB Button")
                }

                Spacer(modifier = Modifier.padding(8.dp))

                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "TextField Button")
                }
            }
            Spacer(modifier = Modifier.padding(16.dp))
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                androidx.compose.material3.Button(onClick = { navController.navigate("CardScreen")},shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Card")
                }

                androidx.compose.material3.Button(onClick = { navController.navigate("ChipScreen")},shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Chip")
                }
                androidx.compose.material3.Button(onClick = { navController.navigate("SliderScreen")},shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Slider")
                }
                androidx.compose.material3.Button(onClick = { navController.navigate("SwitchScreen")},shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Switch")
                }
                androidx.compose.material3.Button(onClick = { navController.navigate("DividerScreen") },shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Divider")
                }
                androidx.compose.material3.Button(onClick = { navController.navigate("ProgressIndicatorScreen")},shape = RoundedCornerShape(8.dp)) {
                    Text(text = "Click to Preview Progress")
                }
            }

        }
    }
