<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>Register</title>
        <style type="text/css">
            
            .button-register {background-color: green;color: white;}
            .button-report {background-color: #000000;color: white;margin-left: 30%;}
        </style>
         <script src="./js/jquery-1.11.1.min.js"></script> 
    </head>
    <script>  
function validateform(){  
var name=document.myform.userName.value;  
var password=document.myform.password.value; 
var x=document.myform.email.value;  

var atposition=x.indexOf("@");  
var dotposition=x.lastIndexOf(".");  
if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
  alert("Please enter a valid e-mail address");  
  return false;  
  }  
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
</script>  
    <body>
        <h2>Simple CURD Using STRUTS2 FRAMEWORK</h2>
        <a href="report"><button class="button-report" type="button">Report</button></a>
        <a href="product.jsp"><button class="button-report" type="button">Product</button></a>
        <s:form name="myform" action="registeruser.action" method="post" onsubmit="return validateform()" >
            <s:textfield label="User Name" name="userName" />
            <s:textfield label="First Name" name="firstName" />
            <s:textfield label="Last Name" name="lastName" />
            <s:password label="Password" name="password" />
            <s:textfield label="Email" name="email" />
            <s:textfield label="Phone Number" name="phoneNumber" />
            <s:submit cssClass="button-register" value="Resgister" />
        </s:form>
        <s:if test="ctr>0">
            <span style="color: green;"><s:property value="msg" /></span>
        </s:if>
        <s:else>
            <span style="color: red;"><s:property value="msg" /></span>
        </s:else>
    </body>
</html>