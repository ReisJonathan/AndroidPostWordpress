package com.example.postwp.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.postwp.HttpRequest.PostsApiService;
import com.example.postwp.R;
import com.example.postwp.adapter.PostsAdapter;
import com.example.postwp.model.Post.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPosts;
    //private List<Post> listaPosts = new ArrayList<>();
    private PostsAdapter listaPosts;
    //private PostsAdapter adapter;

    private Retrofit retrofit;

    public List<Post> postResposta = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //inicializar componentes
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        recyclerPosts = findViewById(R.id.recyclerPosts);

        listaPosts = new PostsAdapter( postResposta, getApplicationContext() );

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPosts.setLayoutManager( layoutManager );
        recyclerPosts.setHasFixedSize(true);
        recyclerPosts.setAdapter( listaPosts );


        retrofit = new Retrofit.Builder()
                .baseUrl("http://demo.wp-api.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        listPosts();

        //Log.d("Depurador2 ", " Retorno2: ");
    }

    private void listPosts() {

        PostsApiService service = retrofit.create(PostsApiService.class);
        Call <List<Post>> PostRespostaCall = service.listaPosts();

        PostRespostaCall.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.isSuccessful()) {

                    postResposta = response.body();

                    listaPosts.adicionarListaPost(postResposta);

                    Log.d("Depurador ", " Retornou: " + postResposta );

                } else {
                    Log.e("Depurador", " onResponse: " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Log.e("Depurador", " onFailure: " + t.getMessage());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
