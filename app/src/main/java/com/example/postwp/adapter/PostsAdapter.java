package com.example.postwp.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.postwp.HttpRequest.PostsApiService;
import com.example.postwp.R;
import com.example.postwp.model.Media.Media;
import com.example.postwp.model.Post.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {
    private List<Post> posts;
    private Context context;

    private Media media = new Media();

    public PostsAdapter(List<Post> posts, Context context ) {
        this.posts = posts;
        this.context = context;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from( parent.getContext()).inflate(R.layout.adapter_post, parent, false );
        return new MyViewHolder( item );
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Post post = posts.get( position );

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("http://demo.wp-api.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Só faz a chamada pela media se na chamada anterior do Post for encontrada um id de media.
        if ( post.getFeatured_media() != 0 ) {
            PostsApiService service = retrofit2.create(PostsApiService.class);
            Call<Media> MediaRespostaCall = service.retornaMedia(post.getFeatured_media());

            MediaRespostaCall.enqueue(new Callback<Media>() {
                @Override
                public void onResponse(Call<Media> call, Response<Media> response) {
                    if (response.isSuccessful()) {
                        media = response.body();

                            // com a media referente a publicacao ela e inserida
                            Uri url = Uri.parse( media.getSource_url() );
                            if (url != null) {
                                Glide.with(context)
                                        .load(url)
                                        .into(holder.imageView);
                            }

                        //Log.e("Depurador2", " retornou: " + "Id= " + media.getId() + " | " + media.getSource_url());
                    } else {
                        Log.e("Depurador2", " onResponsee: " + response.errorBody());
                    }
                }

                @Override
                public void onFailure(Call<Media> call, Throwable t) {
                    Log.e("Depurador2", " onFailure: " + t.getMessage());
                }
            });
        }

        holder.title.setText( post.getTitle().getRendered() );
        holder.date.setText( post.getDate() );
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public void adicionarListaPost(List<Post> listaPost) {
        posts.addAll(listaPost);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, date;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.PostTitle);
            date = itemView.findViewById(R.id.PostDate);

        }
    }
}
