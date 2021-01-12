import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    List<Employee> employeeList;

    Employee tomten = new Employee("Tomten");
    Employee glader = new Employee("Glader");
    Employee butter = new Employee("Butter");
    Employee tröger = new Employee("Tröger");
    Employee trötter = new Employee("Trötter");
    Employee blyger = new Employee("Blyger");
    Employee rådjuret = new Employee("Rådjuret");
    Employee nyckelpigan = new Employee("Nyckelpigan");
    Employee haren = new Employee("Haren");
    Employee räven = new Employee("Räven");
    Employee skumtomten = new Employee("Skumtomten");
    Employee dammråttan = new Employee("Dammråttan");
    Employee gråsuggan = new Employee("Gråsuggan");
    Employee myran = new Employee("Myran");
    Employee bladlusen = new Employee("Bladlusen");


    public Demo(){
        tomten.addEmployee(glader);
        tomten.addEmployee(butter);
        glader.addEmployee(tröger);
        glader.addEmployee(trötter);
        glader.addEmployee(blyger);
        butter.addEmployee(rådjuret);
        butter.addEmployee(nyckelpigan);
        butter.addEmployee(haren);
        butter.addEmployee(räven);
        trötter.addEmployee(skumtomten);
        skumtomten.addEmployee(dammråttan);
        räven.addEmployee(gråsuggan);
        räven.addEmployee(myran);
        myran.addEmployee(bladlusen);

        employeeList = Arrays.asList(tomten, glader, butter, tröger, trötter,
                blyger, rådjuret, nyckelpigan, haren, räven, skumtomten, dammråttan,
                gråsuggan, myran, bladlusen);
    }

    public Employee findEmployee(String name){
        for(Employee e : employeeList){
            if(e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public List <Employee> getEmployees(Employee employee){
        List<Employee> listOfEmployees = new ArrayList<>();

        if(employee.getEmployeeList().size()>0) {
            listOfEmployees.addAll(employee.getEmployeeList());
            for (Employee e : employee.getEmployeeList()){
                List<Employee> tempList = getEmployees(e);
                listOfEmployees.addAll(tempList);
            }
        }
        return listOfEmployees;
    }


    public static void main(String[] args) {
        Demo d = new Demo();

        String testName1 = "Tomten";
        String testName2 = "Räven";

        List<Employee> list1 = d.getEmployees(d.findEmployee(testName1));
        System.out.println("Under " + testName1 + " arbetar:");
        list1.forEach(e -> System.out.println(e.getName()));
        System.out.println();

        List<Employee> list2 = d.getEmployees(d.findEmployee(testName2));
        System.out.println("Under " + testName2 + " arbetar:");
        list2.forEach(e -> System.out.println(e.getName()));
    }
}
