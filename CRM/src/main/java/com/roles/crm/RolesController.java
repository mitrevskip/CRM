/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roles.crm;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Petar
 */
@Controller
@EnableAutoConfiguration
public class RolesController {

    @RequestMapping(value = "/methodRoles")
    @ResponseBody
    String rolesControl() {
        return "controling roles.";
    }
    
    @Controller
    @EnableAutoConfiguration
public class RolesController {
    @RequestMapping("/")
    public String getAllRoles(Model model)
    {
        //application code
        return "employeesList";
    }
     
    @RequestMapping("/employee-management/employees/add")
    public String addEmployee(EmployeeVO employee)
    {
        //application code
        return "employeesDetail";
    }
     
    @RequestMapping("/employee-management/employees/update")
    public String updateEmployee(EmployeeVO employee)
    {
        //application code
        return "employeesDetail";
    }
     
    @RequestMapping(value={"/employee-management/employees/remove","/employee-management/employees/delete"})
    public String removeEmployee(@RequestParam("id") String employeeId)
    {
        //application code
        return "employeesList";
    }
}
    
    
    
}
