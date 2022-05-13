public class Wizard extends Character {
    Wizard(String name){
        super(name);
    }

    public void acidRain(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Acid Rain (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void executionerRay(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Executioner Ray (Damage - 40)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
    }
    public void revitalize(Character wizardCharacter, int manaPoints, int healthPoints){
        System.out.println(super.characterName + " recover from the damage");
        add(wizardCharacter, healthPoints, manaPoints);
    }
    public void add(Character wizardCharacter, int healthPoints,int manaPoints){
        wizardCharacter.healthPoints += healthPoints;
        wizardCharacter.manaPoints += manaPoints;
    }
    public void status(int healthStatus, int manaStatus){
        System.out.println(super.characterName +" Hp = "+healthStatus+ " Mana = "+manaStatus);
    }
}