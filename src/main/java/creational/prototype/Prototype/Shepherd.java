package creational.prototype.Prototype;


public class Shepherd implements Cloneable {
    private String name;
    private int level;

    public Shepherd(String name, int level) {
        this.name = name;
        this.level = level;
    }

    // copy constructor
    public Shepherd(Shepherd shep) {
        if (shep != null)
            new Shepherd(shep.name, shep.level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "ShepName: " + name + " ShepLevel: " + level;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
