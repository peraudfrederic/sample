$(function() {

	$(".publish").click(function(){
		var tab = [];

		$("[contenteditable]").each(function(){
			tab.push( $(this).html() );
		});
		
		alert(tab);
		
		var params = JSON.stringify(tab) ;
		
		alert(params);

		$.ajax({
			//url: 'traitement.php',
			url: 'http://localhost:8080/TP-CMS/services/rest/DB/content',
			method: 'POST',
			//contentType : 'application/json; charset=utf-8',
			//dataType: 'json',
			dataType: "text",
			data: {
				donnees: params
				//donnees: tab
			},
			success: function(msg) {
				$(".alert").fadeIn();
				$(".successMsg").text('OK ' + msg);
			},
			error: function(msg) {
				$(".alert").fadeIn();
				$(".successMsg").text('KO ' + msg);
			}

		});
	});


	$(".alert .icon-times-circle").click(function(){
		$(".alert").fadeOut();
	});


	$(".icon-navicon").click(function(){
		$("nav").fadeToggle();
	});

});