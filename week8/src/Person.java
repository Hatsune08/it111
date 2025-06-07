public class Person {
    public String  name;
    public char    gender;
    public int     age;
    public int     carYear;
    public boolean violations;
    public double  creditScore;

    public Person(String name, char gender, int age,
                  int carYear, boolean violations,
                  double creditScore) {
        this.name         = name;
        this.gender       = gender;
        this.age          = age;
        this.carYear      = carYear;
        this.violations   = violations;
        this.creditScore  = creditScore;
    }

   
    public int getCarAge() {
        int currentYear = 2025;
        return currentYear - carYear;
    }

   
    public double getMonthlyPremium() {
        double premium;

       
        if (violations) {
            premium = 500;
        } else {
            premium = 100;
        }

       
        if (gender == 'M') {
            premium = premium + 50;
        }

       
        if (age < 25) {
            premium = premium + 50;
        }

       
        if (getCarAge() <= 5) {
            premium = premium + 50;
        } else {
            premium = premium - 25;
        }

        return premium;
    }
}
