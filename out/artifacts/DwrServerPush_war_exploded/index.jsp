<%--
  Created by User: huaronghao
  Date: 17/2/12
  Time: 12:32
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns=" http://www.w3.org/1999/xhtml">
<head>
  <script type='text/javascript' src='/dwr/engine.js'></script>
  <script type='text/javascript' src='/dwr/util.js'></script>
  <script type='text/javascript' src='/dwr/interface/SendPushService.js'></script>
  <script type="text/javascript">
      function hello(){
          SendPushService.send("第一个dwr推程序");
      }
      /**由dwr在后台调用这个方法**/
      function dwrTest(data){
          alert(data);
      }
  </script>
  <title>第一个dwr推程序</title>
</head>
<body onload="dwr.engine.setActiveReverseAjax(true);">
<input type="button" value="点击我" onclick="hello();" />
</body>
</html>
