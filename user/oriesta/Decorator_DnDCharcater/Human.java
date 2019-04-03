public class Human implements RaceDecorator {

    Character character;

    public Human(Character c) {
        character = c;
        description = "\nRace: Human";
    }

    public String getDescription() {
        return character.getDescription() + description;        
    }
}