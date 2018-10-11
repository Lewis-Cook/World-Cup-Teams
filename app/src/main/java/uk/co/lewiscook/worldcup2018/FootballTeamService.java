package uk.co.lewiscook.worldcup2018;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

//Interface to retrieve info from online API
public interface FootballTeamService {
    @GET("users/Julesssss/repos")
    Call<List<Repo>> listRepos();

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}