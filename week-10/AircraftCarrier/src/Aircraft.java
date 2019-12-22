public abstract class Aircraft {

    private int maxAmmo;
    private int baseDamage;

    private int ammoSupply;
    private int allDamage;
    private boolean isPriority;

    public Aircraft() {
        ammoSupply = 0;
        allDamage = 0;
    }

    public int fight() {
        int damageDealt = ammoSupply * baseDamage;
        ammoSupply = 0;
        allDamage += damageDealt;
        return damageDealt;
    }

    public int refill(int ammoRefill) {
        int ammoSpace = maxAmmo - ammoSupply;
        ammoSupply = Math.min(ammoRefill, maxAmmo);
        return Math.max(0, ammoRefill - ammoSpace);
    }

    public String getType() {
         return this.getClass().getName();
    }


    public String getStatus() {
        return "Type " + getType() + ", Ammo: " + ammoSupply + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
    }

    public boolean isPriority() {
        return isPriority;
    }




}
