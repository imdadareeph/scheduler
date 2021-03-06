
jQuery(document).ready(function() {
	
    /*
        Fullscreen background
        
    $.backstretch([
        "/dist/img/backgrounds/1.jpg"
      , "/dist/img/backgrounds/3.jpg"
      , "/dist/img/backgrounds/1.jpg"
     ], {duration: 3000, fade: 750});
    */
    
    $.backstretch([
        "/img/backgrounds/11.jpg"
      , "/img/backgrounds/22.jpg"
      , "/img/backgrounds/33.jpg"
      , "/img/backgrounds/44.jpg"
     ], {duration: 3000, fade: 750});
    
    /*
        Form validation
    */
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
    $('.login-form').on('submit', function(e) {
    	
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});
    	
    });
    
    
});
