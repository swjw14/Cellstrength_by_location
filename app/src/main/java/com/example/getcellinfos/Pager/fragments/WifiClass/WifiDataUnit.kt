package com.example.getcellinfos.Pager.fragments.WifiClass

data class WifiDataUnit(
    val name: String,
    val subName: String,
    val strength: Int,
    val type: String,
    val bandwidth: Int,
    val frequency: Int
)
