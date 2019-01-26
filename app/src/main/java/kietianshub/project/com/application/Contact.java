package kietianshub.project.com.application;

public class Contact {
private String mName;
private int mImage;

    public Contact() {

    }

    public Contact(String mName, int mImage) {
        this.mName = mName;
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
