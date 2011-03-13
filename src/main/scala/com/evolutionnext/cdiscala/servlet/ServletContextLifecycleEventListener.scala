package com.evolutionnext.cdiscala.servlet

import javax.enterprise.event.Observes
import javax.servlet.ServletContext
import org.jboss.seam.servlet.event.Initialized
import org.jboss.seam.servlet.WebApplication
import java.util.Date

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 3/12/11
 * Time: 3:54 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */

class ServletContextLifecycleEventListener {
  def observeServletContext(@Observes ctx: ServletContext) {
    println(ctx.getServletContextName + " initialized or destroyed")
  }

  def observeServletContextInitialized(@Observes @Initialized ctx: ServletContext) {
    println(ctx.getServletContextName + " initialized");
  }

  def observeWebAppInitialized(@Observes @Initialized webapp: WebApplication) {
    println(webapp.getName + " initialized at " + new Date(webapp.getStartTime));
  }
}