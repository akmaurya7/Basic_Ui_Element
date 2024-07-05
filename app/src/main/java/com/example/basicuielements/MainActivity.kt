package com.example.basicuielements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.basicuielements.ui.theme.BasicUiElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            BasicUiElementsTheme {
                val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = "ButtonScreen",
                    ) {
                        composable("ButtonScreen") {
                            Button(navController)
                        }
                        composable("CardScreen"){
                            CardScreen(navController = navController)
                        }
                        composable("CardScreen"){
                            CardScreen(navController = navController)
                        }
                        composable("ChipScreen"){
                            ChipScreen(navController = navController)
                        }
                        composable("SliderScreen"){
                            SliderScreen(navController = navController)
                        }
                        composable("SwitchScreen"){
                            SwitchScreen(navController = navController)
                        }
                        composable("DividerScreen"){
                            DividerScreen(navController = navController)
                        }
                        composable("ProgressIndicatorScreen"){
                            ProgressIndicatorScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }

