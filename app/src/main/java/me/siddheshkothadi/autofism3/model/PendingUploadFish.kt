package me.siddheshkothadi.autofism3.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class PendingUploadFish(
    val timestamp: String,
    val imageUri: String,
    val longitude: String,
    val latitude: String,
    val quantity: String,
    var workId: UUID = UUID.randomUUID(),
    // Temp
    var temp: String? = null,
    var pressure: String? = null,
    var humidity: String? = null,
    // Wind
    var speed : String? = null,
    var deg   : String?    = null,
    var name : String? = null,
    val moisture: String? = null,
    val ph: String? = null,
    val nitrogen: String? = null,
    val phosphorus: String? = null,
    val potassium: String? = null,
    val soc: String? = null,
)
