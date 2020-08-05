var user14=localStorage.getItem("user14");
if(!user14){
	$("#m-login").html("<a href='login.html'>登陆</a>")
}else{
	var n1=JSON.parse(user14).name;
	$("#m-login").html("当前用户：<font color='red'>"+n1+"</font><a href='#' id='logout'>退出</a>")
	
}

$(function(){
	$("#logout").click(function(){
		if(window.confirm("确定退出吗")){
			localStorage.clear();
			location.reload();
		}
	})
})
