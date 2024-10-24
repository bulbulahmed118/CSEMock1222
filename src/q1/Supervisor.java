package q1;

public class Supervisor extends Worker{
    String division;

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    public void toString(String name,double wage,String division) {
        System.out.println("Name : "+name);
        System.out.println("Wage : "+wage);
        System.out.println("Division : "+division);

    }

}
