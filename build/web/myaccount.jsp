<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
<title>Book Store</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<div id="wrap">

        <jsp:include page="header.jsp"/>
       
       
       <div class="center_content">
       	<div class="left_content">
            <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>My Account</div>
        
        	<div class="feat_prod_box_details">
            <p class="details">
             You can login into your account by using your email address and password. 
            </p>
            
              	<div class="contact_form">
                <div class="form_subtitle">Login into your account</div>
                 <form name="register" action="controller" method="post">          
                    <div class="form_row">
                    <label class="contact"><strong>Username:</strong></label>
                   
                    <input type="text" class="contact_input" name="name" />
                    </div>  


                    <div class="form_row">
                    <label class="contact"><strong>Password:</strong></label>
                    <input type="text" class="contact_input" name="pass" />
                    </div>                     

                    <div class="form_row">
                        <div class="terms">
                        <input type="checkbox" name="terms" />
                        Remember me
                        </div>
                    </div> 

                    
                    <div class="form_row">
                    <input type="submit" class="register" value="login" />
                    </div>   
                    
                  </form>     
                    
                </div>  
            
            </div>	
            
              

            

            
        <div class="clear"></div>
        </div><!--end of left content-->
        
        <jsp:include page="divRight.jsp"/>
        
        
       
       
       <div class="clear"></div>
       </div><!--end of center content-->
       
              
       <jsp:include page="footer.jsp"/>
    

</div>

</body>
</html>

