<%
int a = Integer.parseInt(request.getParameter("n1"));
int b = Integer.parseInt(request.getParameter("n2"));
String op = request.getParameter("op");

int result = 0;

if(op.equals("Add"))
result = a + b;

else if(op.equals("Sub"))
result = a - b;

else if(op.equals("Mul"))
result = a * b;

else if(op.equals("Div"))
result = a / b;

%>

<h2>Result = <%= result %></h2>

<a href="demo.html">Back</a>