<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<title>测试</title>
<script type="text/javascript">
 function sendMsg(){
	 var t = $("#type").val();
	 //alert(t);
	 $.post('/producer/rabbit/setMessage',{msg:'hello world '+t+' rabbit!',type:t}, function(result){
		 if(result.success){
			 alert("发送成功");
		 }else{
			 alert("发送失败");
		 }
	 },'json');
 }
</script>
</head>
<body>
<h1>发送消息</h1><hr>
<select id="type" > 
<option selected="selected" value="red">red</option>
<option value="blue">blue</option>

</select>
<button id="send" onclick="sendMsg()" value="发送消息" type="button" title="send">发送</button>
</body>
</html>
