package Model;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "regions", schema = "hr", catalog = "")
public class RegionsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "region_id", nullable = false)
    private int regionId;
    @Basic
    @Column(name = "region_name", nullable = true, length = 25)
    private String regionName;
    @OneToMany(mappedBy = "regionsByRegionId")
    private Collection<CountriesEntity> countriesByRegionId;

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegionsEntity that = (RegionsEntity) o;

        if (regionId != that.regionId) return false;
        if (regionName != null ? !regionName.equals(that.regionName) : that.regionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regionId;
        result = 31 * result + (regionName != null ? regionName.hashCode() : 0);
        return result;
    }

    public Collection<CountriesEntity> getCountriesByRegionId() {
        return countriesByRegionId;
    }

    public void setCountriesByRegionId(Collection<CountriesEntity> countriesByRegionId) {
        this.countriesByRegionId = countriesByRegionId;
    }
}
