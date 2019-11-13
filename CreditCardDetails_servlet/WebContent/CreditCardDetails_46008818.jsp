<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="palin/html; charset=ISO-8859-1">
<title>Credit Card Details</title>
</head>
<body>
	<form action="CreditCardController" method="post">
	<center>
		<table>
			<tr>
				<td>CC No.:</td>
				<td><input type="text" name="cc_no" maxlength=16 /></td>
			</tr>

			<tr>
				<td>CVV NO.:</td>
				<td><input type="text" name="cvv_no" maxlength=3 /></td>
			</tr>
			<tr>
				<td>BankName:</td>
				<td><input type="text" name="bank_name" /></td>
			</tr>
			<tr>
				<td>AccountNo.:</td>
				<td><input type="text" name="account_no" maxlength=13 /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Cancel"></td>
			</tr>
		</table>
	</center>
	</form>
	<p>${param.errorMsg.value}</p>
</body>
</html>