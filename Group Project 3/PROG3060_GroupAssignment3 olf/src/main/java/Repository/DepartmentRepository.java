package Repository;

import Model.DepartmentsEntity;
import Model.EmployeesEntity;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<DepartmentsEntity, Long> {

}