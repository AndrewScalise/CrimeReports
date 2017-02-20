package com.skuhleesi.crimereports;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Mugen on 2/20/2017.
 */

public class Crime {

    private UUID mId;           //Java utility class to provide universally unique ID values
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();                 //sets date to the current date by default
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
