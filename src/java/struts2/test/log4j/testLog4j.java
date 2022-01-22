/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package struts2.test.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author ANIRBAN
 */
public class testLog4j {
    private static Logger log = Logger.getLogger(testLog4j.class);
 
    public static void main(String[] args) {
 
        log.debug("This is debug method");
        log.info("This is info method");
        log.error("This is error method");
 
        log.log(Level.DEBUG, "This is debug from Level.DEBUG");
        log.log(Level.INFO, "This is info from Level.INFO");
        log.log(Level.ERROR, "This is error from Level.ERROR");
 
    }
}
