package behavioral.nullObject;

public class NullPlanet implements Planet{

    @Override
    public String name(){
        return "Null Planet";

    }

    @Override
    public void rotate() {
        //do nothing
    }

    public void printName(){

        System.out.println(name());
    }
}
