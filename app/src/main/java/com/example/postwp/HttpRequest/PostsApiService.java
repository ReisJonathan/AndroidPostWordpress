package com.example.postwp.HttpRequest;

import com.example.postwp.model.Media.Media;
import com.example.postwp.model.Post.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PostsApiService {

    @GET("wp-json/wp/v2/posts")
    Call <List<Post>> listaPosts();

    @GET("wp-json/wp/v2/media/{id}")
    Call <Media> retornaMedia(@Path("id") int id );
}
