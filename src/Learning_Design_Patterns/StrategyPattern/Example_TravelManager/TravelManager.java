package Learning_Design_Patterns.StrategyPattern.Example_TravelManager;

public class TravelManager {
    private TravellingStrategy travellingStrategy;

    public void setTravellingStrategy(TravellingStrategy travellingStrategy){
        this.travellingStrategy = travellingStrategy;
    }

    public void travelBy(String Location) {
        travellingStrategy.travelBy(Location);
    }
}
