package Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Date;

public class JobHistoryEntityPK implements Serializable {
    @Column(name = "Employee_Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    @Column(name = "Start_Date", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date startDate;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JobHistoryEntityPK that = (JobHistoryEntityPK) o;

        if (employeeId != that.employeeId) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeId;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        return result;
    }
}
