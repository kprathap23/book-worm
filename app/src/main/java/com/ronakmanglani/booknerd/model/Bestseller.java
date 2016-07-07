package com.ronakmanglani.booknerd.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public class Bestseller implements Parcelable {

    // Attributes
    private String isbn10;
    private String isbn13;
    private String title;
    private String author;
    private String description;
    private String imageUrl;
    private String publisher;
    private String itemUrl;

    // Getters
    public String getUniqueId() {
        // If book has ISBN10, use it as ID
        if (isbn10.length() > 0) {
            return "nyt1:" + isbn10;
        }
        // If no ISBN10, use ISBN13
        else if (isbn13.length() > 0) {
            return "nyt2:" + isbn13;
        }
        // If no ISBN numbers, use combination of title and author
        else {
            return "nyt3" + title + author;
        }
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getDescription() {
        return description;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getItemUrl() {
        return itemUrl;
    }

    // Constructor
    public Bestseller(String isbn10, String isbn13, String title, String author,
                      String description, String imageUrl, String publisher, String itemUrl) {
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageUrl = imageUrl;
        this.publisher = publisher;
        this.itemUrl = itemUrl;
    }

    // Parceling methods
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Bestseller createFromParcel(Parcel in) {
            return new Bestseller(in);
        }
        public Bestseller[] newArray(int size) {
            return new Bestseller[size];
        }
    };
    public Bestseller(Parcel in) {
        this.isbn10 = in.readString();
        this.isbn13 = in.readString();
        this.title = in.readString();
        this.author = in.readString();
        this.description = in.readString();
        this.imageUrl = in.readString();
        this.publisher = in.readString();
        this.itemUrl = in.readString();
    }
    @Override
    public void writeToParcel(Parcel out, int i) {
        out.writeString(isbn10);
        out.writeString(isbn13);
        out.writeString(title);
        out.writeString(author);
        out.writeString(description);
        out.writeString(imageUrl);
        out.writeString(publisher);
        out.writeString(itemUrl);
    }
    @Override
    public int describeContents() {
        return 0;
    }
}
