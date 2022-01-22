package struts2.test.dao;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;

/**
 *
 * @author Anirban
 */
public class ProductsTest {

    public static Product testProduct = new Product();

    public ProductsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Running before all tests");
        testProduct.setProductId(1);
        testProduct.setProductName("Baby Powder");
        testProduct.setProductMake("Erickson");
        testProduct.setPrice(251.6);
        testProduct.setAvailability(10);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Running after all tests");
    }

    /**
     * Test of addProducts method, of class Products.
     */
    @Test
    public void testregisterProduct() throws Exception {
        System.out.println("addProductsTest running");
        int productId = 105;
        String productName = "testName";
        String productMake = "test";
        double price = 456.25;
        int availability = 123;

//actual result
        Products instance = new Products();
        int actResult = instance.registerProduct(productId,productName, productMake, price, availability);

        int expResult = 1;

        assertEquals(expResult, actResult);
    }

    /**
     * Test of reportProduct method, of class Products.
     */
// @Test
// public void testReportProduct() throws Exception {
// System.out.println("reportProduct");
// Products instance = new Products();
// List expResult = null;
// List result = instance.reportProduct();
// assertEquals(expResult, result);
// // TODO review the generated test code and remove the default call to fail.
// fail("The test case is a prototype.");
// }
    /**
     * Test of fetchProductDetails method, of class Products.
     */
    @Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetailsTest running....");

//actual product
        Products instance = new Products();
        Product actResult = instance.fetchProductDetails(1);

//expected product
        Product expResult = testProduct;

        boolean result = expResult.equals(actResult);
//assertEquals(expResult, actResult);
        assertTrue(result);

    }

    /**
     * Test of updateProductDetails method, of class Products.
     */
// @Test
// public void testUpdateProductDetails() throws Exception {
// System.out.println("updateProductDetails");
// int productId = 0;
// String productName = "";
// double price = 0.0;
// int availability = 0;
// Products instance = new Products();
// int expResult = 0;
// int result = instance.updateProductDetails(productId, productName, price, availability);
// assertEquals(expResult, result);
// // TODO review the generated test code and remove the default call to fail.
// fail("The test case is a prototype.");
// }
}
