import javax.servlet.http.{HttpServletRequest, HttpServletResponse}
import javax.servlet.{ServletResponse, ServletRequest}
import javax.enterprise.event.Observes

/**
 * Created by Daniel Hinojosa
 * User: Daniel Hinojosa
 * Date: 2/28/11
 * Time: 4:39 PM
 * url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 * email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 * tel: 505.363.5832
 */


class ExampleServlet {
  def observeRequest(@Observes request:ServletRequest, @Observes response:ServletResponse) {
    response.setContentType("text/html");
    val out = response.getWriter();
    out.println("<HTML>");
    out.println("<HEAD><TITLE>Bootstrap CDI</TITLE></HEAD>");
    out.println("<BODY>");
    out.println("Do it");
    out.println("</BODY>");
    out.println("</HTML>");
    out.close();
  }
}
