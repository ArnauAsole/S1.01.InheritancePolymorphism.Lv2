
public class SmartPhone extends Phone implements Camera, Watch{
    public SmartPhone(String brand, String model) {
        super(brand, model);
    }

@Override
    public void takeApicture(){
        System.out.println("A picture is been taken.");
    }

    @Override
    public void setAlarm() {
        System.out.println("An alarm is been setted.");
    }
}
