package Learning_Design_Patterns.StrategyPattern;

public class BusTravelling implements TravellingStrategy{
    @Override
    public void travelBy(String location) {
        System.out.println("Travelling to "+location+" by Bus");
        // System holds bus travelling operations
    }
}
