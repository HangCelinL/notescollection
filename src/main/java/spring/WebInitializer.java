package spring;

import spring.config.SpringConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    System.out.println("test");
    return new Class[] { SpringConfig.class };
  }

  @Override
  protected String[] getServletMappings() {
    System.out.println("debug");
    return new String[] { "/" };
  }
}