package com.example.yasen.busapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rishad on 31/3/18.
 */

public class Bus {

    @SerializedName("BusID")
    private String busId;

    @SerializedName("Num")
    private String BusNumber;

    @SerializedName("Status")
    private String status;

    @SerializedName("X-coord")
    private String xCode;

    @SerializedName("Y-coord")
    private String yCode;

    @SerializedName("Last_Update")
    private String lastUpdate;

    @SerializedName("LineID")
    private String lineId;



    public String getBusId(){return busId;}
    public void setBusId(String busId){this.busId=busId;}


    public String getBusNumber(){return BusNumber;}
    public void setBusNumber(String BusNumber){this.BusNumber=BusNumber;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status=status;}

    public String getxCode(){return xCode;}
    public void setxCode(String xCode){this.xCode=xCode;}

    public String getyCode(){return yCode;}
    public void setyCode(String yCode){this.yCode=yCode;}

    public String getLastUpdate(){return lastUpdate;}
    public void setLastUpdate(String lastUpdate){this.lastUpdate=lastUpdate;}


    public String getLineId(){return lineId;}
    public void setLineId(String lineId){this.lineId=lineId;}

}
