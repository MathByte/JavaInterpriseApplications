package Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "departments", schema = "hr", catalog = "")
public class DepartmentsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "department_id", nullable = false)
    private int departmentId;
    @Basic
    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;
    @Basic
    @Column(name = "location_id", nullable = true)
    private Integer locationId;
    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "location_id")
    private LocationsEntity locationsByLocationId;
    @OneToMany(mappedBy = "departmentsByDepartmentId")
    private Collection<EmployeesEntity> employeesByDepartmentId;
    @OneToMany(mappedBy = "departmentsByDepartmentId")
    private Collection<JobHistoryEntity> jobHistoriesByDepartmentId;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentsEntity that = (DepartmentsEntity) o;

        if (departmentId != that.departmentId) return false;
        if (departmentName != null ? !departmentName.equals(that.departmentName) : that.departmentName != null)
            return false;
        if (locationId != null ? !locationId.equals(that.locationId) : that.locationId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = departmentId;
        result = 31 * result + (departmentName != null ? departmentName.hashCode() : 0);
        result = 31 * result + (locationId != null ? locationId.hashCode() : 0);
        return result;
    }

    public LocationsEntity getLocationsByLocationId() {
        return locationsByLocationId;
    }

    public void setLocationsByLocationId(LocationsEntity locationsByLocationId) {
        this.locationsByLocationId = locationsByLocationId;
    }

    public Collection<EmployeesEntity> getEmployeesByDepartmentId() {
        return employeesByDepartmentId;
    }

    public void setEmployeesByDepartmentId(Collection<EmployeesEntity> employeesByDepartmentId) {
        this.employeesByDepartmentId = employeesByDepartmentId;
    }

    public Collection<JobHistoryEntity> getJobHistoriesByDepartmentId() {
        return jobHistoriesByDepartmentId;
    }

    public void setJobHistoriesByDepartmentId(Collection<JobHistoryEntity> jobHistoriesByDepartmentId) {
        this.jobHistoriesByDepartmentId = jobHistoriesByDepartmentId;
    }
}
