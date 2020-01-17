<%@ page language="java"%>
<%@ page import="com.techbee.model.Product"%>
<%@ page import="com.techbee.repository.ProductRepository"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Checkout</title>
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
		
		
		<%
			Product product = ProductRepository.getProduct(request.getParameter("productId"));
		%>
		<main class="inner-page-sec-padding-bottom">
			<div class="container checkout-container">
				<div class="card card-body bg-light">
					<h1>Checkout</h1>
					<h5><%= product.getProductName() %></h5>
					<p><em><%= product.getProductDescription() %></em></p>
					<form action="checkoutServlet" method="post">
						<div class="row">
							<div class="col-3 text-right">
								<p>Quantity:</p>
							</div>
							<div class="col-9">
								<select class="w-100" name="PRODUCT_QUANTITY">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</div>
						</div>
						<div class="row">
							<div class="col-3 text-right">
								<p>Gift Wrap:</p>
							</div>
							<div class="col-9">
								<input type="radio" name="GIFT_WRAP" value="True"> Yes
                    			<input type="radio" name="GIFT_WRAP" value="False"> No
							</div>
						</div>
						<div class="row">
							<div class="col-3 text-right">
								<p>Delivery Instructions:</p>
							</div>
							<div class="col-9">
								<textarea name="DELIVERY_INSTRUCTIONS" class="w-100" placeholder=""></textarea>
							</div>
						</div>
						<div class="row">
							<div class="col-3 text-right">
								<p>Delivery type:</p>
							</div>
							<div class="col-9">
								<select class="w-100" name="DELIVERY_DATE">
									<option value="1">Express Delivery (1 day)</option>
									<option value="2">Fast Delivery (2 days)</option>
									<option value="3">Normal Delivery (3 days)</option>
								</select>
							</div>
						</div>
						<div class="row">
							<div class="col-3 text-right">
								<p>Coupon Code:</p>
							</div>
							<div class="col-9">
								<input name="COUPON_CODE" type="text" class="w-100" placeholder=""></input>
							</div>
						</div>
						<input type="hidden" name="PRODUCT_ID" value="<%= product.getProductId() %>"/>
						<div class="row">
							<div class="col-12 text-center">
								<input type="submit" class="btn btn-primary" value="Submit" />
							</div>
						</div>
					</form>
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