package designpattern.factory_designpatterb;

public abstract class EnemyShip {
    private String name;
    private double amtDamage;

//    public EnemyShip() {
//    }

//    public EnemyShip(String name, double amtDamage) {
//        this.name = name;
//        this.amtDamage = amtDamage;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

//    method of enemy ship
    public void followHeroship(){
        System.out.println(getName() + " following the hero ship");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+ " is on the screen");
    }

    public void enemyShootship(){
        System.out.println(getName() + " attack and shoot "+ getAmtDamage());
    }
}

