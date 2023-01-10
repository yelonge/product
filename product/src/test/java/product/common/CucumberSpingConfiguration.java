package product.common;


import product.ProductApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductApplication.class })
public class CucumberSpingConfiguration {
    
}
