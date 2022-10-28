package com.example.NewsAppMain;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL = " https://api.currentsapi.services/";

    @GET("search")
    Call<NewsMain> getNews(
            @Query("country") String country,
            @Query("apiKey") String apiKey
    );

    @GET("top-headlines")
    Call<NewsMain> getCategoryNews(
            @Query("country") String country,
            @Query("category") String category,
            @Query("apiKey") String apiKey
    );
}