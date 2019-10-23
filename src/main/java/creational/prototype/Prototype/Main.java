package creational.prototype.Prototype;

//Specify the kinds of objects to create using a prototypical instance 
//and create new objects by copying this prototype.

//Use When
//to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
//when instances of a class can have one of only a few different combinations of state; or
//when the classes to instantiate are specified at run-time, for example, by dynamic loading.

// we want to implement the Cloneable interface
// implement DeepCopy for our object
// so that the client can create a prototype obj and use its
// copy constructor to create more objects

public class Main {

    public static void main(String[] args) {
        /// 	Deep copy is preferred if an object has references to other objects as fields.      ///

        Sheep dolly = new Sheep(), copyCatDolly = null;

        dolly.setName("Dolly");
        dolly.setAge(5);
        dolly.setBirthPlace("IST");
        dolly.setHairColor("White");
        dolly.setHairStyle("Curly");
        dolly.setNoOfLegs(4);
        dolly.setWeight(56);
        dolly.setShep(new Shepherd("COBAN", 5));


        System.out.println("DEEP COPY using our .deepCopy()");
        try {
            System.out.println("DOLLY before Deep: " + dolly.toString());
            //copyCatDolly = (Sheep) dolly.deepCopy();
            copyCatDolly = dolly.deepCopy2(); // copy constructor of the object
            copyCatDolly.setName("COPYCATDEEP");
            copyCatDolly.setAge(3);
            copyCatDolly.setHairColor("Black-White");
            copyCatDolly.setBirthPlace("IZM");
            copyCatDolly.getShep().setName("DEEPCOBAN");
            copyCatDolly.getShep().setLevel(35);
            System.out.println("COPYCAT: " + copyCatDolly.toString());
            System.out.println("DOLLY after Deep: " + dolly.toString());
            System.out.println("Shepherd is NOT updated on both because of deep copy i.e. both points to different objects!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n ================================= \n");
        System.out.println("SHALLOW COPY using standard .clone()");
        try {
            System.out.println("DOLLY before shallow: " + dolly.toString());
            copyCatDolly = (Sheep) dolly.clone();
            copyCatDolly.setName("COPYCAT");
            copyCatDolly.setAge(3);
            copyCatDolly.setHairColor("Black-White");
            copyCatDolly.setBirthPlace("ANK");
            copyCatDolly.getShep().setName("SHALLOWCOBAN");
            copyCatDolly.getShep().setLevel(6);
            System.out.println("COPYCAT: " + copyCatDolly.toString());
            System.out.println("DOLLY after Shallow: " + dolly.toString());
            System.out.println("Shepherd is updated on both because of shallow copy i.e. both points to same object!" + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
