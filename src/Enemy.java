public class Enemy implements Mortal{

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attackHero(Hero hero) {
        int damage = 10;
        System.out.println("Enemy attacks " + hero.getHeroName() + " and deals " + "\u001B[31m" + damage + "\u001B[0m" + " damage!");
        hero.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Enemy get " + "\u001B[31m" + damage + "\u001B[0m" + " damage. Health left: " + "\u001B[32m" + health + "\u001B[0m");
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}
