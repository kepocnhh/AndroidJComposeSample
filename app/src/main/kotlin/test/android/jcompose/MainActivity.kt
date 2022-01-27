package test.android.jcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SimpleComposable() {
    Text("Hello World")
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposable()
        }
    }
}
