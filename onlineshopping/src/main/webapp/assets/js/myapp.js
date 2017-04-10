$(function() {
	// solving active menu problem
	switch (menu) {
	case 'About us':
		$('#about').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
		
	case 'All Products':
		$('#listofproduct').addClass('active');
		break;
	default:
		$('#listofproduct').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
});