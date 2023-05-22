package Learning_Design_Patterns.StrategyPattern;

public class TravelManager {
    private TravellingStrategy travellingStrategy;

    public void setTravellingStrategy(TravellingStrategy travellingStrategy){
        this.travellingStrategy = travellingStrategy;
    }

    public void travelBy(String Location) {
        travellingStrategy.travelBy(Location);
    }
}
