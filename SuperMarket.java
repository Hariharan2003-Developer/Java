public class SuperMarket
{
String item;
int cost;

public SuperMarket(String item1, int cost1){
    System.out.println("are you constructor?");
    item = item1;
    cost = cost1;
}
//constructor name should be same as class name
//No return type req
//Called automatically when object is created
//initializing object specific values

public static void main(String[] args)
{
    SuperMarket product1 = new SuperMarket("Noodles",50);
    SuperMarket product2 = new SuperMarket("Shampoo",150);
    SuperMarket product3 = new SuperMarket("Soap",40);
    SuperMarket product4 = new SuperMarket("Paste",60);
    SuperMarket product5 = new SuperMarket("MilkiMist Paneer",100);
    

    System.out.println(product5.item);
    System.out.println(product2.item);
    System.out.println(product1.cost);
    System.out.println(product2.cost);
//    product1.name = "abc";
//    product1.price = 20;
//    product2.name = "xyz";
//    product2.price = 2000;

}


}






