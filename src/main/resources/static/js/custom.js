async function getListUser(){
	var html ='<table class="table table-striped"><thead><tr><th>ID</th><th>Name</th><th>Age</th></tr></thead><tbody>'
	var res = await axios.get('/api/return-list-object');
	var data = res.data;
//	if(data.length > 0){
//		for(var key in data[0]){
//			
//		}
//	}
	for(var user of data){
		console.log(user);
		html += '<tr> <td>'+user.id+'</td><td>'+user.name+'</td><td>'+user.age+'</td></tr>';
	}
	html += '</tbody></table>'
	$("#list-user").html(html);
}

//async function getListUser(){
//	var html =''
//	var res = await axios.get('/api/return-list-object');
//	var data = res.data;
//	for(var user of data){
//		console.log(user);
//		html += '<a href="#">'+user.name+'</a> <br/>'
//	}
//	$("#list-user").html(html);
//}

$(document).ready(function(){
	$("#btnLogin").click(async function(){
		var username = $("#username").val();
		var password = $("#password").val();
//		$.ajax({
//			url: "/api/check-login",
//			type: "POST",
//			data: {
//				username: username,
//				password: password
//			},
//			success: function(result) {
//				if(result === "ok"){
//					console.log("ok");
//					window.location = "/user-list";
//				} else {
//					console.log("error");
//				}
//			}
//		});
		
		
		var result = await axios.post('/api/check-login',{
			username: username,
			password: password
		});
		console.log(result);
		if(result.data === "ok"){
			console.log("ok");
			window.location = "/user-list";
		} else {
			console.log("error");
		}
	});
});
