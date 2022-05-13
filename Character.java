public class Character {
    public String characterName;
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(){
        System.out.println("Let the battle begin!");
    }
    Character(String name, int newLevel, int newHp, int mp){
        characterName = name;
        level = newLevel;
        healthPoints = newHp;
        manaPoints = mp;
    }

    public Character(String name) {
        characterName = name;
    }
    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void intialCh(String characterName){
        System.out.print("Character Initialized: " + characterName);
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        //System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints > 50){
            System.out.println("Character " + enemyCharacter.characterName + " is almost defeated!");
        }else if(enemyCharacter.healthPoints >= 20){
            System.out.println("Character " + enemyCharacter.characterName +" at the edge of defeat!");
        }else if(enemyCharacter.healthPoints <= 0 ){
            System.out.println("Character " + enemyCharacter.characterName + " is defeated!");
        }
    }
    public int levelUp(int level){
        int levelUp = level + 10;
        return levelUp;
    }
}