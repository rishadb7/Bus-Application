package com.example.yasen.busapplication;


import com.google.gson.annotations.SerializedName;


public class LocationPoints {

    @SerializedName("id")
    private String dbId;

    @SerializedName("Name")
    private String locationName;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
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
