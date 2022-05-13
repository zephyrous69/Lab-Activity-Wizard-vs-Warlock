public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");
        /**
         * Create a Wizard Class which Inherits the Properties of Character Class.
         * eg. Wizard.java
         *
         *
         * Create a Warlock Class which Inherits the Properties of Character Class.
         * eg. Warlock.java
         *
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         *
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until
         * one of the Characters Created gets defeated.
         *
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        /**
         * Example Sequence
         * Wizard Merlin = new Wizard("Merlin");
         * Warlock Saruman = new Warlock("Saruman");
         *
         * Merlin.firestorm(Saruman); // Saruman HP Deducted
         * Warlock.recover() // Saruman HP and MP increases
         */

        Wizard Azlan = new Wizard("Azlan");
        Warlock Lucios = new Warlock("Lucios");
        Character ch = new Character();

        System.out.println("Wizard");
        ch.intialCh("Azlan");

        System.out.println("\nWarlock");
        ch.intialCh("Lucios");

        System.out.println("\n");
        Azlan.executionerRay(Lucios);
        Lucios.status(60, 200);
        Azlan.status(100, 160);

        Lucios.scriptFlare(Azlan);
        Lucios.status(60, 165);
        Azlan.status(65, 160);
        Lucios.restore(Lucios, 20, 20);
        Lucios.status(80, 185);
        Azlan.status(65, 160);

        Azlan.acidRain(Lucios);
        Lucios.status(30, 185);
        Azlan.status(65, 110);
        Lucios.thunderFlash(Azlan);
        Lucios.status(30, 135);
        Azlan.status(15, 110);
        Azlan.executionerRay(Lucios);
        Lucios.status(0, 135);
        Azlan.status(15, 70);

        System.out.println("The winner is Wizard Azlan");
        System.out.println("Wizard Azlan will level up!!");
        System.out.println("Level 1 to Level =  "+ch.levelUp(1));


    }
}