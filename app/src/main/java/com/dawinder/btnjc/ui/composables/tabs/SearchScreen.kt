package com.dawinder.btnjc.ui.composables.tabs

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dawinder.btnjc.R
import kotlin.random.Random

/**
 * Composable function that represents the search screen of the application.
 */
@Composable
fun SearchScreen() {
    val finalGuess = remember { mutableStateOf("") }
    val chance = remember { mutableStateOf(3) }
    val helperText = remember { mutableStateOf("Give a number") }
    val randomNumber = remember { mutableStateOf(5) }
    val screenState = remember {
        mutableStateOf(0)
    }

    LaunchedEffect(key1 = true) {
        randomNumber.value = Random.nextInt(101) // 0-100
    }

    if (screenState.value == 0)
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Chance: ${chance.value}",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            Text(
                text = "Help: ${helperText.value}",
                fontSize = 24.sp,
                color = Color.Black
            )
            TextField(
                value = finalGuess.value,
                onValueChange = {
                    finalGuess.value = it
                },
                label = {
                    Text(text = "Guess")
                }
            )
            Button(
                onClick = {
                    chance.value = chance.value - 1
                    val predictedNumber = finalGuess.value.toInt()

                    if (predictedNumber == randomNumber.value) {
                        screenState.value = 1
                    }
                    if (predictedNumber > randomNumber.value) {
                        helperText.value = "Decrease"
                    }
                    if (predictedNumber < randomNumber.value) {
                        helperText.value = "Increase"
                    }
                    if (chance.value == 0) {
                        screenState.value = 2
                    }
                    finalGuess.value = ""
                },
                modifier = Modifier.size(150.dp, 50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(
                    text = "Guess",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
            }
        }

    if (screenState.value == 1 || screenState.value == 2)
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            if (screenState.value == 1) {
                Text(
                    text = "You win!",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_happy),
                    contentDescription = null
                )

            } else {
                Text(
                    text = "You lost!",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(painter = painterResource(id = R.drawable.ic_sad), contentDescription = null)

            }

            Button(onClick = {
                screenState.value = 0
                chance.value = 3
            },) {
                Text(text = "Go back", color = Color.White)
            }
        }

}


@Composable
fun LastScreen(incomingResult: Boolean) {

}