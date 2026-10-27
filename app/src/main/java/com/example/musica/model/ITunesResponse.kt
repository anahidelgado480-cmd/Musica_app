package com.example.musica.model

//ARCHIVO PARA VERIFICAR SI OBTENERMOS UNA RESPUESTA DEL API

data class ITunesResponse(

    val resultCount: Int,
    val results: List<album>

)
