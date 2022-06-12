package com.example.mvpsimple

class MainPresenter(private val mainView: MainView) {
    fun hitungLuasPersegiPjg(panjang: Float, lebar: Float){
        if  (panjang ==0F){
            mainView.showEror("Panjang tydack boleh 0 bestie")
            return
        }
        if  (lebar ==0F){
            mainView.showEror("Lebar tydack boleh 0 bestie")
            return
        }

        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }
    fun hitungKelilingPersegiPjg (panjang: Float, lebar: Float){
        if  (panjang ==0F){
            mainView.showEror("Panjang tydack boleh 0 bestie")
            return
        }
        if  (lebar ==0F){
            mainView.showEror("Lebar tydack boleh 0 bestie")
            return
        }
        val keliling = 2* (panjang + lebar)
        mainView.updateKeliling(keliling)
    }

    fun hitungLuas(sisi: Float){
        if  (sisi ==0F){
            mainView.showEror("Panjang tydack boleh 0 bestie")
            return
        }

        val luas1 = 2* sisi
        mainView.updateLuasSoal(luas1)
    }
    fun hitungKeliling(sisi: Float){
        if  (sisi ==0F){
            mainView.showEror("Panjang tydack boleh 0 bestie")
            return
        }
        val keliling1 = 4* sisi
        mainView.updateKelilingSoal(keliling1)
    }

}