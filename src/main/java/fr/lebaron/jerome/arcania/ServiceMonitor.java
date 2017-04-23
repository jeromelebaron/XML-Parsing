/**
 * 
 */
package fr.lebaron.jerome.arcania;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Jerome
 *
 */
@Aspect
@Component
public class ServiceMonitor {

    private final Log LOG = LogFactory.getLog(getClass());
    
    private Long miliDebut = System.currentTimeMillis(); 
    
    /**
     * 
     */
    public ServiceMonitor() {
        //vide
    }
    
    @Before("execution(* fr.lebaron.jerome.arcania..*.*(..))")
    public void logBefore(JoinPoint joinPoint){
        miliDebut = System.currentTimeMillis();
        LOG.info("Call " + String.valueOf(joinPoint.getSignature().getName()));
    }
    
    @After("execution(* fr.lebaron.jerome.arcania..*.*(..))")
    public void logAfter(JoinPoint joinPoint){
        LOG.info("END " + String.valueOf(joinPoint.getSignature().getName()));
        LOG.info("Time pass : " + String.valueOf(System.currentTimeMillis() - miliDebut));
    }
}
