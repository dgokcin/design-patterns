package behavioral.visitor.ex1;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //normal shopping cart stuff
        ArrayList<Visitable> items = new ArrayList<>();
        items.add(new CD());
        items.add(new DVD());
        items.add(new Book());
        //create a visitor
        Visitor visitorPostage, visitorDelivery;
        visitorPostage = new PostageVisitor();
        visitorDelivery = new DeliveryVisitor();

        /*
        //If you see below kind of code fragment, this is where it needs Visitor Pattern
        if(item instanceof DVD)
                ((DVD)item).bla();
            else if(item instanceof Book)
                ((Book) item).getWeight();
         */


        //iterate through all items
        for (Visitable item : items) {
            item.accept(visitorPostage);
            item.accept(visitorDelivery);
        }
        double postage = ((PostageVisitor) visitorPostage).getTotalPostage();
        System.out.println("Total " + postage);
    }
}



