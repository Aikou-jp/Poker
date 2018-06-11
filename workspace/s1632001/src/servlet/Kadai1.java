package servlet;
import java.io.IOException;
import java.io.PrintWriter;
import card.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kadai1
 */
@WebServlet("/Kadai1")
public class Kadai1 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// どのフォームの送信ボタンが押されたかを調べる
		request.setCharacterEncoding("UTF-8");
		String function = request.getParameter("function"); // あとで使う

		// HTMLの先頭の共通部分を出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>結果</title>");
		out.println("</head>");
		out.println("<body>");

		// 機能別に処理
		if (function.equals("1card")) {
			String filename = request.getParameter("card")+".png";
			out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
		} else if (function.equals("suit")) {
			char[] s = request.getParameter("suit").toCharArray();
			CardDeck cd = new CardDeck(s[0]);
			for(int i=0;i<13;i++){
				GameCard f = cd.nextCard();
				String filename = f+".png";
				out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
			}
		} else if (function.equals("sort")) {
			CardDeck cd = new CardDeck();
			for(int j=0;j<4;j++){
				for(int i=0;i<13;i++){
					GameCard f = cd.nextCard();
					String filename = f+".png";
					out.println("<img src=\"trump/"+filename+"\" width=\"100\"style=\"position:absolute;top:"+(j*150)+"px;left:"+(i*100)+"px\">");
				}
			}
		} else if (function.equals("shuffle")) {
			CardDeck cd = new CardDeck();
			cd.shuffle();
			for(int j=0;j<4;j++){
				for(int i=0;i<13;i++){
					GameCard f = cd.nextCard();
					String filename = f+".png";
					out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
				}
			}
		} else if (function.equals("5card")) {
			char[] s = request.getParameter("suit").toCharArray();
			CardDeck cd = new CardDeck(s[0]);
			cd.shuffle();
			MyCards mc = new MyCards(cd);
			for(int i=0;i<5;i++){
				String filename = mc.cards[i]+".png";
				out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
			}
		}else if (function.equals("cb")) {
			String str[] = request.getParameterValues("suit");
			char[] s = new char[str.length];
			char[] c;
			for(int i=0;i<str.length;i++){
				c = str[i].toCharArray();
				s[i] = c[0];
			}
			int limit = Integer.parseInt(request.getParameter("number"));
			CardDeck cd = new CardDeck(s,limit);
			for(int i=0;i<limit;i++){
				for(int j=0;j<s.length;j++){
				GameCard f = cd.nextCard();
				String filename = f+".png";
				out.println("<img src=\"trump/"+filename+"\" width=\"100\">");
				}
			}
		
		}

		// HTMLの末尾の共通部分を出力
		out.println("</body>");
		out.println("</html>");
	}
}
