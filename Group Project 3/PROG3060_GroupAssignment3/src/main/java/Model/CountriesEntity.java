package Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "countries", schema = "hr", catalog = "")
public class CountriesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "country_id", nullable = false, length = 2)
    private String countryId;
    @Basic
    @Column(name = "country_name", nullable = true, length = 40)
    private String countryName;
    @Basic
    @Column(name = "region_id", nullable = false)
    private int regionId;
    @ManyToOne
    @JoinColumn(name = "region_id", referencedColumnName = "region_id", nullable = false)
    private RegionsEntity regionsByRegionId;
    @OneToMany(mappedBy = "countriesByCountryId")
    private Collection<LocationsEntity> locationsByCountryId;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public RegionsEntity getRegionsByRegionId() {
        return regionsByRegionId;
    }

    public void setRegionsByRegionId(RegionsEntity regionsByRegionId) {
        this.regionsByRegionId = regionsByRegionId;
    }

    public Collection<LocationsEntity> getLocationsByCountryId() {
        return locationsByCountryId;
    }

    public void setLocationsByCountryId(Collection<LocationsEntity> locationsByCountryId) {
        this.locationsByCountryId = locationsByCountryId;
    }
}
