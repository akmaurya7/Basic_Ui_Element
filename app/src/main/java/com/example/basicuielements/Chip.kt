package com.example.basicuielements

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ChipScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        Text(text = "Assit Chip: ", fontSize = 24.sp)
        AssistChip(
            onClick = {  },
            label = { Text("Assist chip") },
            leadingIcon = {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Localized description",
                    Modifier.size(AssistChipDefaults.IconSize)
                )
            }
        )

        Spacer(modifier = Modifier.padding(8.dp))

        Text(text = "Filter Chip",fontSize = 24.sp)

        var selectedCycle by remember { mutableStateOf(false) }
        var selectedCar by remember { mutableStateOf(false) }
        var selectedPrivateJet by remember { mutableStateOf(false) }
        Row {
            FilterChip(
                onClick = { selectedCycle = !selectedCycle },
                label = {
                    Text("Cycle")
                },
                selected = selectedCycle,
                leadingIcon = if (selectedCycle) {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
            Spacer(modifier = Modifier.padding(8.dp))
            FilterChip(
                onClick = { selectedCar = !selectedCar },
                label = {
                    Text("Car")
                },
                selected = selectedCar,
                leadingIcon = if (selectedCar) {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )

            Spacer(modifier = Modifier.padding(8.dp))

            FilterChip(
                onClick = { selectedPrivateJet = !selectedPrivateJet},
                label = {
                    Text("private jet")
                },
                selected = selectedPrivateJet,
                leadingIcon = if (selectedPrivateJet) {
                    {
                        Icon(
                            imageVector = Icons.Filled.Done,
                            contentDescription = "Done icon",
                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                        )
                    }
                } else {
                    null
                },
            )
        }
        
        Text(text = "Input Chip",fontSize = 24.sp)

        Row {
            var enabled1 by remember { mutableStateOf(true) }
            if (!enabled1) return

            InputChip(
                onClick = {
                    enabled1 = !enabled1
                },
                label = { Text("Input Chip") },
                selected = enabled1,
                avatar = {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Localized description",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                },
                trailingIcon = {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "Localized description",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            )

            Spacer(modifier = Modifier.padding(8.dp))
            var enabled2 by remember { mutableStateOf(true) }
            if (!enabled2) return

            InputChip(
                onClick = {
                    enabled2 = !enabled2
                },
                label = { Text("Input Chip") },
                selected = enabled2,
                avatar = {
                    Icon(
                        Icons.Filled.Person,
                        contentDescription = "Localized description",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                },
                trailingIcon = {
                    Icon(
                        Icons.Default.Close,
                        contentDescription = "Localized description",
                        Modifier.size(InputChipDefaults.AvatarSize)
                    )
                }
            )
        }
    }
}