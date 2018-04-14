/**
 * 
 */
package uvsoftgroup.uvsoftgroupgemfirewebapp1.config;

import java.util.Properties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.CacheFactoryBean;
import org.springframework.data.gemfire.LocalRegionFactoryBean;
import com.gemstone.gemfire.cache.GemFireCache;
import uvsoftgroup.uvsoftgroupgemfirewebapp1.model.UserRegistration;
import uvsoftgroup.uvsoftgroupgemfirewebapp1.model.UserRole;
 
/**
 * @author A.Riaydh
 *
 */

@Configuration
public class GemfireConfig {
    @Bean
    Properties gemfireProperties() {
        Properties gemfireProperties = new Properties();
        gemfireProperties.setProperty("name", "EmbeddedGemfireApplication");
        gemfireProperties.setProperty("mcast-port", "0");
        return gemfireProperties;
    }
     
    @Bean
    CacheFactoryBean gemfireCache() {
        CacheFactoryBean gemfireCache = new CacheFactoryBean();
        gemfireCache.setProperties(gemfireProperties());
        return gemfireCache;
    }
     
    @Bean
    LocalRegionFactoryBean<String, UserRegistration> userRegistrationRegion(final GemFireCache cache) {
        LocalRegionFactoryBean<String, UserRegistration> customerRegion = new LocalRegionFactoryBean<>();
        customerRegion.setCache(cache);
        customerRegion.setName("userRegistration");
        customerRegion.setPersistent(false);
        return customerRegion;
    }
    
    @Bean
    LocalRegionFactoryBean<String, UserRole> userRoleRegion(final GemFireCache cache) {
        LocalRegionFactoryBean<String, UserRole> customerRegion = new LocalRegionFactoryBean<>();
        customerRegion.setCache(cache);
        customerRegion.setName("userRole");
        customerRegion.setPersistent(false);
        return customerRegion;
    }
}
