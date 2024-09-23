public abstract class Hero implements Mortal {
    private String heroName;
    private int heroHealth;

    public Hero(String name, int health) {
        heroName = name;
        heroHealth = health;
    }

    public String getHeroName() {
        return heroName;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public void takeDamage(int damage) {
        heroHealth -= damage;
        System.out.println(heroName + " get " + damage + " damage from enemy. Health left: " +"\u001B[32m"+ heroHealth+"\u001B[0m");
        if (!isAlive()) {
            System.out.println(heroName  + " is dead!");
        }
    }

    public boolean isAlive() {
        return heroHealth > 0;
    }

    public abstract void attackEnemy(Enemy enemy);
}
