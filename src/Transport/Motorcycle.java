package Transport;

import javax.xml.crypto.Data;

public class Motorcycle {
    private String ownership;
    private String GpsPosition;
    private String id;
    private Data dataOfPuchase;
   private  String price;
    public Motorcycle() {
    }

    public String getOwnership() {
        return ownership;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
