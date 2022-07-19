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
    static String access_token = "BQCAiS_kA5OPnH901I0GlI-fZnqaEuJnffmssYvmbg6HatbXGitVAeIzng2vGy5Gbjp_DEZ_DVX0OF-uSUdnm-O7lyCG9IeAkwfPgRw59W_-iyPEUwlhucZFJacJqf08paBJEiqvgWufybLbv5V04501QDgvXvrByXAR4WFOwCaJSxmbnt9HRmTWZdihwB0SKZ7nNkYJAR78owhRGpOz5_8P4FB7u5Ig14aIovRorK31nz5d8PnXfQ7n1Nub3Gqth-xeHxT3uUrARYoV";

   public static Response post(String path, String token, Object requestPlayList) {

       return given(getRequestSpecification()).
               body(requestPlayList).
               auth().oauth2(token).
       when().
               post(path).
       then().spec(getResponseSpecification()).
               extract().
               response();
   }

    public static Response get(String path, String token) {
      return given(getRequestSpecification()).
              auth().oauth2(token).
      when().
                get(path).
      then().spec(getResponseSpecification()).
                extract().
                response();
    }

    public static Response put(String path, String token, Object requestPlayList) {
        return given(getRequestSpecification()).
                body(requestPlayList).
                auth().oauth2(token).
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
