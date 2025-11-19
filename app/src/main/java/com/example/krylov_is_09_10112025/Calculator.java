package com.example.krylov_is_09_10112025;

import android.os.Parcel;
import android.os.Parcelable;

public class Calculator implements Parcelable {
    private String currentDisplay;

    public Calculator() {
        currentDisplay = "0";
    }

    protected Calculator(Parcel in) {
        currentDisplay = in.readString();
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    public String getDisplayText() {
        return currentDisplay;
    }

    public void appendNumber(String number) {
        if (currentDisplay.equals("0")) {
            currentDisplay = number;
        } else {
            currentDisplay += number;
        }
    }

    public void clear() {
        currentDisplay = "0";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(currentDisplay);
    }
}