package com.mrh.calculadora.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


/**
 * Pant
 */
@Composable
fun CalculadoraScreen(
    modifier: Modifier = Modifier
) {
    val listaNumeros = mutableListOf<Int>()
    for (i in 9 downTo 0) {
        listaNumeros.add(i)
    }

    Column(
        modifier = modifier
    ) {
        Text(text = "54 + 4", modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            //.background(Color.Red)
        )

        //  CUIDADO CON LOS LAYOUT LAZY
        //  NECESITAIS UTILIZAR LA FUNCION item para pintar un elemento
        // , o items para una lista
        LazyVerticalGrid(
            columns = GridCells.Fixed(4)
        ) {
            items(listaNumeros) { numero ->
                Button(
                    onClick = {},
                    modifier = Modifier
                        .aspectRatio(1f)
                        .clip(CircleShape),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF575F92),
                    )
                ) {
                    Text(text = numero.toString(), fontSize = 36.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun CalculadoraScreenPreview() {
    CalculadoraScreen()
}