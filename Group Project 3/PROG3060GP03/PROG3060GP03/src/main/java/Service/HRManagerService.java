package Service;

import Model.DepartmentsEntity;
import Model.DependentsEntity;
import Model.EmployeesEntity;
import Model.LocationsEntity;
import Repository.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Repository.DepartmentRepo;
import Repository.EmployeeRepo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("HRManagerService")
public class HRManagerService {
    @Autowired
    private EmployeeRepo emprepository;
    @Autowired
    private DepartmentRepo deptrepository;

    @Autowired
    private LocationRepo locrepository;
    public void Test() {
// demonstrate usage of all Repository classes
        // List All Employees

        System.out.println("Q1");
        List<EmployeesEntity> emps = emprepository.findEmployeesEntityBySalaryBetween(BigDecimal.valueOf(9000), BigDecimal.valueOf(17000));
        emps.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getSalary()));
        System.out.println("\n");

        System.out.println("Q2");
        emps = emprepository.findEmployeesEntityByFirstNameEndsWith("a");
        emps.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName()));
        System.out.println("\n");

        System.out.println("Q3");
        emps = emprepository.findEmployeesEntityByDepartmentId(11);
        emps.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getDepartmentId()));
        System.out.println("\n");

        System.out.println("Q4");
        emps = emprepository.findEmployeesEntityByManagerId(108);
        emps.forEach(emp -> System.out.println(emp.getFirstName() + " " + emp.getLastName() + " " + emp.getManagerId()));
        System.out.println("\n");

        System.out.println("Q5");
        List<DepartmentsEntity> dept = deptrepository.findDepartmentsEntitiesByLocationId(1700);
        dept.forEach(depts -> System.out.println(depts.getDepartmentName()));
        System.out.println("\n");

        List<LocationsEntity> locs = locrepository.findLocationsEntitiesByCountryIdIsNotNull();

//        List<DepartmentsEntity> dept = deptrepository.findDepartmentsEntitiesByLocationsEntity();
//
//        List<EmployeesEntity> emp = emprepository.findEmployeesEntitiesBySalary();

        System.out.println("Q6");
        Map<String, Long> countryCityCountMap = new HashMap<>();
        for (LocationsEntity loc : locs)
        {
            String countryId = loc.getCountryId();
            countryCityCountMap.put(countryId, countryCityCountMap.getOrDefault(countryId, 0L) + 1);
        }

        for (Map.Entry<String, Long> entry : countryCityCountMap.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Q7
//        for (DepartmentsEntity departments : dept)
//        {
//            String departmentName = departments.getDepartmentName();
//
//
//            locs = locrepository.findLocationsEntitiesByCountryIdIsNotNull();
//
//            System.out.println(dept.get(1).toString() + locs.get(3) + locs.get(4));
//        }
        //Q8

        //Q9
//        for (EmployeesEntity employees: emp)
//        {
//            System.out.println(employees.getSalary());
//        }
        //Q10

    }
}