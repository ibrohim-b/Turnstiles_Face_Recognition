package com.example.turnstilesfacerecognition

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("api/upload_image")
    fun upload_image(
        @Part image: MultipartBody.Part,
        ): Call<ResponseBodyModel>
}