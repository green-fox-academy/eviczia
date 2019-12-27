public abstract class Aircraft {

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

    public void setAmmoSupply(int ammoSupply) {
        this.ammoSupply = ammoSupply;
    }

    public int getAmmoSupply() {
        return ammoSupply;
    }

    public int fight() {
        int damageDealt = ammoSupply * baseDamage;
        setAmmoSupply(0);
        allDamage += damageDealt;
        return damageDealt;
    }

    public int refill(int ammoRefill) {
        int ammoSpace = maxAmmo - this.getAmmoSupply();
         this.setAmmoSupply(Math.min(ammoRefill, maxAmmo));
         return Math.max(0, ammoRefill - ammoSpace);
    }

    public String getType() {
         return this.getClass().getName();
    }


    public String getStatus() {
        return this.refill(30) + "Type " + this.getType() + ", Ammo: " + this.getAmmoSupply() + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }
}
