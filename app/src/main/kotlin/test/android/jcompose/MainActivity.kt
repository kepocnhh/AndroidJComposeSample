package test.android.jcompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Bar(navController: NavController) {
    Text(text = "Bar")
    Button(onClick = { navController.navigate("foo") }) {
        Text(text = "Navigate -> foo")
    }
}

@Composable
fun Foo(navController: NavController) {
    Text(text = "Foo")
    Button(onClick = { navController.navigate("bar") }) {
        Text(text = "Navigate -> bar")
    }
}

@Preview
@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "foo"
    ) {
        composable("foo") { Foo(navController = navController) }
        composable("bar") { Bar(navController = navController) }
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}
