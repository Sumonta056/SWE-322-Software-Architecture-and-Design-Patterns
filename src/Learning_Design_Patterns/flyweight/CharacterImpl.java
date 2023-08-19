package Learning_Design_Patterns.flyweight;

public class CharacterImpl implements Character{
    private String type;

    public CharacterImpl(String type) {
        this.type = type;
    }

    @Override
    public void display(String weapon) {
        System.out.println("Character type: " + type + ", Weapon: " + weapon);
    }
}
