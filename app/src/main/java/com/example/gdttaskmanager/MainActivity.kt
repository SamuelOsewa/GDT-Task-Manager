package com.example.gdttaskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gdttaskmanager.ui.theme.GDTTaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GDTTaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskManager("All Tasks Completed", "Nice Work!")
                }
            }
        }
    }
}

@Composable
fun TaskManager(taskCompleted: String, greeting: String) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(modifier = Modifier
        .wrapContentWidth(Alignment.CenterHorizontally)
        .wrapContentHeight(Alignment.CenterVertically)) {
         Image(painter = image, contentDescription = null,
             modifier = Modifier.padding(bottom = 16.dp).fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally))
        Text(text = taskCompleted,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally), fontWeight = FontWeight.Bold, fontSize = 14.sp)
        Text(text = greeting,
            modifier = Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally), fontSize = 14.sp)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    GDTTaskManagerTheme {
        TaskManager("All Tasks Completed", "Nice Work!")
    }
}