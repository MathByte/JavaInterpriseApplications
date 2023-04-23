package Repository;

import Model.DepartmentsEntity;
import Model.LocationsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Component
public interface DepartmentRepo extends CrudRepository<DepartmentsEntity, Integer> {

//    @Query(value = "SELECT d.departmentName, l.city, l.state_province FROM DepartmentsEntity d JOIN LocationsEntity l ON d.locationId = l.locationId", nativeQuery = true)
//
//    List<DepartmentsEntity> findDepartmentsEntitiesByLocationsEntity();

    List<DepartmentsEntity> findDepartmentsEntitiesByLocationId(Integer locId);
}