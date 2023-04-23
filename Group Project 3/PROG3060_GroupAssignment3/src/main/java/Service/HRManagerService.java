package Service;

import Model.EmployeesEntity;
import Repository.DepartmentRepository;
import Repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service("HRService")
public class HRManagerService {
    @Autowired
    private EmployeeRepository emprepository;
    @Autowired
    private DepartmentRepository deptrepository;


    public void Test() {
        //Find all Employees whose salary is in the range 9000,17000
       // Iterable<EmployeesEntity> employees = emprepository.findBySalaryRange(9000, 17000);
        Iterable<EmployeesEntity> employees = emprepository.findAll();
        employees.forEach(emp -> System.out.println(emp));
    }
}


