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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Role;
import io.swagger.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserRoleApi
 */
@Ignore
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
        Role role = null;
        api.createRole(role);

        // TODO: test validations
    }
    
    /**
     * Create user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        User user = null;
        api.createUser(user);

        // TODO: test validations
    }
    
    /**
     * Delete role with Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRoleTest() throws ApiException {
        Long id = null;
        api.deleteRole(id);

        // TODO: test validations
    }
    
    /**
     * Delete user with Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        Long id = null;
        api.deleteUser(id);

        // TODO: test validations
    }
    
    /**
     * Get role by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoleByIdTest() throws ApiException {
        Long id = null;
        Role response = api.getRoleById(id);

        // TODO: test validations
    }
    
    /**
     * Get roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesTest() throws ApiException {
        String typ = null;
        Integer level = null;
        List<Role> response = api.getRoles(typ, level);

        // TODO: test validations
    }
    
    /**
     * Get user by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserByIdTest() throws ApiException {
        Long id = null;
        User response = api.getUserById(id);

        // TODO: test validations
    }
    
    /**
     * Get users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        String username = null;
        String firstname = null;
        String lastname = null;
        Long roleId = null;
        List<User> response = api.getUsers(username, firstname, lastname, roleId);

        // TODO: test validations
    }
    
    /**
     * Set role by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRoleByIdTest() throws ApiException {
        Long id = null;
        Role role = null;
        api.setRoleById(id, role);

        // TODO: test validations
    }
    
    /**
     * Set user by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setUserByIdTest() throws ApiException {
        Long id = null;
        User user = null;
        api.setUserById(id, user);

        // TODO: test validations
    }
    
}
