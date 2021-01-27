package com.mangala.muhurtham.Retrofit;



import com.mangala.muhurtham.Models.Login;
import com.mangala.muhurtham.Models.Profile;
import com.mangala.muhurtham.Models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IRetrofitApiCall {

    @FormUrlEncoded
    @POST("registration")
    Call<Login> registration(
            @Field("first_name") String first_name,
            @Field("last_name") String last_name,
            @Field("gender") String gender,
            @Field("email") String email,
            @Field("date_of_birth") String date_of_birth,
            @Field("mobile") String mobile,
            @Field("on_behalf") String on_behalf,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("login")
    Call<User> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("view_profile")
    Call<Profile> profile(
            @Field("member_id") String member_id
    );



}
