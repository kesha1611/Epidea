package com.abuturab.FirebaseRecyclerviewWebview;




public class Item {

    private String title;
    private String url;

    public Item(String title, String desc, String image, String url) {
        this.title = title;
        this.url = url;
    }

    public Item(){

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
