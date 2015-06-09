
package com.example.ntaekryoo.mychallenge.HealthIndex;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ntaek Ryoo on 2015-04-30.
 */
public class SimpleData implements Parcelable {

    Double number1;
    Double number2;
    Double number3;
    Double number4;
    Double number5;
    Double number6;
    Double number7;
    Double number8;
    Double number9;
    Double number10;
    String message;

    public SimpleData(double num1,double num2, double num3, double num4, double num5,
                      double num6, double num7, double num8, double num9, double num10,
                      String msg) {
        number1 = num1;
        number2 = num2;
        number3 = num3;
        number4 = num4;
        number5 = num5;
        number6 = num6;
        number7 = num7;
        number8 = num8;
        number9 = num9;
        number10 = num10;

        message = msg;
    }

    public SimpleData(Parcel src) {
        number1 = src.readDouble();
        number2 = src.readDouble();
        number3 = src.readDouble();
        number4 = src.readDouble();
        number5 = src.readDouble();
        number6 = src.readDouble();
        number7 = src.readDouble();
        number8 = src.readDouble();
        number9 = src.readDouble();
        number10 = src.readDouble();
        message = src.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(number1);
        dest.writeDouble(number2);
        dest.writeDouble(number3);
        dest.writeDouble(number4);
        dest.writeDouble(number5);
        dest.writeDouble(number6);
        dest.writeDouble(number7);
        dest.writeDouble(number8);
        dest.writeDouble(number9);
        dest.writeDouble(number10);

        dest.writeString(message);
    }

}
