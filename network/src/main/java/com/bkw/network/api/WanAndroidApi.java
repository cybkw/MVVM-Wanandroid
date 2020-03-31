package com.bkw.network.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface WanAndroidApi extends BaseApi {

    @Headers("Cache-Control:max-age=10000")
    @GET("/wxarticle/chapters/json ")
    Call<ResponseBody> getChapters();
}
