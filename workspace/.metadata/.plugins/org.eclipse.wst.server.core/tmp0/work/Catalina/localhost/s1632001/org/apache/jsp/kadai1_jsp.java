/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2018-05-23 06:19:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;

public final class kadai1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>課題1</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<p>(1)sA, h5など名前を指定したカードを1枚表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"text\" name=\"card\" value=\"d9\">\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"1card\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<p>(2)指定したスーツのカードを全て表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"s\" checked=\"checked\">スペード\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"h\">ハート\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"d\">ダイヤ\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"c\">クラブ\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"suit\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<p>(3)全てのカードを整列した状態で表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"sort\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<p>(4)全てのカードをシャッフルした状態で表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"shuffle\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<p>(5)デッキから引き抜いた5枚のカードを表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"s\" checked=\"checked\">スペード\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"h\">ハート\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"d\">ダイヤ\n");
      out.write("<input type=\"radio\" name=\"suit\" value=\"c\">クラブ\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"5card\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<p>(6)指定したスーツ・指定した数以下の数字から構成されるカードデッキを作り、全て表示する</p>\n");
      out.write("<form action=\"/s1632001/Kadai1\" method=\"post\">\n");
      out.write("<input type=\"checkbox\" name=\"suit\" value=\"s\" checked=\"checked\">スペード\n");
      out.write("<input type=\"checkbox\" name=\"suit\" value=\"h\" checked=\"checked\">ハート\n");
      out.write("<input type=\"checkbox\" name=\"suit\" value=\"d\">ダイヤ\n");
      out.write("<input type=\"checkbox\" name=\"suit\" value=\"c\">クラブ\n");
      out.write("<input type=\"text\" name=\"number\" value=\"5\">\n");
      out.write("<input type=\"hidden\" name=\"function\" value=\"cb\">\n");
      out.write("<input type=\"submit\" value=\"送信\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
