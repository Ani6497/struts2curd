/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package struts2.test.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;
import struts2.test.beans.Product;
import struts2.test.dao.Products;

/**
 *
 * @author ANIRBAN
 */
public class ProductAction extends ActionSupport {

    private int productId;
    private String productName;
    private String productMake;
    private double price;
    private int availability;

    private static final long serialVersionUID = 6329394260276112660L;
    private String msg = "";
    Products products = null;
    private int ctr = 0;
    Products dao = new Products();
    private String submitType;
    private List<Product> productList = null;
    private boolean noData = false;

    private static final Logger logger = Logger.getLogger(ProductAction.class);

    public String execute() {
        logger.info("inside ProductAction execute method");
        return SUCCESS;
    }

    public String addproduct() throws Exception {
        products = new Products();

        try {
            setCtr(products.registerProduct(productId, productName, productMake, price,
                    availability));
            if (getCtr() > 0) {
                setMsg("Registration Successfull");
            } else {
                setMsg("Some error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ADD PRODUCT";
    }

    public String updateProduct() throws Exception {

        try {
            if (submitType.equals("updateProduct")) {
                Product product = dao.fetchProductDetails(productId);
                if (product != null) {
                    productId = product.getProductId();
                    productName = product.getProductName();
                    productMake = product.getProductMake();
                    price = product.getPrice();
                    availability = product.getAvailability();

                }
            } else {
                int i = dao.updateProductDetails(productId, productName, productMake, price,
                        availability);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE PRODUCT";
    }

    public String reportProduct() throws Exception {
        try {
            setProductList(new ArrayList<>());
            setProductList(dao.reportProduct());

            if (!productList.isEmpty()) {
                setNoData(false);
                System.out.println("Products retrieve = " + getProductList().size());
                System.out.println("setting nodata=false");
            } else {
                setNoData(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "PRODUCT REPORT";
    }

    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productMake
     */
    public String getProductMake() {
        return productMake;
    }

    /**
     * @param productMake the productMake to set
     */
    public void setProductMake(String productMake) {
        this.productMake = productMake;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the availability
     */
    public int getAvailability() {
        return availability;
    }

    /**
     * @param availability the availability to set
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the ctr
     */
    public int getCtr() {
        return ctr;
    }

    /**
     * @param ctr the ctr to set
     */
    public void setCtr(int ctr) {
        this.ctr = ctr;
    }

    /**
     * @return the submitType
     */
    public String getSubmitType() {
        return submitType;
    }

    /**
     * @param submitType the submitType to set
     */
    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    /**
     * @return the productList
     */
    public List<Product> getProductList() {
        return productList;
    }

    /**
     * @param productList the productList to set
     */
    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    /**
     * @return the noData
     */
    public boolean isNoData() {
        return noData;
    }

    /**
     * @param noData the noData to set
     */
    public void setNoData(boolean noData) {
        this.noData = noData;
    }
}
