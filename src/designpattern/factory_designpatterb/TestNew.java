package designpattern.factory_designpatterb;

import java.util.Scanner;

public class TestNew {
    public static void main(String[] args) {
//        EnemyShipFDactory enemyShipFDactory = new EnemyShipFDactory();
                EnemyShipFDactory enemyShipFDactory = null;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Wnat type of enemyship you want");
        String typeOfShip = scanner.nextLine();
        while (typeOfShip!=null){
            enemyShipFDactory.makeEnemyShipFactory(typeOfShip);
        }
    }

    private static void doEnemyStuff(EnemyShip enemyShip) {
        enemyShip.followHeroship();
        enemyShip.displayEnemyShip();
        enemyShip.enemyShootship();
    }
}
