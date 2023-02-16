import java.util.Random;

class DnDCharacter {

    private int constitution;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int charisma;

    Random dice = new Random();

    public DnDCharacter(){
        this.constitution = ability();
        this.strength = ability();
        this.dexterity = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int rollDice(){
        return dice.nextInt(6)+1; 
    }
    
    int ability() {
        int[] roll = new int[4];
        int minor = 7;
        int result = 0;
        for(int i = 0; i < roll.length; i++){
            roll[i] = rollDice();
            result += roll[i];
            if (minor > roll[i]){
                minor = roll[i];
            }
        }
        return result - minor;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }

}
