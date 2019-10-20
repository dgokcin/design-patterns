package creational.prototype.Prototype;

import java.util.Calendar;

public class Sheep implements Cloneable {
    private String name;
    private int noOfLegs;
    private int weight;
    private int age;
    private String hairColor;
    private String hairStyle;
    private String birthPlace;
    private int birthYear;
    private Shepherd shep;

    public Sheep() {
    }

    public Sheep(String name, int noOfLegs, int weight, int age, String hairColor, String hairStyle, String birthPlace, int birthYear, Shepherd shep) {
        this.name = name;
        this.noOfLegs = noOfLegs;
        this.weight = weight;
        this.age = age;
        this.hairColor = hairColor;
        this.hairStyle = hairStyle;
        this.birthPlace = birthPlace;
        this.birthYear = birthYear;
        this.shep = shep;
    }

    //copy constructor
    private Sheep(Sheep sheepOriginal) {
        this.name = sheepOriginal.name;
        this.noOfLegs = sheepOriginal.noOfLegs;
        this.weight = sheepOriginal.weight;
        this.age = sheepOriginal.age;
        this.hairColor = sheepOriginal.hairColor;
        this.hairStyle = sheepOriginal.hairStyle;
        this.birthPlace = sheepOriginal.birthPlace;
        this.birthYear = sheepOriginal.birthYear;
        this.shep = new Shepherd(sheepOriginal.shep);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getBirthYear() {
        return 2018 - age;
    }

    public Shepherd getShep() {
        return shep;
    }

    public void setShep(Shepherd shep) {
        this.shep = shep;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    protected Sheep deepCopy() {
        Sheep newSheep = null;

        try {
            // koyunu deepcopi lemece
            newSheep = (Sheep) super.clone();
            newSheep.shep = (Shepherd) shep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return newSheep;

    }


    protected Sheep deepCopy2() { // do this clone()
        return new Sheep(this); // using private copy constructor
    }

    @Override
    public String toString() {
        return "Name " + name + ", Age " + age + ", Weight " + weight + ", NoOfLegs " + noOfLegs + ", birthYear " + birthYear + ", birthPlace " + birthPlace
                + ", hairStyle " + hairStyle + ", hairColor " + hairColor + ", Shepherd Info " + shep.toString();
    }
}
