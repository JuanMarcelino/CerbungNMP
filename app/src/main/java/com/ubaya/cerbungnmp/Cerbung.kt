package com.ubaya.cerbungnmp

import java.util.Date

data class Cerbung(
    var id:Int,
    var judul:String,
    var penulis:String,
    var sinopsis:String,
    var url:String,
    var genre:String,
    val cerita:String,
    val tanggalPembuatan:String

)
