package com.m25dev.booklisting;



public class Book {

    private String mTitle;
    private String mAuthors;
    private String mPubDate;
    private float mRate;

    public Book(String title, String authors, String pubDate, float rate) {
        mTitle = title;
        mAuthors = authors;
        mPubDate = pubDate;
        mRate = rate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthors() {
        return mAuthors;
    }

    public String getPubDate() {
        return mPubDate;
    }

    public float getRate() {
        return mRate;
    }
}
