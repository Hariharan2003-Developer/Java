class Apartment {

    int no;
    String name;
    int price;

    public Apartment(int no1, String name, int no2) {
        this.no = no1;
        this.name = name;
        this.price = no2;
    }

    public Apartment() {
        
    }

    public static void main(String[] args) {

        Apartment a = new Apartment(25, "Velachery", 30);
        Apartment b = new Apartment(45, "Besant Nagar", 18);
        b.comparePrice(a);
    }
    public void comparePrice(Apartment j){

        System.out.println(this.price);
        System.out.println(j.price);

    }

}

