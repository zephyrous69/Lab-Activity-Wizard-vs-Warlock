public class Warlock extends Character {
    Warlock(String name){
        super(name);
    }

    public void scriptFlare(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Script Flare (Damage - 35)");
        int damagePoints = 35;
        damageTarget(enemyCharacter, damagePoints);

    }
    public void thunderFlash(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Thunder Flash (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void restore(Character warlockCharacter, int healthPoints, int manaPoints){
        System.out.println(super.characterName + " recover from the damage");
        add(warlockCharacter, healthPoints, manaPoints);
    }
    public void add(Character warlockCharacter, int healthPoints,int manaPoints){
        warlockCharacter.healthPoints += healthPoints;
        warlockCharacter.manaPoints += manaPoints;
    }
    public void status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}