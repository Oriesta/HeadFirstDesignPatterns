public class Thief implements ClassDecorator {

    Character character;

    public Thief(Character c) {
        character = c;
        description = "\nClass: Thief";
    }

    public String getDescription() {
        return character.getDescription() + description;        
    }
}