package com.spotify.oauth2.tests;

import com.spotify.oauth2.api.applicationAPI.PlaylistApi;
import com.spotify.oauth2.pojo.Error;
import com.spotify.oauth2.pojo.Playlist;
import com.spotify.oauth2.utils.DataLoader;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PlaylistTests {


    @Test
    public void ShouldBeAbleToCreateAPlayList(){
        Playlist requestPlayList = playlistBuilder("New playlist","New playlist description",false);

        Response response = PlaylistApi.post(requestPlayList);

        //deserialize JSON to Playlist object
        Playlist responsePlaylist = response.as(Playlist.class);
        assertStatusCode(response.statusCode(), 201);
        assertPlaylistEqual(requestPlayList, responsePlaylist);

    }

    @Test
    public void ShouldBeAbleToGetAPlayList(){

        Playlist requestPlayList = playlistBuilder("New playlist","New playlist description",false);

        Response response = PlaylistApi.get(DataLoader.getInstance().getPlayListId());
        Playlist responsePlaylist = response.as(Playlist.class);

        assertPlaylistEqual(requestPlayList, responsePlaylist);
        assertStatusCode(response.statusCode(), 200);

    }

    @Test
    public void ShouldBeAbleToUpdateAPlayList(){

        Playlist requestPlayList = playlistBuilder("Updated Playlist","Updated Description",false);

        Response response = PlaylistApi.put(DataLoader.getInstance().getUpdatePlaylistId(), requestPlayList);
        assertStatusCode(response.statusCode(), 200);

    }

    @Test
    public void ShouldNotBeAbleToCreateAPlayListWithoutName(){

        Playlist requestPlayList = playlistBuilder("","Updated Description",false);

        Response response = PlaylistApi.post(requestPlayList);

        Error error = response.as(Error.class);
        assertError(error, 400, "Missing required field: name");


    }

    @Test
    public void ShouldNotBeAbleToCreateAPlayListWithExpiredToken(){
        String invalid_token = "12345";

        Playlist requestPlayList = playlistBuilder("","Updated Description",false);

        Response response = PlaylistApi.post(invalid_token, requestPlayList);
        Error error = response.as(Error.class);
        assertStatusCode(response.statusCode(), 401);
        assertError(error, 401, "Invalid access token");

    }

    public Playlist playlistBuilder(String name, String description, boolean _public){
        Playlist playlist = new Playlist();
        playlist.setName(name);
        playlist.setDescription(description);
        playlist.set_public(_public);

        return playlist;
    }

    public void assertPlaylistEqual(Playlist requestPlaylist, Playlist responsePlaylist){

        assertThat(responsePlaylist.getName(), equalTo(requestPlaylist.getName()));
        assertThat(responsePlaylist.getDescription(), equalTo(requestPlaylist.getDescription()));
        assertThat(responsePlaylist.get_public(), equalTo(requestPlaylist.get_public()));
    }

    public void assertStatusCode(int actualStatusCode, int expectedStatusCode){
        assertThat(actualStatusCode, equalTo(expectedStatusCode));
    }

    public void assertError(Error responseErr, int expectedStatusCode, String expectedMsg){
        assertThat(responseErr.getError().getStatus(), equalTo(expectedStatusCode));
        assertThat(responseErr.getError().getMessage(), equalTo(expectedMsg));
    }

}
