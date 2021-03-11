package listeners;

import org.testng.ITestNGListener;

import java.lang.annotation.Annotation;

public class Listeners implements org.testng.annotations.Listeners {
    @Override
    public Class<? extends ITestNGListener>[] value() {
        return new Class[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
