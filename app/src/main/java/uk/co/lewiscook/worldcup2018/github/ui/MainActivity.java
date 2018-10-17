package uk.co.lewiscook.worldcup2018.github.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uk.co.lewiscook.worldcup2018.R;
import uk.co.lewiscook.worldcup2018.github.api.GitHubService;
import uk.co.lewiscook.worldcup2018.github.model.Repo;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private RepoAdapter mAdapter = new RepoAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpRecyclerView();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())//Allows retrofit to convert JSON to JAVA (Gson coverts)
                .build();

        final GitHubService service = retrofit.create(GitHubService.class);


        service.listRepos().enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                handleSucessfulRequest(response.body());
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Log.v("Jules", "Wrong" + t.toString());
            }
        });
    }

    private void setUpRecyclerView() {
        mRecyclerView = findViewById(R.id.recycleView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(mAdapter);
    }

    public void handleSucessfulRequest(List<Repo> response) {
        mAdapter.setData(response);
    }
}