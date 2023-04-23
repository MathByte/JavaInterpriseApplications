package Repository;


import Model.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;


public interface EmployeeRepository extends CrudRepository<EmployeesEntity, Long> {
    List<EmployeesEntity> findBySalaryRange(double salMin, double salMax);
}