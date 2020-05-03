package com.example.cloudsql.controller;

// import com.example.cloudsql.model.Reading;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
 
import javax.servlet.http.HttpServletRequest;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.earthleaderproject.dao.ReadingDAO;

import java.sql.SQLException;
//--------------Additional--------------
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Nullable;
import javax.sql.DataSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
//--------------Additional--------------


/**
 *
 * @author Jignesh
 */
@Controller
//@RequestMapping("/EarthLeaderProject")
public class HomeController {
    
//     @Autowired
//     private ReadingDAO readingDAO;
    
//    @RequestMapping(value="/home", method = RequestMethod.GET)
//    public ModelAndView loginReading(ModelAndView model) throws IOException{
//        Integer intRecord_count = readingDAO.record_count();
//        model.addObject("count", intRecord_count);
//        model.setViewName("login");
//        return model;
//    }
    
// //  ------------------ Original requestmaping ------------------
//     @RequestMapping(value="/", method = RequestMethod.GET)
//     public ModelAndView listReading(ModelAndView model) {
// //      try{
//          List<Reading> listReading = readingDAO.list();
//         model.addObject("listReading", listReading);
// //      } catch(Exception ex) {
// //       model.addObject("message", ex.getMessage());
// //      }
//         model.setViewName("home");
//         return model;
//     }
//  //  ------------------ Original requestmaping ------------------
 
 
    @RequestMapping(value="/", method = RequestMethod.GET)
    public ModelAndView listReading(ModelAndView model) {
        //List<Reading> listReading = readingDAO.list();
     
        DataSource pool = null;
        HikariConfig config = new HikariConfig();
     
// //         config.setDriverClassName("com.mysql.cj.jdbc.Driver"); // org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.NullPointerException
// //         config.setDriverClassName("com.mysql.jdbc.GoogleDriver"); // org.springframework.web.util.NestedServletException: Request processing failed; nested exception is java.lang.RuntimeException: Failed to load driver class com.mysql.jdbc.GoogleDriver in either of HikariConfig class loader or Thread context classloader
//         String DB_NAME = "earthleader";
//         config.setJdbcUrl(String.format("jdbc:mysql:///%s", DB_NAME));
//         config.setUsername("user1");
//         config.setPassword("user1");
//         config.addDataSourceProperty("socketFactory", "com.google.cloud.sql.mysql.socket.factory.connector.j.8");
//         String CLOUD_SQL_CONNECTION_NAME = "earthleader-274407:asia-south1:mysql57";
//         config.addDataSourceProperty("cloudSqlInstance", CLOUD_SQL_CONNECTION_NAME);
        String DB_NAME = "earthleader";
        config.setJdbcUrl(String.format("jdbc:mysql:///%s", DB_NAME));
        config.setUsername("user1");
        config.setPassword("user1");
        config.addDataSourceProperty("socketFactory", "com.google.cloud.sql.mysql.SocketFactory");
        String CLOUD_SQL_CONNECTION_NAME = "earthleader-274407:asia-south1:mysql57";
        config.addDataSourceProperty("cloudSqlInstance", CLOUD_SQL_CONNECTION_NAME);
        pool = new HikariDataSource(config);
//         org.springframework.web.util.NestedServletException: Handler processing failed; nested exception is java.lang.NoSuchMethodError: 'void com.google.common.base.Throwables.throwIfUnchecked(java.lang.Throwable)'
//         at com.google.cloud.sql.core.CloudSqlInstance.getInstanceData(CloudSqlInstance.java:133)
//         at com.google.cloud.sql.core.CloudSqlInstance.createSslSocket(CloudSqlInstance.java:143)
     
//         DataSource pool = tempDataSource;
           List<Reading> listReading = new ArrayList<>();
           try (Connection conn = pool.getConnection()) {
            String stmt1 = "SELECT * FROM reading";
            try (PreparedStatement voteStmt = conn.prepareStatement(stmt1); ) {
              // Execute the statement
              ResultSet voteResults = voteStmt.executeQuery();
              // Convert a ResultSet into Vote objects
              while (voteResults.next()) {
   //              String candidate = voteResults.getString(1);
   //              Timestamp timeCast = voteResults.getTimestamp(2);
                String strSchool = voteResults.getString("School");
                int intDevice = voteResults.getInt("Device");
                listReading.add(new Reading(strSchool, intDevice));
              }
            }
          } catch (SQLException ex) {}
//         return listReading;
     
     
        model.addObject("listReading", listReading);
        model.setViewName("home");
        return model;
    }

//    @RequestMapping(value = "/newReading", method = RequestMethod.GET)
//    public ModelAndView newReading(ModelAndView model) {
//        Reading newReading = new Reading();
//        model.addObject("reading", newReading);
//        model.setViewName("ReadingForm");
//        return model;
//    }
//    
////    @RequestMapping(value = "/saveReading", method = RequestMethod.POST)
//    @RequestMapping(value = "/saveReading1", method = RequestMethod.POST)
//    public ModelAndView saveReading(@ModelAttribute Reading reading) {
//        //readingDAO.saveOrUpdate(reading);
//        return new ModelAndView("redirect:/");
//    }
//    
//    @RequestMapping(value = "/deleteReading", method = RequestMethod.GET)
//    public ModelAndView deleteReading(HttpServletRequest request) {
//        int intRecord_ID = Integer.parseInt(request.getParameter("Record_ID"));
//        readingDAO.delete(intRecord_ID);
//        return new ModelAndView("redirect:/");
//    }
//    
//    @RequestMapping(value = "/editReading", method = RequestMethod.GET)
//    public ModelAndView editReading(HttpServletRequest request) {
//        int intRecord_ID = Integer.parseInt(request.getParameter("Record_ID"));
//        Reading reading = readingDAO.get(intRecord_ID);
//        ModelAndView model = new ModelAndView("ContactForm");
//        model.addObject("reading", reading);
//
//        return model;
//    }
}
