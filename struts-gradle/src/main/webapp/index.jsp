<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
  <head>
    <title>Find hidden number</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
  </head>
<body>
<div class="center">
  <h1>Try to find hidden number in range 0-10</h1>
  <div class="center">
    <html:form action="/main">
      <html:text property="number"/>
      <html:submit />
      <p class="errors">
        <html:errors />
      </p>
    </html:form>
  </div>
  <a href="/about.do">game rules</a>
</div>
</body>
</html:html>
