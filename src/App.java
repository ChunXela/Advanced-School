public class App {
    public static void main(String[] args) throws Exception {

        Person person1 = new Person("Axel", "Crafoord 12");
        Person person2 = new Person("Adem", "Crafoord 12");
        Person person3 = new Person("Gustav", "A2");
        Person person4 = new Person("Liv", "622");
        Person person5 = new Person("Sebbe", "512");

        Student student1 = new Student(person1.name, person1.address, "Civ", 2020, 100.0);
        Student student2 = new Student(person2.name, person2.address, "Civ", 2020, 1000.0);
        Student student3 = new Student(person3.name, person3.address, "Spel", 2020, 1.0);
        Staff staff1 = new Staff(person4.name, person4.address, "NTI", 1000000);
        Staff staff2 = new Staff(person5.name, person5.address, "NTI", 1000000);

        System.out.println(student1);
        System.out.println(student3.getYear());
        System.out.println(student2.getFee());
        System.out.println(staff1.getSchool() + " " + staff2.getPay());

        staff2.setPay(9000000);
        System.out.println(staff2.getPay());
        System.out.println(staff2.toString());


    }
}
