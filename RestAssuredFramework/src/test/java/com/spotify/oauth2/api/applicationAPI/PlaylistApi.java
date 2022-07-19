package com.spotify.oauth2.api.applicationAPI;

import com.spotify.oauth2.api.RestResource;
import com.spotify.oauth2.pojo.Playlist;
import com.spotify.oauth2.utils.ConfigLoader;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static com.spotify.oauth2.api.Route.PLAYLISTS;
import static com.spotify.oauth2.api.Route.USERS;
import static com.spotify.oauth2.api.TokenManager.getToken;


public class PlaylistApi {
//    static String access_token = "BQBtLzEzWZOZTuErIhoTR1_lnl0iZoNHrw0El4b7lLoDF5kTOs0UY--f2hp7vixjqaO-UWUL98uPTsRTikLwFWYqrDoEg22RVsNnxHQcOkQJVfIctZOoB9TV5SqGL4MHp1FnG0HzhLCNuWuVNV3oD3tlFsUEru11AO0_tTHdvDzcM19vKjtiaMfA_zdET4H5ePM0kb3-6BvYhBP4UwO6n_1n2Gu8w7LpsYLNE6w6L0oADdERvtk-SUQbLKnK7CTOYAZkBBVyBBS8_nWC";

   @Step
   public static Response post(Playlist requestPlayList) {
       return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS, getToken(), requestPlayList);
   }

    public static Response post(String token, Playlist requestPlayList) {
        return RestResource.post(USERS + "/" + ConfigLoader.getInstance().getUserId() + PLAYLISTS, token, requestPlayList);
    }

    public static Response get(String playlistId) {
        return RestResource.get(PLAYLISTS + "/" + playlistId, getToken());
    }

    public static Response put(String playlistId, Playlist requestPlayList) {
        return RestResource.put(PLAYLISTS + "/" + playlistId, getToken(), requestPlayList);
    }
}
