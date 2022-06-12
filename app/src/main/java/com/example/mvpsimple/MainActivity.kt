package com.example.mvpsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var etSisi: EditText
    private lateinit var btnHitungLuas: Button
    private lateinit var btnHitungKeliling: Button
    private lateinit var btnLuasSoal: Button
    private lateinit var btnKelilingSoal: Button
    private lateinit var tvHasil: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        etSisi = findViewById(R.id.et_sisi)
        tvHasil = findViewById(R.id.tv_hasil)
        btnHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        btnHitungLuas = findViewById(R.id.btn_hitung_luas)
        btnKelilingSoal =findViewById(R.id.btn_kllng_soal)
        btnLuasSoal = findViewById(R.id.btn_luas_soal)

        btnHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(panjang, lebar)
        }
        btnHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPjg(panjang, lebar)
        }
        btnLuasSoal.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuas(sisi)
        }
        btnKelilingSoal.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKeliling(sisi)
        }

    }

    override fun updateLuas(luas: Float) {
        tvHasil.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }
    override fun updateLuasSoal(luas: Float) {
        tvHasil.text = luas.toString()
    }

    override fun updateKelilingSoal(keliling: Float) {
        tvHasil.text = keliling.toString()
    }

    override fun showEror(erorMsg: String) {
        tvHasil.text = erorMsg
    }

}