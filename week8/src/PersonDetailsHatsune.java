public class PersonDetailsHatsune {
    public static void main(String[] args) {
     
        Person p1 = new Person(
            "Taro Yamada", 'M', 35,
            2018, false, 710.0
        );
       
        System.out.println("Name: " + p1.name);
        System.out.println("Age: " + p1.age);
        System.out.println("Car Year: " + p1.carYear);
        System.out.println("Car Age: " + p1.getCarAge());
        System.out.println("Violations: " + p1.violations);
        System.out.println("Credit Score: " + p1.creditScore);
        System.out.println("Monthly Premium: " + p1.getMonthlyPremium());
        System.out.println();

      
        Person p2 = new Person(
            "Hanako Suzuki", 'F', 28,
            2021, true, 680.0
        );
      
        System.out.println("Name: " + p2.name);
        System.out.println("Age: " + p2.age);
        System.out.println("Car Year: " + p2.carYear);
        System.out.println("Car Age: " + p2.getCarAge());
        System.out.println("Violations: " + p2.violations);
        System.out.println("Credit Score: " + p2.creditScore);
        System.out.println("Monthly Premium: " + p2.getMonthlyPremium());
    }
}
