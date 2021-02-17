<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<html:html>
  <head>
    <title>Find hidden number</title>
    <link href="bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css">
  </head>
<body>
<div class="container text-center">
  <h1>Hidden number</h1>
  <p>Try to find hidden number in range 0-10</p>
  <div class="row">
    <div class="col-md-6 m-auto">
      <html:form action="/main.do">
        <div class="input-group mb-3">
          <html:text property="number" styleClass="form-control"/>
          <html:submit styleClass="btn btn-info"/>
        </div>
        <div class="text-danger">
          <html:errors />
        </div>
      </html:form>
    </div>
  </div>
  <html:link href="/about.do">game rules</html:link>
</div>
</body>
</html:html>
