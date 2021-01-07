/**
 * 
 */

//<script type = "text/javascript">
function validateForm() {
	a = Number(document.forms["custer"]["price"].value);
	b = Number(document.forms["custer"]["totalticktes"].value);
	c = a * b;
	console.log(c);
	document.forms["custer"]["totalprize"].value = c;
	

	
	if (document.forms["custer"]["customername"].value == "") 
	  {
	    alert("Name must be filled out !!!");
	    document.forms["custer"]["customername"].focus();
	    return false;
	  }
	 console.log("hello")
	
  if(document.forms["custer"]["mobileno"].value=="" || document.forms["custer"]["mobileno"].value.length>10 || document.forms["custer"]["mobileno"].value.length<10){
	  alert("Mobile Number Is invaild!!!");
	  document.forms["custer"]["mobileno"].focus();
	  return false;
  }
	 var z = document.forms["custer"]["mobileno"].value;
	    if(!z.match(/^\d+/))
	        {
	        alert("Please only enter numeric for MObile (Allowed input:0-9)")
	        document.forms["custer"]["mobileno"].focus();
	        z=" ";
	        return false;
	        }
	 
  if (document.forms["custer"]["email"].value == "")
	 {
	    alert("Email must be filled out !!!");
	    document.forms["custer"]["email"].focus();
	    return false;
	  }
 
 
	 if (document.forms["custer"]["movienm"].value == "") {
		    alert("MovieName must be filled out !!!");
		    document.forms["custer"]["movienm"].focus();
		    return false;
		  }
	if (document.forms["custer"]["price"].value == 0 || document.forms["custer"]["totalticktes"].value == 0) {
		alert("Ticktes or Price is Invalid !");
		document.forms["custer"]["totalticktes"].focus();
		return false;
		
	}
	 var mailformat = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
		if (custer.email.value.match(mailformat)) {
			return true;
			
		} else {
			alert("You have entered an invalid email address!");
			document.forms["custer"]["email"].focus();
			return false;
				}
		
}
//</script>	