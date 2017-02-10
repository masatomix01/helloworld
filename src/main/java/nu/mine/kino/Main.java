package nu.mine.kino;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;

@SpringBootApplication
@ServletComponentScan
public class Main implements ServletContextInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void onStartup(ServletContext context) throws ServletException {

        // context.setInitParameter("javax.servlet.jsp.jstl.fmt.request.charset",
        // "UTF-8");
        // context.setInitParameter("contextConfigLocation",
        // "classpath:applicationContext.xml");

        // Ç±ÇÍÇÕÇ†ÇÈÇ∆ÉGÉâÅ[ÅB
        // context.addListener(ContextLoaderListener.class);

        FilterRegistration.Dynamic cef = context.addFilter(
                "CharacterEncodingFilter", CharacterEncodingFilter.class);
        cef.addMappingForUrlPatterns(null, false, "/*");
        cef.setInitParameter("encoding", "UTF-8");
        cef.setInitParameter("forceEncoding", "true");

        // Dynamic restServlet = context.addServlet("restServlet",
        // RESTServlet.class);
        // restServlet.addMapping("*.json");
        // String config = " {" + " 'debug': true,"
        // + " 'mappings': {"
        // + " '/hogehoge/fugafuga/{key}.{ext}':{
        // 'target':'nu.mine.kino.web.Example','verb': [ 'GET','POST'
        // ,'PUT','DELETE']}"
        // + " },"
        // + " 'processor':{'prettyPrint':true},"
        // + " 'definitions':{"
        // + " 'key':'[^/()]+',"
        // + " 'address':'[^/()]+'" + " },"
        // + " errors:{"
        // + " }" + " }";
        // restServlet.setInitParameter("config", config);

    }
}
