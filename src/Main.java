import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Car,TehCertificate>certificateHashMap= new HashMap<>();
        certificateHashMap.put(new Car(1342421,06256),new TehCertificate(2019,"Tesla Rodster",10101010,"red"));
        certificateHashMap.put(new Car(7639677,38578),new TehCertificate(2020,"Rolse royse",999999999,"black"));
        certificateHashMap.put(new Car(9967092,35453),new TehCertificate(2022,"Lamborgini Aventador",2141240000,"write"));
        certificateHashMap.put(new Car(5938570,67445),new TehCertificate(2021,"Maybah",21412000,"yellow"));
        certificateHashMap.put(new Car(9857233,476747),new TehCertificate(2018,"Tanka",214880000,"green"));
        certificateHashMap.put(new Car(8953394,474567),new TehCertificate(2017,"Mazerati",652454700,"gold"));
        System.out.println("""
                
                technical certificate:  
               
                """);
        System.out.println(certificateHashMap);


    }
}