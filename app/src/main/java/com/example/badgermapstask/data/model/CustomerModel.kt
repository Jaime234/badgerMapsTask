package com.example.badgermapstask.data.model

import com.google.gson.annotations.SerializedName

data class CustomerModel(
    @SerializedName("First Name") val firstName: String?,
    @SerializedName("Last Name") val lastName: String?,
    @SerializedName("Street") val street: String,
    @SerializedName("Zip") val zip: String,
    @SerializedName("City") val city: String,
    @SerializedName("Type") val type: String,
    @SerializedName("Last Check-In Date") var lastCheckInDate: String?,
    @SerializedName("Job") val job: String?,
    @SerializedName("Phone") val phone: String,
    @SerializedName("Company") val company: String
)
