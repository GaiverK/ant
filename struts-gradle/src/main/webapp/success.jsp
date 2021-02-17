<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<head>
    <title>Game result</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="center">
    <h1 style="text-align: center; color: green">Congratulations the hidden number was <bean:write name="mainForm" property="number"/></h1>
    <a href="/main.do?restart=1">restart the game</a>
</div>
</body>
</html:html>

