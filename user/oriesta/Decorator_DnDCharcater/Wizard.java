public class Dwarf implements ClassDecorator {

    Character character;

    public Wizard(Character c) {
        character = c;
        description = "\nClass: Wizard";
    }

    public String getDescription() {
        return character.getDescription() + description;        
    }
}