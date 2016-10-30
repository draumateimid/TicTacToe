
/*
$(document).ready(function() {
            var field1 = document.getElementById("res1");;
            form.submit(function ( event ) {
                $.ajax({
                    type: form.attr('method'),
                    url: form.attr('action'),
                    data: '1'
                }).done(function(movePlayer) {
                    $('#res1').html(movePlayer).attr('class', 'alert alert-success');
                }).fail(function() {
                    $('#res1').html('Something went wrong...sorry try again.').attr('class', 'alert alert-danger');
                });
                event.preventDefault();
            });
        });
*/

var div1 = document.getElementById("res1");
var p1 = document.getElementById("1")
div1.style.display="none";
p1.style.display = "inline";
function myFunction1(){
	$.ajax({
		type: form.attr('method'),
		url: form.attr('action'),
		data: '1'
	}).done(function(movePlayer) {
		$('#res1').html(movePlayer).attr('class', 'alert alert-success');
	}).fail(function() {
		$('#res1').html('Something went wrong...sorry try again.').attr('class', 'alert alert-danger');
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
	div2.style.display="inline";
	p2.style.display="none";
	return false;
	}

var div3 = document.getElementById("res3");
var p3 = document.getElementById("3")
div3.style.display="none";
p3.style.display = "inline";
function myFunction3(){
	div3.style.display="inline";
	p3.style.display="none";
	return false;
	}

var div4 = document.getElementById("res4");
var p4 = document.getElementById("4")
div4.style.display="none";
p4.style.display = "inline";
function myFunction4(){
	div4.style.display="inline";
	p4.style.display="none";
	return false;
	}

var div5 = document.getElementById("res5");
var p5 = document.getElementById("5")
div5.style.display="none";
p5.style.display = "inline";
function myFunction5(){
	div5.style.display="inline";
	p5.style.display="none";
	return false;
	}

var div6 = document.getElementById("res6");
var p6 = document.getElementById("6")
div6.style.display="none";
p6.style.display = "inline";
function myFunction6(){
	div6.style.display="inline";
	p6.style.display="none";
	return false;
	}

var div7 = document.getElementById("res7");
var p7 = document.getElementById("7")
div7.style.display="none";
p7.style.display = "inline";
function myFunction7(){
	div7.style.display="inline";
	p7.style.display="none";
	return false;
	}

var div8 = document.getElementById("res8");
var p8 = document.getElementById("8")
div8.style.display="none";
p8.style.display = "inline";
function myFunction8(){
	div8.style.display="inline";
	p8.style.display="none";
	return false;
	}

var div9 = document.getElementById("res9");
var p9 = document.getElementById("9")
div9.style.display="none";
p9.style.display = "inline";
function myFunction9(){
	div9.style.display="inline";
	p9.style.display="none";
	return false;
}

			
