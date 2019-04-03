public class Elf implements RaceDecorator {

    Character character;

    public Elf(Character c) {
        character = c;
        description = "\nRace: Elf";
    }

    public void getDescription() {
        return character.getDescription() + description;        
    }
}