/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package struts2.test.log4j;

//import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author ANIRBAN
 */
public class testLog4j {
    private static Logger log = Logger.getLogger(testLog4j.class);
 
    public static void main(String[] args) {
 
        log.debug("Sample debug message");  
        log.info("Sample info message");  
        log.error("Sample error message");  
        log.fatal("Sample fatal message");  
 
    }
}
