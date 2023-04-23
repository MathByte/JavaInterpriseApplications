package Repository;

import Model.DepartmentsEntity;
import Model.EmployeesEntity;
import Model.LocationsEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LocationRepo extends
        CrudRepository<LocationsEntity, Integer> {
    List<LocationsEntity> findLocationsEntitiesByCountryId(String country);
    Long countLocationsEntitiesByCountryId(String countryId);

    List<LocationsEntity> findLocationsEntitiesByCountryIdIsNotNull();
}