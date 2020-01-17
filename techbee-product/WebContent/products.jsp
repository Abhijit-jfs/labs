<%@ page language="java"%>
<%@ page import="com.techbee.model.Product"%>
<%@ page import="com.techbee.repository.ProductRepository"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Products</title>
	<link rel="stylesheet" href="css/plugins.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="site-wrapper mb-4" id="top">
		<div class="site-header d-lg-block">
			<div class="header-middle pt--10 pb--10">
				<div class="container">
					<div class="row align-items-center">
						<div class="col-lg-6">
							<a href="index.html" class="site-brand">
								<img src="img/logo.png" alt="">
							</a>
						</div>
						<div class="col-lg-6">
							<div class="main-navigation flex-lg-right"></div>
								<ul class="main-menu menu-right ">
									
									<li class="menu-item">
										<a href="contact.html">Login</a>
                                    </li>
                                    <li class="menu-item">
										<a href="contact.html">Register</a>
									</li>
									<li class="menu-item">
										<a href="contact.html">Home</a>
									</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<main class="inner-page-sec-padding-bottom">
			<div class="container">
				<div class="shop-product-wrap grid with-pagination row space-db--30 shop-border">
				<%
					List<Product> products = ProductRepository.getProducts();
					for (Product product : products) {
				%>
					<div class="col-lg-4 col-sm-6">
						<div class="product-card">
							<div class="product-grid-content">
								<div class="product-header">
									<h3><a><%= product.getProductName() %></a></h3>
								</div>
								<div class="product-card--body">
									<div class="card-image">
										<img src="img/<%= product.getProductId() %>.jpg" width=200px alt="">
									</div>
									<div class="price-block">
										<span class="price">&#8377;<%= product.getProductPrice() %></span>
									</div>
									<a href="checkout.jsp?productId=<%= product.getProductId() %>" class="btn btn-primary btn-sm" role="button" aria-disabled="true">Buy</a>
								</div>
							</div>
						</div>
					</div>
				<%
					}
				%>
				</div>
			</div>
		</main>
	</div>
	<footer class="site-footer">
		<div class="footer-bottom">
			<div class="container">
				<p class="copyright-text">
					Design By Shriya, Abhijit, Alfred & Chitta
				</p>
			</div>
		</div>
	</footer>
</body>
</html>