package HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer;


import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.abstract_factory.ObstacleFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.Asteriods.Level1AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.Asteriods.Level2AsteroidsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.BlackHoles.Level1BlackHolesFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.BlackHoles.Level2BlackHolesFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.DebrisField.Level1DebrisFieldFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.EnemyShips.Level1EnemyShipsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.EnemyShips.Level2EnemyShipsFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.SolarFlares.Level1SolarFlaresFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.concrete_factory.SolarFlares.Level2SolarFlaresFactory;
import HomeWorks.Task_3_Factory_And_AbstractFactory_Method.Answer.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory factory;

        // Asteroids

        if(level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        // DebrisField

        if(level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // SolarFlares

        if(level == 1) factory = new Level1SolarFlaresFactory();
        else factory = new Level2SolarFlaresFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // Enemy Ships

        if(level == 1) factory = new Level1EnemyShipsFactory();
        else factory = new Level2EnemyShipsFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        // Black holes

        if(level == 1) factory = new Level1BlackHolesFactory();
        else factory = new Level2BlackHolesFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();




    }
}
