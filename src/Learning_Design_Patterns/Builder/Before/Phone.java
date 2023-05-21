package Learning_Design_Patterns.Builder.Before;

public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public Phone(String os,int ram,
                 String processor,double screenSize,int battery) {

        super();
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize ;
        this.battery = battery ;
    }

    public String toString() {
        return "Phone Specification : \n" +
                "OS = " + os + "\n" +
                "Ram = " + ram + "\n" +
                "Processor = " + processor + "\n" +
                "Screen Size = " + screenSize + "\n" +
                "Battery = " + battery + "\n" ;
    }

}
