package uk.co.lewiscook.worldcup2018.worldcup.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import uk.co.lewiscook.worldcup2018.R;
import uk.co.lewiscook.worldcup2018.worldcup.api.WorldCupService;
import uk.co.lewiscook.worldcup2018.worldcup.model.Team;
import uk.co.lewiscook.worldcup2018.worldcup.model.TeamResponse;

public class WorldCupActivity extends AppCompatActivity {

    String TAG = "World Cup Activity";

    TextView tView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc_layout);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.football-data.org")
                .addConverterFactory(GsonConverterFactory.create())//Allows retrofit to convert JSON to JAVA (Gson coverts)
                .build();

        final WorldCupService service = retrofit.create(WorldCupService.class);

        service.getTeams().enqueue(new Callback<TeamResponse>() {
            @Override
            public void onResponse(Call<TeamResponse> call, Response<TeamResponse> response) {
//                Log.i(TAG, "Has it worked lol");
                handleTeamResponse(response.body());
            }

            @Override
            public void onFailure(Call<TeamResponse> call, Throwable t) {
                Log.i(TAG, "Has it worked lmao");
                t.printStackTrace();
            }
        });
    }

    private void handleTeamResponse(TeamResponse response) {

        String teamDetails = "";

        List<Team> listOfTeams = response.getTeams();
        for (Team t: listOfTeams){

            teamDetails = teamDetails + "Name: " + t.getName() + "\n" + t.getVenue() + " " + "\n \n";
        }

        tView = findViewById(R.id.tV);
        tView.setText(teamDetails);

    }


}
