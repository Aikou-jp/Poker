<%@ page  contentType="text/html; charset=UTF-8"
    import = "card.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
GameCard[] hand = new GameCard[10];
CardDeck deck = new CardDeck();
for (int i=0;i<10;i++){
	GameCard gamecard = deck.nextCard();
	hand[i] = gamecard;
	deck.shuffle();
}
for (int i=0;i<10;i++){
%>
<p><%=hand[i] %></p>
<%} %>
</body>
</html>