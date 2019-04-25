package com.example.postwp.HttpRequest;

import com.example.postwp.model.Post.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostsApiService {

    @GET("wp-json/wp/v2/posts")
    Call <List<Post>> listaPosts();
}
