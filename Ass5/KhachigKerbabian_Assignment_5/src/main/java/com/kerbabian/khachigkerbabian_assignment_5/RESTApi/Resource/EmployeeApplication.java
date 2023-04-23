package com.kerbabian.khachigkerbabian_assignment_5.RESTApi.Resource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/resource")
public class EmployeeApplication extends Application {
    private Set<Class<?>> resources = new HashSet<>();

    public EmployeeApplication(){
        resources.add(EmployeeResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return super.getClasses();
    }
}