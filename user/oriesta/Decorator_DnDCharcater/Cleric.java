public class Cleric implements ClassDecorator {

    Character character;

    public Cleric(Character c) {
        character = c;
        description = "\nClass: Cleric";
    }

    public String getDescription() {
        return character.getDescription() + description;        
    }
}