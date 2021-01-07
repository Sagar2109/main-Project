
function validateForm() {
  
	 if (document.forms["custer"]["customername"].value == "") 
	  {
	    alert("Name must be filled out !!!");
	    document.forms["custer"]["customername"].focus();
	    return false;
	  }
	
  if(document.forms["custer"]["mobileno"].value==""){
	  alert("add mobile no");
	  document.forms["custer"]["mobileno"].focus();
	  return false;
  }
	 
  if (document.forms["custer"]["email"].value == "")
	 {
	    alert("Email must be filled out !!!");
	    document.forms["custer"]["email"].focus();
	    return false;
	  }
  if (document.forms["custer"]["movienm"].value == "") {
	    alert("Name must be filled out !!!");
	    document.forms["custer"]["mobvienm"].focus();
	    return false;
	  }
}
