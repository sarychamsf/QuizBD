<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Taller Web</title>
<!--
Ocean Theme
http://www.templatemo.com/tm-484-ocean
-->

    <!-- load stylesheets -->
    
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400"><!-- Google web font "Open Sans", https://www.google.com/fonts/specimen/Open+Sans -->
    <link rel="stylesheet" href="font-awesome-4.5.0/css/font-awesome.min.css"> <!-- Font Awesome, https://fortawesome.github.io/Font-Awesome/ -->
    <link rel="stylesheet" href="css/bootstrap.min.css">                       <!-- Bootstrap style, http://v4-alpha.getbootstrap.com/ -->
    <link rel="stylesheet" href="css/templatemo-style.css">                    <!-- Templatemo style -->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
          <![endif]-->
</head>

    <body>

        <div class="container-fluid">
            
            <div class="row"> 

                <section class="tm-section-intro">
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                        <div class="tm-wrapper-center">
                            <h1 class="tm-section-intro-title">Bienvenido</h1>
                            <a href="/Esquema?action=listEsquema" class="tm-btn-white-big">Continuar</a>
                        </div>            
                    </div>
                </section>    

            </div>

            <div class="row tm-section">
                
                <section class="tm-section-contact">
                    
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12 text-xs-center">
                        
                        <h2 class="tm-section-title">Keep in touch</h2>
                        <p class="tm-section-subtitle">Phasellus lacinia feugiat accumsan. Nulla tempor vel est sit amet tincidunt. Nullam eget lectus ut felis aliquam.</p>

                    </div>

                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-7 col-xl-7">
                        <form action="index.html" method="post" class="tm-contact-form">                                
                            <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 tm-form-group-left">
                                <input type="text" id="contact_name" name="contact_name" class="form-control" placeholder="Name"  required/>
                            </div>
                            <div class="form-group col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xl-6 tm-form-group-right">
                                <input type="email" id="contact_email" name="contact_email" class="form-control" placeholder="Email"  required/>
                            </div>
                            <div class="form-group">
                                <input type="text" id="contact_subject" name="contact_subject" class="form-control" placeholder="Subject"  required/>
                            </div>
                            <div class="form-group">
                                <textarea id="contact_message" name="contact_message" class="form-control" rows="6" placeholder="Message" required></textarea>
                            </div>
                        
                            <button type="submit" class="btn tm-bordered-btn pull-xs-right">Submit</button>                          
                        </form>   
                    </div> <!-- col -->
                    
                    <div class="col-xs-12 col-sm-12 col-md-12 col-lg-5 col-xl-5 tm-contact-right">
                        <h3 class="tm-contact-title">Our Address</h3>
                        <p class="tm-contact-info">120-240 aliquam augue libero, convallis in vulputate vel, sodales sed purus, 10880<br>
                            San Francisco, CA, USA
                        </p>
                        <p class="tm-contact-info"> 
                            Email: <a href="mailto:info@company.com">info@company.com</a><br>
                            
                        </p>
                        <p class="tm-contact-info">
                            Phone: <a href="tel:0100100110">010-010-0110</a>
                        </p>
                        <div class="tm-social-icons-container">
                            <a href="#" class="tm-social-icon-link"><i class="fa fa-facebook tm-social-icon"></i></a>
                            <a href="#" class="tm-social-icon-link"><i class="fa fa-google-plus tm-social-icon"></i></a>
                            <a href="#" class="tm-social-icon-link"><i class="fa fa-twitter tm-social-icon"></i></a>
                            <a href="#" class="tm-social-icon-link"><i class="fa fa-behance tm-social-icon"></i></a>
                            <a href="#" class="tm-social-icon-link"><i class="fa fa-linkedin tm-social-icon"></i></a>
                        </div>
                    </div>

                </section>

            </div>

            <div class="row">                
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">                    
                    <hr>
                </div>
            </div>

            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
                    <p class="text-xs-center tm-copyright-text">Copyright &copy; 2016 Your Company</p>
                </div>
            </div>
            
        </div> <!-- container-fluid -->   

        <!-- load JS files -->
        <script src="js/jquery-1.11.3.min.js"></script>             <!-- jQuery, https://jquery.com/download/ -->
        <script src="https://www.atlasestateagents.co.uk/javascript/tether.min.js"></script> <!-- Tether for Bootstrap, http://stackoverflow.com/questions/34567939/how-to-fix-the-error-error-bootstrap-tooltips-require-tether-http-github-h -->
        <script src="js/bootstrap.min.js"></script>                 <!-- Bootstrap, http://v4-alpha.getbootstrap.com/ -->
        <script src="js/jquery.touchSwipe.min.js"></script>         <!-- http://labs.rampinteractive.co.uk/touchSwipe/demos/ -->
        
        <script>     
       
            $(document).ready(function(){

                /* Smooth Scrolling
                 * https://css-tricks.com/snippets/jquery/smooth-scrolling/
                --------------------------------------------------------------*/
                $('a[href*="#"]:not([href="#"])').click(function() {
                    if (location.pathname.replace(/^\//,'') == this.pathname.replace(/^\//,'') 
                        && location.hostname == this.hostname) {
                        
                        var target = $(this.hash);
                        target = target.length ? target : $('[name=' + this.hash.slice(1) +']');
                        
                        if (target.length) {
                            
                            $('html, body').animate({
                                scrollTop: target.offset().top
                            }, 1000);
                            return false;
                        }
                    }
                }); 
                
                /* Enable swiping for tablets and mobile
                 * http://lazcreative.com/blog/adding-swipe-support-to-bootstrap-carousel-3-0/
                 ---------------------------------------------------------------------------------*/
                if($(window).width() <= 991) {
                    $(".carousel-inner").swipe( {
                        //Generic swipe handler for all directions
                        swipeLeft:function(event, direction, distance, duration, fingerCount) {
                            $(this).parent().carousel('next'); 
                        },
                        swipeRight: function() {
                            $(this).parent().carousel('prev'); 
                        },
                        //Default is 75px, set to 0 for demo so any distance triggers swipe
                        threshold:0
                    });
                }  

                /* Handle window resize */
                $(window).resize(function(){
                    if($(window).width() <= 991) {
                        $(".carousel-inner").swipe( {
                            //Generic swipe handler for all directions
                            swipeLeft:function(event, direction, distance, duration, fingerCount) {
                                $(this).parent().carousel('next'); 
                            },
                            swipeRight: function() {
                                $(this).parent().carousel('prev'); 
                            },
                            //Default is 75px, set to 0 for demo so any distance triggers swipe
                            threshold:0
                        });
                     }
                });              
                           
            });

        </script>             

</body>
</html>