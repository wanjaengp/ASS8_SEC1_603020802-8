package com.example.ass8

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Employee  (
    @Expose
    @SerializedName( "emp_name") val emp_name: String,

    @Expose
    @SerializedName( "emp_gende") val emp_gende: String,

    @Expose
    @SerializedName( "emp_email") val emp_email: String,

    @Expose
    @SerializedName( "emp_salary") val emp_salary: Int
){}