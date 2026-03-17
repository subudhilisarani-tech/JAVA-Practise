<!DOCTYPE html>
<html>
<head>
<title>Dashboard</title>

<style>

body{
font-family: Arial;
background: linear-gradient(135deg,#4facfe,#00f2fe);
height:100vh;
display:flex;
justify-content:center;
align-items:center;
}

.box{
background:white;
padding:40px;
width:350px;
border-radius:10px;
box-shadow:0 0 10px rgba(0,0,0,0.2);
text-align:center;
}

h2{
color:#333;
margin-bottom:10px;
}

p{
font-size:16px;
color:#555;
}

ul{
list-style:none;
padding:0;
}

ul li{
background:#f2f2f2;
margin:8px 0;
padding:10px;
border-radius:5px;
}

.logout{
display:inline-block;
margin-top:20px;
padding:10px 20px;
background:#ff4b5c;
color:white;
text-decoration:none;
border-radius:5px;
}

.logout:hover{
background:#e63946;
}

</style>

</head>

<body>

<div class="box">

<h2>Student Dashboard</h2>

<p>Welcome Student</p>

<ul>
<li>View Profile</li>
<li>Check Marks</li>
<li>View Attendance</li>
</ul>

<br>

<h2>Admin Dashboard</h2>

<p>Welcome Admin</p>

<ul>
<li>Add Student</li>
<li>Manage Results</li>
<li>View Reports</li>
</ul>

<br>

<a href="login.html" class="logout">Logout</a>

</div>

</body>
</html>