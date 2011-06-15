package com.evolutionnext.cdiscala.annotation;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 5/31/11
 * Time: 10:48 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

@Qualifier
@Documented
@Retention(RUNTIME) @Target({FIELD, METHOD, TYPE, PARAMETER})
public @interface Blank {
}

