package com.example.postwp.HttpRequest;

import com.example.postwp.model.PostResposta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsApiService {

    @GET("wp-json/wp/v2/posts")
    Call<PostResposta> listaPosts();
}
