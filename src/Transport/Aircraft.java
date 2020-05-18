package Transport;
import javax.xml.crypto.Data;

public  class Aircraft {
    private String ownership;
    private String GpsPosition;
    private String id;
    private Data dataOfPuchase;
    private String price;
    public Aircraft() {
    }
    public void Aircraft(String id){
      this.id=id;
    }
    public void drivingMethod(){System.out.println("飞机驾驶方法:方法1");}

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
