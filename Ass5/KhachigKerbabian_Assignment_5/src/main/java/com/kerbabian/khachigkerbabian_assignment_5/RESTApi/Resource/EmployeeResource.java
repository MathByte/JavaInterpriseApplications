package com.kerbabian.khachigkerbabian_assignment_5.RESTApi.Resource;

import com.kerbabian.khachigkerbabian_assignment_5.RESTApi.Model.Employee;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.*;

@Path("/employees")
public class EmployeeResource {

    private static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee >();
    static {
        Employee emp1 = new Employee(1, "John", "Doe", "john.doe@example.com", new Date(), 50000.0);
        Employee emp2 = new Employee(2, "Jane", "Doe", "jane.doe@example.com", new Date(), 60000.0);
        Employee emp3 = new Employee(3, "Bob", "Smith","bob.smith@example.com",new Date() , 75000.0);


        employeeMap.put(emp1.getId(), emp1);
        employeeMap.put(emp2.getId(), emp2);
        employeeMap.put(emp3.getId(), emp3);
    }

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Welcome To Employee Management System";
    }


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> listemployees() {
        return new ArrayList<Employee>(employeeMap.values());
    }

    @GET
    @Path("/employee/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") int employeeId) {
        return employeeMap.get(employeeId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee createemployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employeeMap.get(employee.getId());
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteEmployee(@PathParam("id") int id) {
        employeeMap.remove(id);
        return Response.noContent().build();
    }

    @PUT
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateEmployee(@PathParam("id") int id, Employee employee) {
        employee.setId(id);
        employeeMap.put(id, employee);
        if (employeeMap.get(employee.getId()) == null ) {
            return Response.status(404).build();
        }
        else {
            return Response.ok(employeeMap.get(employee.getId())).build();
        }
    }
}