
var div1 = document.getElementById("res1");
var p1 = document.getElementById("1")
div1.style.display="none";
p1.style.display = "inline";

function myFunction1(){
	$.post("/tictactoe", 
			{name:'1'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
				$('#field1').html(returnValue).attr('class', ' ');
			}).fail(function() {
			$('#field1').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div1.style.display="inline";
	p1.style.display="none";
	return false;
	}
	
var div2 = document.getElementById("res2");
var p2 = document.getElementById("2")
div2.style.display="none";
p2.style.display = "inline";
function myFunction2(){
	$.post("/tictactoe", 
			{name:'2'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field2').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field2').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div2.style.display="inline";
	p2.style.display="none";
	return false;
	}

var div3 = document.getElementById("res3");
var p3 = document.getElementById("3")
div3.style.display="none";
p3.style.display = "inline";
function myFunction3(){
	$.post("/tictactoe", 
			{name:'3'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field3').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field3').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div3.style.display="inline";
	p3.style.display="none";
	return false;
	}
	
var div4 = document.getElementById("res4");
var p4 = document.getElementById("4")
div4.style.display="none";
p4.style.display = "inline";
function myFunction4(){
	$.post("/tictactoe", 
			{name:'4'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field4').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field4').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div4.style.display="inline";
	p4.style.display="none";
	return false;
	}	

var div5 = document.getElementById("res5");
var p5 = document.getElementById("5")
div5.style.display="none";
p5.style.display = "inline";
function myFunction5(){
	$.post("/tictactoe", 
			{name:'5'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field5').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field5').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div5.style.display="inline";
	p5.style.display="none";
	return false;
	}	

var div6 = document.getElementById("res6");
var p6 = document.getElementById("6")
div6.style.display="none";
p6.style.display = "inline";	
function myFunction6(){
	$.post("/tictactoe", 
			{name:'6'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field6').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field6').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div6.style.display="inline";
	p6.style.display="none";
	return false;
	}

var div7 = document.getElementById("res7");
var p7 = document.getElementById("7")
div7.style.display="none";
p7.style.display = "inline";	
function myFunction7(){
	$.post("/tictactoe", 
			{name:'7'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field7').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field7').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div7.style.display="inline";
	p7.style.display="none";
	return false;
	}	

var div8 = document.getElementById("res8");
var p8 = document.getElementById("8")
div8.style.display="none";
p8.style.display = "inline";
function myFunction8(){
	$.post("/tictactoe", 
			{name:'8'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field8').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field8').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div8.style.display="inline";
	p8.style.display="none";
	return false;
	}	

var div9 = document.getElementById("res9");
var p9 = document.getElementById("9")
div9.style.display="none";
p9.style.display = "inline";
function myFunction9(){
	$.post("/tictactoe", 
			{name:'9'}).done(function(returnValue){
				if(returnValue.localeCompare("winnerX") == 0) {
					 window.location.href = "/winnerX.html";
				}
				else if(returnValue.localeCompare("winnerO") == 0){
					window.location.href = "/winnerO.html";
				}
				else if(returnValue.localeCompare("draw") == 0){
					window.location.href = "/draw.html";
				}
			$('#field9').html(returnValue).attr('class', ' ');
		}).fail(function() {
			$('#field9').html('Sorry!').attr('class', 'alert alert-danger');
		});
		event.preventDefault();
	div9.style.display="inline";
	p9.style.display="none";
	return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
