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
import hska.microServiceWebShop.models.Product;
import hska.microServiceWebShop.models.ProductQuery;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ProductsApi
 */
//@Ignore
public class ProductsApiTest {

    private final ProductsApi api = new ProductsApi();

    
    @Test
    public void addAndDeleteCategoryTest() throws ApiException {
        try {
            Product pro = new Product();
            pro.setName("pro1");
            pro.setDetails("no details");
            pro.setCategory(1L);
            pro.setPrice(50.50);

            // Add pro1
            System.out.println("Add pro1");
            Product proRes = api.addProduct(pro);
            System.out.println(proRes.toString());
            assert proRes.getName().equalsIgnoreCase("pro1");
            assert proRes.getId() != null;

            // Delete pro1
            System.out.println("Delete pro1");
            Long id = proRes.getId();
            api.deleteProduct(id);
        }catch (ApiException e){
            System.err.println(e.getCode());
            System.err.println(e.getMessage());
            System.err.println(e.getResponseBody());
            System.err.println(e.getStackTrace());
        }

    }

    @Test
    public void addAndQueryCategoryTest() throws ApiException {
        try {
            Product pro = new Product();
            pro.setName("pro2");
            pro.setDetails("no details");
            pro.setCategory(1L);
            pro.setPrice(50.50);

            // Add pro2
            System.out.println("Add pro2");
            Product response = api.addProduct(pro);
            System.out.println(response.toString());
            assert response.getName().equalsIgnoreCase("pro2");
            assert response.getId() != null;

            // get pro2 by id
            System.out.println("get cat2 by id");
            Long id = response.getId();
            Product response2 = api.getProduct(id);
            System.out.println(response.toString());
            assert response2.getName().equalsIgnoreCase("pro2");

            pro = new Product();
            pro.setName("pro3");
            pro.setDetails("no details");
            pro.setCategory(1L);
            pro.setPrice(50.50);

            // add pro3
            System.out.println("add pro3");
            response = api.addProduct(pro);
            System.out.println(response.toString());
            assert response.getName().equalsIgnoreCase("pro3");
            assert response.getId() != null;

            // query for pro3
            System.out.println("query for pro3");
            ProductQuery query = new ProductQuery();
            query.setText("pro3");
            List<Product> responses = api.queryProducts(query);
            for (Product c: responses) {
                System.out.println(c.toString());
                assert response.getName().contains("pro3");
            }

            // query for all
            System.out.println("query for all");
            query = new ProductQuery();
            responses = api.queryProducts(query);
            for (Product c: responses) {
                System.out.println(c.toString());

                // Delete catX
                System.out.println("Delete " + c.getName());
                id = c.getId();
                api.deleteProduct(id);
            }

            // query for all
            System.out.println("query for all");
            query = new ProductQuery();
            responses = api.queryProducts(query);
            assert responses.size() == 0;


        }catch (ApiException e){
            System.err.println(e.getCode());
            System.err.println(e.getMessage());
            System.err.println(e.getResponseBody());
            System.err.println(e.getStackTrace());
        }

    }

    @Test
    public void addTwoTimesCategoryTest() throws ApiException {
        try {
            Product pro = new Product();
            pro.setName("pro4");

            // Add pro4
            System.out.println("Add pro4");
            Product response = api.addProduct(pro);
            System.out.println(response.toString());
            assert response.getName().equalsIgnoreCase("pro4");
            assert response.getId() != null;

            try {
                // Add pro4
                System.out.println("Add pro4");
                response = api.addProduct(pro);
                System.out.println(response.toString());
                assert response.getName().equalsIgnoreCase("pro4");
                assert response.getId() != null;
            }catch (ApiException e){
                System.err.println(e.getCode());
                System.err.println(e.getMessage());
                System.err.println(e.getResponseBody());
                System.err.println(e.getStackTrace());
            }

            // Delete pro4
            System.out.println("Delete pro4");
            Long id = response.getId();
            api.deleteProduct(id);
        }catch (ApiException e){
            System.err.println(e.getCode());
            System.err.println(e.getMessage());
            System.err.println(e.getResponseBody());
            System.err.println(e.getStackTrace());
        }

    }
    
}
