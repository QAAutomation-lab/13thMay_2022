/**
 * 
 */
package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author shailesh.kumar
 *
 */
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

 
public class AnnotationTransformer implements IAnnotationTransformer {
 
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(Retry.class);
    }
}