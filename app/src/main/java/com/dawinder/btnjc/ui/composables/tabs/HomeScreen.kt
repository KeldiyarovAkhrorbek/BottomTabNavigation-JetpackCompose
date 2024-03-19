package com.dawinder.btnjc.ui.composables.tabs

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.dawinder.btnjc.R


@Composable
fun HomeScreen() {
    var skills = mutableListOf(
        "Java",
        "Kotlin",
        "Ruby",
        "JavaScript",
        "Node JS",
        "Physics",
        "Music",
        "Astronomy",
        "YouTube",
        "PC",
        "Android",
        "IOS",
        "D",
        "F",
    )
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier)
                Text(text = "Mobile Programming", fontSize = 20.sp)
                Icon(
                    Icons.Default.Settings,
                    contentDescription = "Setting",
                    modifier = Modifier
                        .size(30.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(150.dp)
                )
                Spacer(modifier = Modifier.width(width = 30.dp))
                Column(
                    modifier = Modifier.size(150.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "NAME",
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Student",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "My skills: ",
                fontSize = 20.sp,
                modifier = Modifier.padding(start = 20.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(10.dp))
            skills.forEach { skill ->
                Card(
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier.padding(horizontal = 20.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                horizontal = 10.dp,
                                vertical = 10.dp
                            )
                    ) {
                        AsyncImage(
                            model = "https://robohash.org/$skill",
                            contentDescription = "Translated description of what the image contains",
                            modifier = Modifier.size(50.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = skill)
                    }
                }
                Spacer(modifier = Modifier.height(15.dp))
            }

            Spacer(modifier = Modifier.height(100.dp))
        }
    }
}