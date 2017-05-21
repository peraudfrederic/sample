$(function() {

	$(".publish").click(function(){
		var tab = [];

		$("[contenteditable]").each(function(){
			tab.push( $(this).html() );
		});

		$.ajax({
			url: 'traitement.php',
			method: 'POST',
			data: {
				donnees: tab
			},
			success: function(msg) {
				$(".alert").fadeIn();
				$(".successMsg").text(msg);
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