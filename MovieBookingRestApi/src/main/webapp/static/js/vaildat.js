//<script type = "text/javascript">
function validateForm() {
   var validateStatus = true;
		

	var name = document.forms["custer"]["customername"].value;
	var email = document.forms["custer"]["email"].value;
	var mobile = document.forms["custer"]["mobileno"].value;

	if (name == "") {
		alert("Name must be filled out !!!");
		name.focus();
		validateStatus = false;
		return false;
	}

	if (email == "") {
		alert("You have entered an invalid email address!");
		email.focus();
		validateStatus = false;
		return false;
	}

	if (mobile == "" || mobile.length > 10 || mobile.length < 10) {
		alert("You have entered an invalid Mobile Number!");
		mobile.focus();
		validateStatus = false;
	//return false;
	}

	if (document.forms["custer"]["movienm"].value == "") {
		alert("Please Enter Movie Name !");
		document.forms["custer"]["movienm"].focus();
		validateStatus = false;
	//return false;
	}

	if (document.forms["custer"]["price"].value == "" || document.forms["custer"]["totalticktes"].value == "") {
		alert("Ticktes or Price is Invalid !");
		document.forms["custer"]["totalticktes"].focus();
		//return false;
		validateStatus = false;
	}

	var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	if (custer.email.value.match(mailformat)) {
		//return true;
		validateStatus = false;
	} else {
		alert("You have entered an invalid email address!");
		document.forms["custer"]["email"].focus();
		//return false;
		validateStatus = false;

	}
	return validateStatus;
}

//</script>