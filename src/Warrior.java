public class Warrior extends Hero{
    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getHeroName() + " warrior attacks");
        if (Math.random() > 0.5) {
            System.out.println(getHeroName() + " warrior attack with critical damage!");
            enemy.takeDamage(15);
        } else {
            enemy.takeDamage(10);
        }
    }
}