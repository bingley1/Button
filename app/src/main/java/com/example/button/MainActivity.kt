package com.example.button

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.button.ui.theme.ButtonTheme
import com.example.library.Buttons
import com.sryang.library.JetCaster
import com.sryang.library.JetSnack
import com.sryang.library.JetSurvey
import com.sryang.library.Pink
import com.sryang.library.RusticTheme
import com.sryang.library.ThemeProvider
import com.sryang.library.Twitter
import com.sryang.library.Yellow
import com.sryang.library.Youtube

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
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

@Preview(showBackground = true)
@Composable
fun RusticThemePreview() {
    ThemeProvider.RusticTheme {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun PinkThemePreview() {
    ThemeProvider.Pink {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun YellowThemePreview() {
    ThemeProvider.Yellow {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun YoutubeThemePreview() {
    ThemeProvider.Youtube {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun TwitterThemePreview() {
    ThemeProvider.Twitter {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun JetCasterThemePreview() {
    ThemeProvider.JetCaster {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun JetSnackThemePreview() {
    ThemeProvider.JetSnack {
        Buttons()
    }
}

@Preview(showBackground = true)
@Composable
fun JetSurveyThemePreview() {
    ThemeProvider.JetSurvey {
        Buttons()
    }
}