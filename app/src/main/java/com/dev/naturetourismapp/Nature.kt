package com.dev.naturetourismapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Nature(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable