package com.pupup.razorpaycustomer

data class GetDataModel(
    val count: Int,
    val entity: String,
    val items: List<ItemX>
)