
class aggregate {
    String city;
    String street;
    emp e;

    aggregate(String city, String street, emp e) {
        this.city = city;
        this.street = street;
        this.e = e;
        System.out.println(city + " " + street);
        System.out.println(e.id + " " + e.name);

    }

    public static void main(String[] args) {
        emp e = new emp(21, "mahithosh");
        aggregate ag = new aggregate("chennai", "kcg", e);

    }
}

class emp {
    int id;
    String name;

    emp(int id, String name) {
        this.id = id;
        this.name = name;

    }
}