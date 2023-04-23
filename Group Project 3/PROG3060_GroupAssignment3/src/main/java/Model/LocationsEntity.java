package Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "locations", schema = "hr", catalog = "")
public class LocationsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "location_id", nullable = false)
    private int locationId;
    @Basic
    @Column(name = "street_address", nullable = true, length = 40)
    private String streetAddress;
    @Basic
    @Column(name = "postal_code", nullable = true, length = 12)
    private String postalCode;
    @Basic
    @Column(name = "city", nullable = false, length = 30)
    private String city;
    @Basic
    @Column(name = "state_province", nullable = true, length = 25)
    private String stateProvince;
    @Basic
    @Column(name = "country_id", nullable = false, length = 2)
    private String countryId;
    @OneToMany(mappedBy = "locationsByLocationId")
    private Collection<DepartmentsEntity> departmentsByLocationId;
    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "country_id", nullable = false)
    private CountriesEntity countriesByCountryId;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Collection<DepartmentsEntity> getDepartmentsByLocationId() {
        return departmentsByLocationId;
    }

    public void setDepartmentsByLocationId(Collection<DepartmentsEntity> departmentsByLocationId) {
        this.departmentsByLocationId = departmentsByLocationId;
    }

    public CountriesEntity getCountriesByCountryId() {
        return countriesByCountryId;
    }

    public void setCountriesByCountryId(CountriesEntity countriesByCountryId) {
        this.countriesByCountryId = countriesByCountryId;
    }
}
