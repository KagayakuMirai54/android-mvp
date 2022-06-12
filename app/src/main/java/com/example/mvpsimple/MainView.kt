package com.example.mvpsimple

interface MainView {
    fun updateLuas(luas : Float)
    fun updateKeliling(keliling : Float)
    fun updateLuasSoal(luas : Float)
    fun updateKelilingSoal(keliling : Float)
    fun showEror(erorMsg: String)
}