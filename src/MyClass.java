public class MyClass {
    String name;
    String lastname;
    int age;
    String[] grups ={"java", "OOP", "angilish"};
    String[] thefood;

//    public MyClass(String aLi, String kaldarbekov, int age, String[] grups, String lagman){
//
//    }

    public MyClass(String name, String lastname, int age, String[] grups, String thefood) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.grups = grups;
        this.thefood = new String[]{thefood};
    }

    public MyClass(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
}
