package com.example.postwp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.postwp.R;
import com.example.postwp.model.Post.Post;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {
    private List<Post> posts;
    private Context context;

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
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Post post = posts.get( position );

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

        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.PostTitle);
            date = itemView.findViewById(R.id.PostDate);

        }
    }
}
