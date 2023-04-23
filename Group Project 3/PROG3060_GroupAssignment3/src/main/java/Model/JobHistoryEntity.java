package Model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "job_history", schema = "hr", catalog = "")
@IdClass(JobHistoryEntityPK.class)
public class JobHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Employee_Id", nullable = false)
    private int employeeId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Start_Date", nullable = false)
    private Date startDate;
    @Basic
    @Column(name = "End_Date", nullable = true)
    private Date endDate;
    @Basic
    @Column(name = "Job_Id", nullable = true)
    private Integer jobId;
    @Basic
    @Column(name = "Department_Id", nullable = true)
    private Integer departmentId;
    @ManyToOne
    @JoinColumn(name = "Job_Id", referencedColumnName = "job_id")
    private JobsEntity jobsByJobId;
    @ManyToOne
    @JoinColumn(name = "Department_Id", referencedColumnName = "department_id")
    private DepartmentsEntity departmentsByDepartmentId;

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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public JobsEntity getJobsByJobId() {
        return jobsByJobId;
    }

    public void setJobsByJobId(JobsEntity jobsByJobId) {
        this.jobsByJobId = jobsByJobId;
    }

    public DepartmentsEntity getDepartmentsByDepartmentId() {
        return departmentsByDepartmentId;
    }

    public void setDepartmentsByDepartmentId(DepartmentsEntity departmentsByDepartmentId) {
        this.departmentsByDepartmentId = departmentsByDepartmentId;
    }
}
