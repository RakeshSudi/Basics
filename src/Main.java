public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
       // dog.displayName();
        int a = 1;
        int b =3;
        int c = dog.add(a, b);

        Dog d1 = new Dog(4, "SPK");
        d1.setAge(10);
        System.out.println(d1.getAge());
        d1.pupAge();
    }
}
