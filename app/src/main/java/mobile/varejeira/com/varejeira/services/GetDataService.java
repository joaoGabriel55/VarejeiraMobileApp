package mobile.varejeira.com.varejeira.services;

import java.util.List;

import mobile.varejeira.com.varejeira.models.TestModelFromJson;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("/users")
    Call<List<TestModelFromJson>> getAllData();
}
