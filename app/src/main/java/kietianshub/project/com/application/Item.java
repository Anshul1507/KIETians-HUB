package kietianshub.project.com.application;

public class Item {
    private String mTitle;
    private int mThumbnail;
    private String mUrl;

    public Item() {

    }

    public Item(String title, int thumbnail, String url) {
        mTitle = title;
        this.mThumbnail = thumbnail;
        this.mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public int getThumbnail() {

        return mThumbnail;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setThumbnail(int thumbnail) {
        this.mThumbnail = thumbnail;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
