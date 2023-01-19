package designpattern.factory_designpatterb;

import java.util.Scanner;

public class Test_Traditional {
    public static void main(String[] args) {
        EnemyShip enemyShip = null;
//        static way
//        EnemyShip enemyShip = new UFOEnemyShip();
//        doEnemyStuff(enemyShip);

//        dynamic ways
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the enemy U / R ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("u")){
            doEnemyStuff(new UFOEnemyShip());
        } else if (input.equalsIgnoreCase("r")) {
            doEnemyStuff(new RocketEnemyShip());
        }
    }

    private static void doEnemyStuff(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.enemyShootship();
        enemyShip.followHeroship();
    }
}
