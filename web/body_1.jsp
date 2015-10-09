<%-- 
    Document   : Body
    Created on : Jun 22, 2015, 9:01:01 PM
    Author     : POOJA YADAV
--%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


                             <!DOCTYPE html>
	<html>
	<head>
	    <title>Slideshow</title>
	</head>
	<style type="text/css">
	    * { margin:0; padding:0;}
	    #slide { width:1300px; overflow: hidden; height: 500px; margin: 0px auto; box-shadow: 0 0 8px #000;position: relative;}
	    #slide img {position: absolute;z-index: 1; display: none; left: 0;}
	    #slide p {z-index:2;position: absolute; bottom: 0; left: 0; width: 100%; padding: 0px; font-family: Arial; font-size: 14px; background: rgba(0,0,0,0.7);  color: #fff;}
	</style>
	<!--[if lt IE 9]>
	    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	<![endif]-->
	<body>
            
	    <figure id="slide">
                <img src="images/image1.jpg" alt="Image 1" width="100%" height="100%">
                <img src="images/image2.jpg" alt="Image 2" width="100%" height="100%">
                     <img src="images/image3.jpg" alt="Image 5"  width="100%" height="100%">
                      <img src="images/image4.jpg" alt="Image 4"  width="100%" height="100%">
	        <img src="images/image5.jpg" alt="Image 3"  width="100%" height="100%">
                <img src="image/image6.jpg" alt="Image 6"  width="100%" height="100%">
	    </figure>
	 
	    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
	    <script type="text/javascript">
	        $(document).ready(function(){
	            $("#slide img:eq(0)").addClass("active").show();
	 
	            var text = $(".active").attr("alt");
	            <%--$("#slide").prepend("<p>"+text+"</p>");--%>
	 
	            setInterval(slide,3000);
	 
	            function slide(){
	                if($(".active").next().size()){
	                    $(".active").fadeOut().removeClass("active").next().fadeIn().addClass("active");
	                }else{
	                    $(".active").fadeOut().removeClass("active");
	                    $("#slide img:eq(0)").fadeIn().addClass("active");
	                }
	 
	                var text = $(".active").attr("alt");
	                $("#slide p").hide().html(text).delay(500).fadeIn();
	            }
	        });
	    </script>
           
	</body>
	</html>
