public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "arjay tite";
        knight.sayMyName();
        knight.sayMyStrength();
        knight.sayMyAgility();
        knight.sayMyIntelligence();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "czarina kulot";
        mage.sayMyName();
        mage.sayMyStrength();
        mage.sayMyAgility();
        mage.sayMyIntelligence();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "carlo multiverse";
        thief.sayMyName();
        thief.sayMyStrength();
        thief.sayMyAgility();
        thief.sayMyIntelligence();

        Character archer = new Character();
    

        archer.strength = 2;
        archer.agility = 10;
        archer.intelligence = 3;
        archer.name = "Celine bata";
        archer.sayMyName();
        archer.sayMyStrength();
        archer.sayMyAgility();
        archer.sayMyIntelligence();



        Character Support = new Character();


        Support.strength = 1;
        Support.agility = 3;
        Support.intelligence = 8;
        Support.name = "Kyle bobo";
        Support.sayMyStrength();
        Support.sayMyAgility();
        Support.sayMyIntelligence();


    }
}