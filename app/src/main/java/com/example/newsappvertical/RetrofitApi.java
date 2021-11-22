package com.example.newsappvertical;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitApi {
    @GET("")
    Call<NewsModel>getAllNews(@Url String url);

}
