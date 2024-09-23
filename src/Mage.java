public class Mage extends Hero{
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getHeroName() + " mage attacks");
        enemy.takeDamage(5);
    }

    @Override
    public void takeDamage(int damage) {
        if (Math.random() > .7) {
            System.out.println(getHeroName() + " archer blocks the attack!");
        } else {
            super.takeDamage(damage);
        }
    }
}
