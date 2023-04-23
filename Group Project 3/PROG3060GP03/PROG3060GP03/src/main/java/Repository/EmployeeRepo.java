package Repository;

import Model.EmployeesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

//@Component
@Repository
public interface EmployeeRepo extends
        CrudRepository<EmployeesEntity, Integer> {

    //@Query("SELECT u FROM EmployeesEntity u WHERE u.salary >= :start and u.salary <= :end")
    //List<EmployeesEntity> findEmployeesEntityBySalaryBetween(@Param("start") BigDecimal status, @Param("end") BigDecimal name);
    List<EmployeesEntity> findEmployeesEntityBySalaryBetween(BigDecimal minSalary, BigDecimal maxSalary);
    List<EmployeesEntity> findEmployeesEntityByFirstNameEndsWith(String letter);
    List<EmployeesEntity> findEmployeesEntityByDepartmentId(Integer deptId);
    List<EmployeesEntity> findEmployeesEntityByManagerId(Integer managerId);

//    @Query(value = "SELECT d.departmentId, e.salary FROM EmployeesEntity e JOIN DepartmentsEntity d ON d.departmentId = e.departmentId GROUP BY d.departmentId ORDER BY d.departmentId", nativeQuery = true)
//    List<EmployeesEntity> findEmployeesEntitiesBySalary();
}