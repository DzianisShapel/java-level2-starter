package com.spotify.oauth2.api;

import com.spotify.oauth2.pojo.Playlist;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static com.spotify.oauth2.api.Route.API;
import static com.spotify.oauth2.api.Route.TOKEN;
import static com.spotify.oauth2.api.SpecBuilder.*;
import static io.restassured.RestAssured.given;

public class RestResource {
    static String access_token = "BQBtLzEzWZOZTuErIhoTR1_lnl0iZoNHrw0El4b7lLoDF5kTOs0UY--f2hp7vixjqaO-UWUL98uPTsRTikLwFWYqrDoEg22RVsNnxHQcOkQJVfIctZOoB9TV5SqGL4MHp1FnG0HzhLCNuWuVNV3oD3tlFsUEru11AO0_tTHdvDzcM19vKjtiaMfA_zdET4H5ePM0kb3-6BvYhBP4UwO6n_1n2Gu8w7LpsYLNE6w6L0oADdERvtk-SUQbLKnK7CTOYAZkBBVyBBS8_nWC";

   public static Response post(String path, String token, Object requestPlayList) {

       return given(getRequestSpecification()).
               body(requestPlayList).
               header("Authorization","Bearer " + token).
       when().
               post(path).
       then().spec(getResponseSpecification()).
               extract().
               response();
   }

    public static Response get(String path, String token) {
      return given(getRequestSpecification()).
                header("Authorization","Bearer " + token).
      when().
                get(path).
      then().spec(getResponseSpecification()).
                extract().
                response();
    }

    public static Response put(String path, String token, Object requestPlayList) {
        return given(getRequestSpecification()).
                body(requestPlayList).
                header("Authorization","Bearer " + token).
        when().put(path).
                then().spec(getResponseSpecification()).
                extract().
                response();
    }

    public static Response postAccount(HashMap<String, String> formParams){
       return   given(getAccountRequestSpecification()).
                formParams(formParams).
       when().
                post(API + TOKEN).
       then().spec(getResponseSpecification()).
                extract().response();
    }

}
