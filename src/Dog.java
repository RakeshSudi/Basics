public class Dog {
    int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 10) {
            this.age = age;
        } else {
            System.out.println("Age cannot be less than 10");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    Dog() {

    }

    Dog(int i, String n) {
        age = i;
        name = n;
    }

    Dog(String a) {
        name = a;
    }

    public String getName() {
        return name + "Hello";
    }

    public void pupAge() {
        int age = 0;
        age += 7;
        System.out.println(age);
        String a = "a";
        int b = 0;

        if(a.equals("a")) {
            b = 10;
        } else {
            b =20;
        }
        b = (a.equals("a")) ? 10 : 20;
    }

    public void displayName() {
        String name = "Puppy";
        System.out.println(age);
        System.out.println(name);
    }

    public int add(int a, int b) {
        return a+b;
    }
}
