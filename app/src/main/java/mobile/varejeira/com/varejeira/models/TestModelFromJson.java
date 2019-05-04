package mobile.varejeira.com.varejeira.models;

import com.google.gson.annotations.SerializedName;

public class TestModelFromJson {

    @SerializedName("title")
    private String title;
    @SerializedName("url")
    private String url;

    public TestModelFromJson(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
