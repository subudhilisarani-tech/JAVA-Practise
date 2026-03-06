<%
int p1 = 10;
int p2 = 50;
int p3 = 5;
int p4 = 3;
int p5 = 15;

int q1 = Integer.parseInt(request.getParameter("q1"));
int q2 = Integer.parseInt(request.getParameter("q2"));
int q3 = Integer.parseInt(request.getParameter("q3"));
int q4 = Integer.parseInt(request.getParameter("q4"));
int q5 = Integer.parseInt(request.getParameter("q5"));

int total = (p1*q1) + (p2*q2) + (p3*q3) + (p4*q4) + (p5*q5);
%>

<html>
<body>

<h2>Total Bill = <%= total %></h2>

<a href="shop.html">Back to Shop</a>

</body>
</html>