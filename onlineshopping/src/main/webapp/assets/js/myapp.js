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
		if(menu == 'Home') break;
		$('#listofproduct').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
	
	
	
	//Code for Jquery Data Table
	
	//Create DataSet
	var Products = [
	                ['1', 'ABC'],
	                ['2', 'DEF'],
	                ['3', 'GHI'],
	                ['4', 'JKL'],
	                ['5', 'MNO'],
	                ['6', 'PQR'],
	                ['7', 'STU'],
	                ['8', 'VXW']
	              ];
	var $table = $('#productListTable');
	//execute the below code only where we have this table 
	if($table.length) {
		//console.log('inside the Table!');
		
		$table.DataTable( {
			lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'All Records']],
			data: Products
		}
				);
	}
});

