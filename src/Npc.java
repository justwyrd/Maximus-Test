public class Npc {
    //Initialization of name and health variables for NPC class/object
    private String Name;
    private int currentHealth, maxHealth;

    //Full constructor for NPC class
    public Npc (String name, int currentHealth, int maxHealth){
        this.Name = name;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
    }

    //No-args constructor for NPC class
    public Npc (){
        this.Name = "John Doe";
        this.currentHealth = 10;
        this.maxHealth = 10;
    }

    //Copy constructor for NPC class
    public Npc (Npc n){
        this.Name = n.Name;
        this.currentHealth = n.currentHealth;
        this.maxHealth = n.maxHealth;
    }

    //Set and get methods for NPC class
    public void setName(String name){
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }

    public void setCurrentHealth(int currentHealth){
        this.currentHealth = currentHealth;
    }

    public int getCurrentHealth(){
        return this.currentHealth;
    }

    public void setMaxHealth(int maxHealth){
        this.maxHealth = maxHealth;
    }

    public int getMaxHealth(){
        return this.maxHealth;
    }

    //toString method for NPC class
    @Override
    public String toString(){
        return this.Name + " - HP: " + this.currentHealth + "/" + this.maxHealth;
    }
}
