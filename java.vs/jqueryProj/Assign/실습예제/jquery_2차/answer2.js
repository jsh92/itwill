
function target01(){
	$("#target01").css("background", "blue");
}	


function target03(){
	$("#target03 span").clone().appendTo("#target03");
	//$("#target03").append($("#target03 span").clone());
}


function target05(){
	$(".target05 button").attr("disabled","disabled");
}


function target07(){
	$("#child").appendTo("#parent2");
}


function target09(){
	/*setTimeout(function(){
		$(".target09").css({"font-size":"15pt","font-family":"Castellar"});
	}, 2000);*/

	setTimeout(function(){
		$(".target09 *").css({"font-size":"15pt","font-family":"Castellar"});
	}, 2000);
}


function target11(){
	//$("#target11 h2").siblings().remove();
	//$("#target11").find(":not(:contains(h2))").remove();
	$("#target11").find(":not(h2)").remove();
}

function target13(){
	var count=parseInt($("#target13 input[name=countview]").val());
	setInterval(function(){
		$("#target13 input[name=countview]").val(++count);
	}, 1000);
}

