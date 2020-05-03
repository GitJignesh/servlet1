package com.example.cloudsql.config;

import com.example.cloudsql.model.Reading;

 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
// import com.example.cloudsql.model.ReadingDAO;
// import com.zaxxer.hikari.HikariConfig;
// import com.zaxxer.hikari.HikariDataSource;

// import java.sql.SQLException;
// import javax.servlet.ServletException;

// // import com.zaxxer.hikari.HikariConfig;
// // import com.zaxxer.hikari.HikariDataSource;
// // import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// // import java.sql.SQLException;
// import javax.servlet.ServletContext;
// import javax.servlet.ServletContextEvent;
// import javax.servlet.ServletContextListener;
// import javax.servlet.annotation.WebListener;
// import javax.sql.DataSource;

// import java.io.IOException;
// import java.sql.ResultSet;
// import java.sql.Timestamp;
// import java.util.ArrayList;
// import java.util.Date;
// import java.util.List;
// import java.util.Locale;
// import java.util.logging.Level;
// import java.util.logging.Logger;
// import javax.annotation.Nullable;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
// import javax.sql.DataSource;

// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
// import org.springframework.boot.SpringApplication;
// import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Jignesh
 */
@Configuration
@ComponentScan(basePackages="com.mycompany.earthleaderproject")
@EnableWebMvc
// @EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class MvcConfiguration extends WebMvcConfigurerAdapter{
    
//     // Added on 28-04-2020
//     public MvcConfiguration(){
//     }
 
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    

 
//     @Bean
//     public ReadingDAO getReadingDAO() { //throws SQLException {
//         return new ReadingDAOImpl(getDataSource());
//     }

    
//    //JSon from javascript can't pass '{', '}' in URL as data.
//    @Bean
//    public TomcatServletWebServerFactory containerFactory() {
//        return new TomcatServletWebServerFactory() {
//            protected void customizeConnector(Connector connector) {
//                int maxSize = 50000000;
//                super.customizeConnector(connector);
//                connector.setMaxPostSize(maxSize);
//                connector.setMaxSavePostSize(maxSize);
//                if (connector.getProtocolHandler() instanceof AbstractHttp11Protocol) {
//
//                    ((AbstractHttp11Protocol <?>) connector.getProtocolHandler()).setMaxSwallowSize(maxSize);
//                    logger.info("Set MaxSwallowSize "+ maxSize);
//                }
//            }
//        };
//    }
    
//    @Bean
//    public ServletWebServerFactory servletContainer() {
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        tomcat.addAdditionalTomcatConnectors(redirectConnector());
//        return tomcat;
//    }
//    
//    private Connector redirectConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8443);
//        return connector;
//    }

//    @Bean
//    public EmbeddedServletContainerFactory webServerFactory() {
//        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
//        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
//            @Override
//            public void customize(Connector connector) {
//                connector.setProperty("relaxedQueryChars", "|{}[]");
//            }
//        });
//        return factory;
//    }
//
//    @Bean
//    public ConfigurableServletWebServerFactory webServerFactory() {
//        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
//        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
//            @Override
//            public void customize(Connector connector) {
//                connector.setProperty("relaxedQueryChars", "|{}[]");
//            }
//        });
//        return factory;
//    }
}
