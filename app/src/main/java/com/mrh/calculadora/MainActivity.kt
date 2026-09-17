package com.mrh.calculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mrh.calculadora.ui.screen.CalculadoraScreen
import com.mrh.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CalculadoraScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

/**
 *  Funcion HomeScreen
 *
 *  @author Mario Ríos
 *
 *  @param modifier Modificador de un elemento visual (solo aplicar en el primer contenedor de la pantalla[Column o Row])
 *  @param texto Texto que se pinta en pantalla
 *
 */
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    texto: String
){

    Column(
        modifier = modifier
    ){
        Text(text = texto)
    }
}