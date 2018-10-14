package uk.co.lewiscook.worldcup2018.github.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import uk.co.lewiscook.worldcup2018.github.model.Repo;

//Interface to retrieve info from online API
public interface GitHubService {

    @GET("users/Lewis-Cook/repos")
    Call<List<Repo>> listRepos();

    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}