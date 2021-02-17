<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
<head>
    <title>About the game</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
    <script type="application/javascript" src="js/jquery-3.5.1.min.js"></script>
    <script type="application/javascript" src="js/main.js"></script>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Game rules</h1>
        <p class="text-center"><bean:write name="aboutForm" property="rule"/></p>
        <div class="row">
            <div class="more-info hidden col-md-6 m-auto text-left"></div>
        </div>
        <div class="row">
            <div class="col-md-12 text-center">
                <html:link href="/" styleClass="btn btn-primary"><bean:write name="aboutForm" property="buttonText"/></html:link>
                <html:button styleClass="btn btn-info details" value="More info" property="details"/>
            </div>
        </div>
    </div>
</body>
</html:html>
