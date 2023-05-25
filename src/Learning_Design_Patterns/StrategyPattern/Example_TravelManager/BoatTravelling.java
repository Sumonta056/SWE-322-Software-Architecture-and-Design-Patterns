package Learning_Design_Patterns.StrategyPattern.Example_TravelManager;

public class BoatTravelling implements TravellingStrategy {
    public void travelBy(String location) {
        System.out.println("Travelling to "+location+" by Boat");
        // System holds boat travelling operations
    }
}
