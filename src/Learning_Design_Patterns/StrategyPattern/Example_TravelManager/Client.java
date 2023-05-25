package Learning_Design_Patterns.StrategyPattern.Example_TravelManager;

public class Client {
    public static void main(String[] args) {
        // Suppose I am planning a trip
        // Sylhet - Shreemangal - MadhabpurLake - Sylhet
        // Want to travel to sylhet with bus
        // when I reach sylhet
        // I want to switch to bike to go to shreemangal
        // To travel MadhabpurLake, I switch to boat
        // Then I again switch to bike to come back to sylhet

        // Strategy pattern provide the facility
        // to interchange between object (even in runtime)

        TravelManager travelManager = new TravelManager();
        travelManager.setTravellingStrategy(new BusTravelling());
        travelManager.travelBy("Sylhet");

        travelManager.setTravellingStrategy(new BikeTravelling());
        travelManager.travelBy("Shreemangal");

        travelManager.setTravellingStrategy(new BoatTravelling());
        travelManager.travelBy("MadhabpurLake");

        travelManager.setTravellingStrategy(new BikeTravelling());
        travelManager.travelBy("Sylhet");

    }
}
