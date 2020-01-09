public abstract class Aircraft implements Comparable<Aircraft>{

    private int maxAmmo;
    private int baseDamage;

    private int ammoSupply;
    private int allDamage;
    private boolean isPriority;

    public Aircraft(int maxAmmo, int baseDamage) {
        this.maxAmmo = maxAmmo;
        this.baseDamage = baseDamage;
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
        return "Type " + this.getType() + ", Ammo: " + ammoSupply + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage + "\n";
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public int getAllDamage() {
        return allDamage;
    }


    @Override
    public int compareTo(Aircraft o) {
        if (this.isPriority && !o.isPriority) {
            return -1;
        } else if(!this.isPriority && o.isPriority) {
            return 1;
        } else return 0;
    }

}
