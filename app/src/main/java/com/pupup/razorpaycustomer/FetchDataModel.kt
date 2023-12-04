package com.pupup.razorpaycustomer

data class FetchDataModel(
    val count: Int,
    val entity: String,
    val items: List<Item>
)