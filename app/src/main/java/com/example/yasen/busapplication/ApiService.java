package com.example.yasen.busapplication;

import java.util.List;


        import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {


    @GET("get_alldata.php")
    Call<List<LocationPoints>> getLocationPoints(@Query("apiKey")String apiKey);

    @GET("get_alldata2.php")
    Call<List<LocationPoints2>> getLocationPoints2(@Query("apiKey2")String apiKey2);

    @POST("update_bus_location.php")
    @FormUrlEncoded
    Call<List<Bus>> updateBusLocation(@Field("Num") String personName,
                          @Field("X-coord") String emailId,
                          @Field("Y-coord") String imageUrl);

}