package com.example.businesscard

import android.os.Bundle
import android.telecom.Call
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFCDDECE))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box {
                Image(
                    painter = painterResource(R.drawable.gurnoor_singh_sodhi),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.background(color = Color(0xFF16303F))
                )
            }
            Text(
                text = stringResource(R.string.Name),
                fontSize = 35.sp,
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = stringResource(R.string.Description),
                fontWeight = FontWeight.Bold,
                color = Color(0xFF368449)
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 20.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column {
                LowerPart(
                    icon = painterResource(R.drawable.call_29dp_306a40_fill0_wght400_grad0_opsz24),
                    description = stringResource(R.string.MobNumber),
                    modifier = Modifier
                )
                LowerPart(
                    icon = painterResource(R.drawable.share_29dp_306a40_fill0_wght400_grad0_opsz24),
                    description = stringResource(R.string.Linkedin_User_Name),
                    modifier = Modifier
                )
                LowerPart(
                    icon = painterResource(R.drawable.mail_29dp_306a40_fill0_wght400_grad0_opsz24),
                    description = stringResource(R.string.Mail_ID),
                    modifier = Modifier
                )
            }
        }
    }
}


@Composable
fun LowerPart(
    icon: Painter,
    description: String,
    modifier: Modifier
) {
    Row(
        modifier = modifier.padding(5.dp)
    ) {
        Image(
            painter = icon,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(end = 10.dp)
        )
        Text(
            text = description
        )
    }
}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting()
    }
}