import model.Employee;
import model.EmployeeFactory;
import model.Project;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {


        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

/* 1 List all distinct project in non-ascending order.


        employeeList.stream()
                .flatMap(employee -> employee.getProjects()
                        .stream()
                        .distinct())
                .sorted(Comparator.comparing(Project::getName).reversed())

                .forEach(x-> System.out.println(x));
*/

        /*2. Print full name of any employee whose firstName starts with ‘A’.

        employeeList.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(x-> System.out.println(x));
        */

        /*     3. List of all employee who joined in year 2023 (year to be extracted from employee id i.e., 1st 4 characters)

        employeeList.stream()
                .filter(
                        employee -> employee.getId()
                                .substring(0,4).startsWith("2023")
                ).forEach(x-> System.out.println(x));

    */

        /*
    4. Sort employees based on firstName, for same firstName sort by salary.


        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getSalary))
                .forEach(x-> System.out.println(x));
 */
/*  5. Print names of all employee with 3rd highest salary. (generalise it for nth highest salary)
*
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .skip(2)
                .forEach(x-> System.out.println(x));
*/


/*
    6. Print min salary.


        employeeList.stream()
               .sorted(Comparator.comparing(Employee::getSalary))
                 .limit(1).forEach(x-> System.out.println(x));

        Employee employeeWithMinSalary = employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println(employeeWithMinSalary);
     */


      /*  7. Print list of all employee with min salary.


        int minSalary= employeeList.stream().min(Comparator.comparing(Employee::getSalary)).get().getSalary();
        employeeList.stream()
                .filter(
                        employee -> employee.getSalary()<=minSalary
                ).forEach(x-> System.out.println(x));

*/

        /* 8. List of people working on more than 2 projects.



        employeeList.stream()
                .filter(employee -> employee.getProjects().size()>=2)
                .forEach(x-> System.out.println(x));
 */

       /* 9. Count of total laptops assigned to the employees.



        int laptop=  employeeList.stream()
                       .mapToInt(Employee::getTotalLaptopsAssigned).sum();
        System.out.println(laptop);

        int totalLaptopsAssigned = employeeList.stream()
                .map(Employee::getTotalLaptopsAssigned)
                .reduce(0, (a, b) -> a + b);
        System.out.println(totalLaptopsAssigned);

*/
       /*
        10. Count of all projects with Robert Downey Jr as PM.



        long projectCount = employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .count();
        System.out.println(projectCount);
 */

/*
    11. List of all projects with Robert Downey Jr as PM.


        employeeList.stream()
                .flatMap(employee -> employee.getProjects().stream())
                .filter(project -> project.getProjectManager().equals("Robert Downey Jr"))
                .forEach(x-> System.out.println(x));

 */
       /*
        12. List of all people working with Robert Downey Jr.


         employeeList.stream()
                .filter(employee -> employee.getProjects().stream()
                        .anyMatch(project -> project.getProjectManager().equals("Robert Downey Jr")))
                .forEach(x-> System.out.println(x));
 */














    }
}