<div class="container">
	<div class="row">
		<!--  Whould be dispaly side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!--  whould be dispaly the product -->
		<div class="col-md-9">
			<!--  Added BreadCrum Component -->
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userclickAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>

						</ol>
					</c:if>
					
					
					<c:if test="${userclickCategoryProducts == true}">
					<script>
						window.categoryId = '${category.id}';
					</script>
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>
					
					
					<c:if test="${userclickProduct == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">category</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>
				</div>
			</div>
			
			
			<div class="row" >
				<div class="col-xs-12">
				
					<table id="productListTable" class="table table-striped table-borderd">
						<thead>
							<tr>
								<th>ID</th>
								<th>Name</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
	</div>


</div>