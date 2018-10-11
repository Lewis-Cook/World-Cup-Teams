package uk.co.lewiscook.worldcup2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imgView);
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(img);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())//Allows retrofit to convert JSON to JAVA (Gson coverts)
                .build();

        final FootballTeamService service = retrofit.create(FootballTeamService.class);


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

    public void handleSucessfulRequest(List<Repo> response) {
        String allRepos = "";

        for (Repo repo : response) {
            allRepos = allRepos + "Name: " + repo.name + "\n" + repo.description + " " + "\n \n";
        }

        tV = findViewById(R.id.tView);
        tV.setText(allRepos);

    }
}