public class Archer extends Hero{
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getHeroName() + " archer attacks");
        enemy.takeDamage(15);
    }

    @Override
    public void takeDamage(int damage) {
        if (Math.random() > .5) {
            System.out.println(getHeroName() + " archer evade attack!");
        } else {
            super.takeDamage(damage);
        }
    }
}
