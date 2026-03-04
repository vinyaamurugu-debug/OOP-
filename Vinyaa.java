class Vinyaa {
    int num;
    String name;

    Vinyaa() {
        num = 51;
        name = "Default";
    }

    Vinyaa(int n) {
        num = n;
    }

    Vinyaa(int n, String s) {
        num = n;
        name = s;
    }

    void display() {
        System.out.println(num + " " + name);
    }

    public static void main(String[] args) {
        Vinyaa obj1 = new Vinyaa();
        Vinyaa obj2 = new Vinyaa(100);
        Vinyaa obj3 = new Vinyaa(200, "Machan");

        obj1.display();
        obj2.display();
        obj3.display();
    }
}