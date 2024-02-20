<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME</title>
</head>
<style>
	body{
        background-image: url("images/bg1.jpg");
        background-size:cover;
    }
    h1{
            animation: h_animinate 5s alternate-reverse 0s infinite;
        }
        @keyframes h_animinate{
            0%{
                color: red;
            }
            25%{
                color: blue;
            }
            75%{
                color: green;
            }
            100%{
                color: orangered;
            }
        }
        div{
        	display : flex;
        	justify-content : space-evenly;
        }
        a{
        	color : black;
        }
        a:hover{
        	color : red;
        	background-color : yellow;
        }
        a:active{
        	color : green;
        	background-color : white;
        }
</style>
<body>
<marquee behavior="alternate" direction="right"><h1>!!! <u>WELCOME</u> !!!</h1></marquee>
<div id="main">
	<a href="createEmp.jsp"><b>CREATE</b></a><br>
	<a href="updateEmp.jsp"><b>UPDATE</b></a><br>
	<a href="deleteEmp.jsp"><b>DELETE</b></a><br>
	<a href="displayEmp.jsp"><b>DISPLAY</b></a>
</div>
</body>
</html>
