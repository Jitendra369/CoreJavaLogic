package designpattern.factory_designpatterb;

public class EnemyShipFDactory {

    public EnemyShip makeEnemyShipFactory(String enemyShipType){
        EnemyShip enemyShip = null;

        switch (enemyShipType){
            case "U" :
                enemyShip = new BigOUnEnemyShip();
                break;
            case "R":
                enemyShip = new RocketEnemyShip();
                break;
        }
        return enemyShip;
    }
}
