package info.tmtvl.ddda.level.calc.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author tmtvl
 */
public abstract class Vocation implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private long id;
    
    private String name;
    
    private int hp;
    private int stamina;
    private int attack;
    private int defence;
    private int magickAttack;
    private int magickDefence;
    
    protected Vocation () {}
    
    public Vocation (String name, int hp, int stamina, int attack, int defence,
            int magickAttack, int magickDefence) {
        this.name = name;
        this.hp = hp;
        this.stamina = stamina;
        this.attack = attack;
        this.defence = defence;
        this.magickAttack = magickAttack;
        this.magickDefence = magickDefence;
    }
    
    public Vocation (long id, String name, int hp, int stamina, int attack,
            int defence, int magickAttack, int magickDefence) {
        this(name, hp, stamina, attack, defence, magickAttack, magickDefence);
        this.id = id;
    }
    
    public long getId () {
        return id;
    }
    
    public void setId (long id) {
        this.id = id;
    }
    
    public String getName () {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public int getHp () {
        return hp;
    }
    
    public void setHp (int hp) {
        this.hp = hp;
    }
    
    public int getStamina () {
        return stamina;
    }
    
    public void setStamina (int stamina) {
        this.stamina = stamina;
    }
    
    public int getAttack () {
        return attack;
    }
    
    public void setAttack (int attack) {
        this.attack = attack;
    }
    
    public int getDefence () {
        return defence;
    }
    
    public void setDefence (int defence) {
        this.defence = defence;
    }
    
    public int getMagickAttack () {
        return magickAttack;
    }
    
    public void setMagickAttack (int magickAttack) {
        this.magickAttack = magickAttack;
    }
    
    public int getMagickDefence () {
        return magickDefence;
    }
    
    public void setMagickDefence (int magickDefence) {
        this.magickDefence = magickDefence;
    }
    
    @Override
    public boolean equals (Object object) {
        if (object instanceof Vocation) {
            Vocation vocation = (Vocation) object;
            
            if (this.id > 0) {
                return this.id == vocation.getId();
            }
            else if (vocation.getId() == 0) {
                if (this.name != null) {
                    if (!this.name.equalsIgnoreCase(vocation.getName())) {
                        return false;
                    }
                }
                else if (vocation.getName() != null) {
                    return false;
                }
                
                return this.hp == vocation.getHp()
                        && this.stamina == vocation.getStamina()
                        && this.attack == vocation.getAttack() 
                        && this.defence == vocation.getDefence()
                        && this.magickAttack == vocation.getMagickAttack()
                        && this.magickDefence == vocation.getMagickDefence();
            }
        }
        
        return false;
    }
    
    @Override
    public int hashCode () {
        int hash = 3;
        hash = 11 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 11 * hash + Objects.hashCode(this.name);
        hash = 11 * hash + this.hp;
        hash = 11 * hash + this.stamina;
        hash = 11 * hash + this.attack;
        hash = 11 * hash + this.defence;
        hash = 11 * hash + this.magickAttack;
        hash = 11 * hash + this.magickDefence;
        return hash;
    }
    
    @Override
    public String toString () {
        StringBuilder stb = new StringBuilder();
        
        stb.append(name);
        stb.append("\nHP:             ").append(hp);
        stb.append("\nStamina:        ").append(stamina);
        stb.append("\nAttack:         ").append(attack);
        stb.append("\nDefence:        ").append(defence);
        stb.append("\nMagick Attack:  ").append(magickAttack);
        stb.append("\nMagick Defence: ").append(magickDefence);
        
        return stb.toString();
    }
}
