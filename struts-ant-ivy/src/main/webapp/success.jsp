<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<head>
    <title>Game result</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="container text-center">
    <h1 class="text-success">Congratulations the hidden number was <bean:write name="mainForm" property="number"/></h1>
    <html:link href="/main.do?restart=1" styleClass="btn btn-info">Restart</html:link>
</div>
</body>
</html:html>

