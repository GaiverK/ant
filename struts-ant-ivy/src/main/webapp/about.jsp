<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<head>
    <title>About the game</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div class="container text-center">
        <h1 class="h1-rule">Game rules</h1>
        <p><bean:write name="aboutForm" property="rule"/></p>
        <html:link href="/" styleClass="btn btn-primary"><bean:write name="aboutForm" property="buttonText"/></html:link>
    </div>
</body>
</html:html>
