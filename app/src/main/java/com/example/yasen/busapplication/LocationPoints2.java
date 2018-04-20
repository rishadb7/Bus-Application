package com.example.yasen.busapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hayaj on 3/14/2018.
 */

public class LocationPoints2 {

    @SerializedName("id")
    private String dbId;

    @SerializedName("name")
    private String locationName;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("lon")
    private String longitude;



    public String getDbId(){return dbId;}
    public void setDbId(String dbId){this.dbId=dbId;}


    public String getLocationName(){return locationName;}
    public void setLocationName(String locationName){this.locationName=locationName;}

    public String getLatitude(){return latitude;}
    public void setLatitude(String latitude){this.latitude=latitude;}

    public String getLongitude(){return longitude;}
    public void setLongitude(String longitude){this.longitude=longitude;}

}

