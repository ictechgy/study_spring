<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <!-- 위의 두줄은 CSS에 대한 import이다. -->
  
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <!-- 위의 두 줄은 JQuery에 대한 import인데 URI로 되어있다. 변경해도 된다. -->
  
  <script>
  $( function() {
    $( "#accordion" ).accordion();
  } );
  </script>
</head>
<body>
 
<div id="accordion">
  <h3>morning</h3>
  <div>
    <p>
    hello
    </p>
  </div>
  
  <h3>noon</h3>
  <div>
    <p>
    good afternoon
    </p>
  </div>
  
  <h3>night</h3>
  <div>
    <p>
    goodnight
    </p>
    <ul>
      <li>List item one</li>
      <li>List item two</li>
      <li>List item three</li>
    </ul>
  </div>
</div>
 
 
</body>
</html>