package com.spotify.oauth2.tests;

import com.spotify.oauth2.api.StatusCode;
import com.spotify.oauth2.api.applicationAPI.PlaylistApi;
import com.spotify.oauth2.pojo.Error;
import com.spotify.oauth2.pojo.Playlist;
import com.spotify.oauth2.utils.DataLoader;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static com.spotify.oauth2.utils.FakerUtils.generateDescription;
import static com.spotify.oauth2.utils.FakerUtils.generateName;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@Epic("Spotify Oauth 2.0")
@Feature("Playlist API")

public class PlaylistTests extends BaseTest{

    @Story("Create a playlist story")
    @Link("https://example.org")
    @Link(name = "allure", type = "mylink")
    @TmsLink("12345")
    @Issue("654321")
    @Description("Create your custom playlist")
    @Test(description = "should be able to create a playlist")
    public void ShouldBeAbleToCreateAPlayList(){
        Playlist requestPlayList = playlistBuilder(generateName(),generateDescription(),false);

        Response response = PlaylistApi.post(requestPlayList);

        //deserialize JSON to Playlist object
        Playlist responsePlaylist = response.as(Playlist.class);
        assertStatusCode(response.statusCode(), StatusCode.CODE_201.getCode());
        assertPlaylistEqual(requestPlayList, responsePlaylist);

    }

    @Test
    public void ShouldBeAbleToGetAPlayList(){

        Playlist requestPlayList = playlistBuilder("New playlist","New Playlist description", false);

        Response response = PlaylistApi.get(DataLoader.getInstance().getPlayListId());
        Playlist responsePlaylist = response.as(Playlist.class);

        assertPlaylistEqual(requestPlayList, responsePlaylist);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200.getCode());

    }

    @Test
    public void ShouldBeAbleToUpdateAPlayList(){

        Playlist requestPlayList = playlistBuilder(generateName(),generateDescription(),false);

        Response response = PlaylistApi.put(DataLoader.getInstance().getUpdatePlaylistId(), requestPlayList);
        assertStatusCode(response.statusCode(), StatusCode.CODE_200.getCode());

    }
    @Story("Create a playlist story")
    @Test
    public void ShouldNotBeAbleToCreateAPlayListWithoutName(){

        Playlist requestPlayList = playlistBuilder("",generateDescription(),false);

        Response response = PlaylistApi.post(requestPlayList);

        Error error = response.as(Error.class);
        assertError(error, StatusCode.CODE_400.getCode(), StatusCode.CODE_400.getMsg());


    }
    @Story("Create a playlist story")
    @Test
    public void ShouldNotBeAbleToCreateAPlayListWithExpiredToken(){
        String invalid_token = "12345";

        Playlist requestPlayList = playlistBuilder(generateName(),generateDescription(),false);

        Response response = PlaylistApi.post(invalid_token, requestPlayList);
        Error error = response.as(Error.class);
        assertStatusCode(response.statusCode(), StatusCode.CODE_401.getCode());
        assertError(error, StatusCode.CODE_401.getCode(), StatusCode.CODE_401.getMsg());

    }

    @Step
    public Playlist playlistBuilder(String name, String description, boolean _public){
        Playlist playlist = new Playlist();
        playlist.setName(name);
        playlist.setDescription(description);
        playlist.set_public(_public);

        return playlist;
    }

    @Step
    public void assertPlaylistEqual(Playlist requestPlaylist, Playlist responsePlaylist){

        assertThat(responsePlaylist.getName(), equalTo(requestPlaylist.getName()));
        assertThat(responsePlaylist.getDescription(), equalTo(requestPlaylist.getDescription()));
        assertThat(responsePlaylist.get_public(), equalTo(requestPlaylist.get_public()));
    }

    @Step
    public void assertStatusCode(int actualStatusCode, int expectedStatusCode){
        assertThat(actualStatusCode, equalTo(expectedStatusCode));
    }

    @Step
    public void assertError(Error responseErr, int expectedStatusCode, String expectedMsg){
        assertThat(responseErr.getError().getStatus(), equalTo(expectedStatusCode));
        assertThat(responseErr.getError().getMessage(), equalTo(expectedMsg));
    }

}
