package creational.prototype.ShallowAndDeepCopy;


class Apple {
    int weight;

    Apple(int w) {
       weight = w;

    }

    // o weightten yeni bir elma yaratti
    // memoride yeni bir yere point ediyoruz cunku new.
    Apple deepCopy() {
        Apple copiedApple = new Apple(weight);
        return copiedApple;
    }

}


class Basket {

    Apple apple;

    Basket(Apple a) {

        apple = a;
    }

    Basket deepCopy() {
       Basket copiedBasket = new Basket(this.apple.deepCopy());
       return copiedBasket;

    }

    // shallow copyledigin baskette bi degisiklik yaparsan, orjiyi de etkiler
    // cunku ayni yere point ediyorlar.
    Basket shallowCopy() {
        Basket copiedBasket = new Basket(this.apple);
        return copiedBasket;
    }
}

public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        Apple a = new Apple(100);
        Basket b1 = new Basket(a);

        System.out.println("Basket 1 apple weight " + b1.apple.weight); // 100
        System.out.println("Basket 1 apple hash " + b1.apple.hashCode()); // 100

        System.out.println("\n" + "Deep Copy");
        Basket b2 = b1.deepCopy();
        b2.apple.weight = 200;
        System.out.println("Basket 2 apple weight " + b2.apple.weight + " Basket 1 apple weight " + b1.apple.weight); // 100
        System.out.println("Basket 2 apple hash " + b2.apple.hashCode()); // 100

        System.out.println("\n" + "Shallow Copy");
        Basket b3 = b1.shallowCopy();
        b3.apple.weight = 300;
        System.out.println("Basket 3 apple weight " + b3.apple.weight + " Basket 1 apple weight " + b1.apple.weight); // 300
        System.out.println("Basket 3 apple hash " + b3.apple.hashCode()); // 100
    }
}
