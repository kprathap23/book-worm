package com.ronakmanglani.booknerd;

import android.app.Application;
import android.content.Context;

public class BookNerdApp extends Application {

    // Constants
    public static final String TOOLBAR_TITLE = "toolbar_title";
    public static final String LIST_NAME = "list_name";
    public static final String BESTSELLER_LIST = "bestseller_list";
    public static final String ISBN_NUMBER = "isbn_number";
    public static final String BOOK_DETAIL = "book_detail";
    public static final String TAG_BESTSELLER = "bestseller_fragment";
    public static final String CURRENT_STATE = "current_state";
    public static final int STATE_LOADING = 1;
    public static final int STATE_FAILED = 2;
    public static final int STATE_LOADED = 3;

    // Initialize context
    @Override
    public void onCreate() {
        super.onCreate();
        mAppContext = getApplicationContext();
    }

    // To access context from any class
    private static Context mAppContext;
    public static Context getAppContext() {
        return mAppContext;
    }
}
