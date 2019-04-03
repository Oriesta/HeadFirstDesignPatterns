public class Dwarf implements RaceDecorator {

    Character character;

    public Dwarf(Character c) {
        character = c;
        description = "\nRace: Dwarf";
    }

    public void getDescription() {
        return character.getDescription() + description;        
    }
}