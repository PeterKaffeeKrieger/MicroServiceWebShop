/*
 * Sanity Service
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * Contact: bhb127@outlook.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package hska.microServiceWebShop.api;

import hska.microServiceWebShop.ApiException;
import hska.microServiceWebShop.models.Role;
import hska.microServiceWebShop.models.RoleQuery;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for UserRoleApi
 */
//@Ignore
public class UserRoleApiTest {

    private final UserRoleApi api = new UserRoleApi();

    
    /**
     * Create role
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() throws ApiException {
        Role role = new Role();
        role.setTyp("role1");
        role.setLevel(1);

        System.out.println("create role");
        role = api.createRole(role);
        System.out.println(role.toString());

        System.out.println("get rolebyid");
        Long id = role.getId();
        Role response = api.getRoleById(id);
        
        System.out.println(response.toString());

        System.out.println("query roles");
        RoleQuery query = new RoleQuery();
        List<Role> responses = api.getRoles(query);
        
        for(Role r: responses) {
        	System.out.println(r.toString());
        }
        
        System.out.println("query role1");
        query = new RoleQuery();
        query.setText("role1");
        responses = api.getRoles(query);
        
        for(Role r: responses) {
        	System.out.println(r.toString());
        }
        // TODO: test validations
        
        System.out.println("delete role1");
        id = response.getId();
        api.deleteRole(id);
        
        System.out.println("try get role1");
        try {
        	api.getRoleById(id);
        	assert false;
        }catch(ApiException e) {
        	System.out.println(e.getMessage());
        }

        // TODO: test validations
    }
    
}
