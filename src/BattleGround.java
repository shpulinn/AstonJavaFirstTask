
public class BattleGround {
    public static void main(String[] args) throws Exception {
        Hero warrior = new Warrior("Knight", 25);
        Hero mage = new Mage("Gandalf", 10);
        Hero archer = new Archer("Elf", 15);

        Enemy enemy = new Enemy(50);

        warrior.attackEnemy(enemy);
        mage.attackEnemy(enemy);
        archer.attackEnemy(enemy);

        System.out.println("Is enemy alive? " + enemy.isAlive());

        if (enemy.isAlive()) {
            enemy.attackHero(warrior);
            enemy.attackHero(mage);
            enemy.attackHero(archer);
        }

        System.out.println("Is Warrior alive? " + warrior.isAlive());
        System.out.println("Is Mage alive? " + mage.isAlive());
        System.out.println("Is Archer alive? " + archer.isAlive());
    }
}