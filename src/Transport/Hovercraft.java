package Transport;

import javax.xml.crypto.Data;

public class Hovercraft {
    private String ownership;
    private String GpsPosition;
    private String id;
    private Data dataOfPuchase;

    public Hovercraft() {
    }

       public void Hovercraft(String id){this.id=id;}
    public void drivingMethod(){System.out.println("气垫船驾驶方法:方法5");}

    public String getOwnership() {
        return ownership;
    }
    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }
    public String getGpsPosition() {
        return GpsPosition;
    }
    public void setGpsPosition(String gpsPosition) {
        GpsPosition = gpsPosition;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Data getDataOfPuchase() {
        return dataOfPuchase;
    }
    public void setDataOfPuchase(Data dataOfPuchase) {
        this.dataOfPuchase = dataOfPuchase;
    }
}
