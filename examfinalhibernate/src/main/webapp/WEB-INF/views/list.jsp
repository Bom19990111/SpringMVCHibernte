<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@ page isELIgnored="false"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>javaguides.net</title>
<%@include file="include/link.jsp"%>
<body>
	<div class="container">
		<div class="col-md-offset-1 col-md-10">
			<h2>Quản lý khách hàng</h2>
			<hr />
			<div class="container-form">
				<a style="text-decoration: none;"
					href="/examfinalhibernate/showform">
					<button type="button" class="btn btn-outline-info">
						<i class="far fa-address-card"></i> Thêm khách hàng
					</button>
				</a>
				<form class="form-search">
					<div class="input-group input-group-md mb-3">
						<input type="search" id="form-2-input"
							class="search-field form-control" placeholder="Tìm kiếm"
							name="search" />
						<div class="input-group-append">
							<button type="submit" class="search-submit btn btn-outline-dark">
								<i class="fas fa-search"></i>
							</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		<br>
		<div class="panel panel-info">
			<div class="panel-body">
				<table class="table table-striped table-bordered">
					<tr>
						<th><a href="home?s=id">Mã khách hàng</a></th>
						<th><a href="home?s=name">Họ tên</a></th>
						<th>Giới tính</th>
						<th>Số điện thoại</th>
						<th>Loại khách hàng</th>
						<th></th>
					</tr>


					<!-- loop over and print our customers -->
					<c:forEach var="tempCustomer" items="${a.content}">
						<c:url var="deleteLink" value="/delete">
							<c:param name="customerId" value="${tempCustomer.id}" />
						</c:url>
						<c:url var="updateLink" value="/updateForm">
							<c:param name="customerId" value="${tempCustomer.id}" />
						</c:url>
						<tr>
							<td>${tempCustomer.id}</td>
							<td>${tempCustomer.fullName}</td>
							<td>${tempCustomer.sex}</td>
							<td>${tempCustomer.phone}</td>
							<td>${tempCustomer.type.name}
							<td><a style="text-decoration: none;" href="${updateLink}">
									<button type="button" class="btn btn-outline-primary">
										<i class="fas fa-edit"></i>
									</button>
							</a> <a style="text-decoration: none;" href="${deleteLink}"
								onclick="if (!(confirm('Bạn có muốn xóa khách hàng này không?'))) return false">
									<button type="button" class="btn btn-outline-danger">
										<i class="far fa-trash-alt"></i>
									</button>
							</a></td>
						</tr>
					</c:forEach>
				</table>
				<nav aria-label="Page navigation example">
					<ul class="pagination">
						<c:if test="${a.number - 1 == 0}">
							<li class="page-item disable"><a class="page-link"
								href="home?p=${a.number - 1}">Previous</a></li>
						</c:if>
						<c:if test="${a.number - 1 > 0}">
							<li class="page-item"><a class="page-link"
								href="home?p=${a.number - 1}">Previous</a></li>
						</c:if>
						<li class="page-item"><a class="page-link"
							href="home?p=${a.number}">${a.number + 1}/${a.totalPages}</a></li>
						<c:if test="${a.number + 1 > a.totalPages}">
							<li class="page-item disable"><a class="page-link"
								href="home?p=${a.number + 1}">Next</a></li>
						</c:if>
						<c:if test="${a.number + 1 < a.totalPages}">
							<li class="page-item"><a class="page-link"
								href="home?p=${a.number + 1}">Next</a></li>
						</c:if>
					</ul>
				</nav>
				<li class="page-item">Tổng số khách hàng : ${a.totalElements}
					sản phẩm</li>
			</div>
		</div>
	</div>
</body>
</html>
