import Transport.Aircraft;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Person person=new Person();//实例化一个人
        Aircraft aircraft=new Aircraft();//实例化一个飞机

        person.setId("201902177");
        person.setP_Name("小宇");
        person.setP_Age(18);
        person.setP_Sex("男");

        aircraft.setOwnership("拥有者：");
        aircraft.setId("007");
        aircraft.setGpsPosition("北");
        aircraft.setPrice("150万");
        System.out.println(person.getP_Name()+person.getP_Age()+"岁");
        person.driveTransport("飞机");
        System.out.println(aircraft.getOwnership()+"小宇"+"  编号："+aircraft.getId()+"  飞机位置："+aircraft.getGpsPosition());
        System.out.println("飞机价格"+aircraft.getPrice());
        aircraft.drivingMethod();

    }
}
