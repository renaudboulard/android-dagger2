package fr.renaudboulard.android.dagger2.service;

import java.util.List;

import fr.renaudboulard.android.dagger2.model.Repo;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by renaud on 25/11/15.
 */
public interface GitHubService {
    @GET("/users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
