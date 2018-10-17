package uk.co.lewiscook.worldcup2018.worldcup.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import uk.co.lewiscook.worldcup2018.worldcup.model.TeamResponse;

//Interface to retrieve info from online API
public interface WorldCupService {

    @Headers("X-Auth-Token: d380e1856ed24db29f4fc69408b56a3d")
    @GET("v2/competitions/2000/teams")
    Call<TeamResponse> getTeams();
}