package com.mtzl.api_post.api

import com.mtzl.api_post.model.City
import com.mtzl.api_post.model.Hospital
import com.mtzl.api_post.model.HospitalsItem
import retrofit2.Call
import retrofit2.http.*

interface HospitalApiInterface {

    @GET("hospital")
    fun getAllHospital(): retrofit2.Call<Hospital>


    //Path = {id}  //hospital/3
    @GET("hospital/{id}")
    fun getDetails(
        @Path("id") id: String
    ): retrofit2.Call<HospitalsItem>


    @FormUrlEncoded

    @POST("setup/city")
    fun addCity(
        @Field("city_name") cityName: String
    ): Call<City>


}