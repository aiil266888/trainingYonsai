$(function(){


    var bx = $('.main_slide').bxSlider({
        auto:true,
        controls:true,
        pager:false,
        mode:'fade',
        pause:8000,
        onSlideBefore:function(){},
        onSlideAfter:function(oldIndex,newIndex){
            console.log(newIndex);
            if(newIndex==0){
                setTimeout(function(){
                $(".slide1_text1").removeClass("active");
                $(".slide1_span").removeClass("active");
                },0);
                setTimeout(function(){
                $(".slide0_round_text").addClass("active");
                $(".slide0_span").addClass("active");
                $(".slide0_text").addClass("active");
                },0);
            }
            if(newIndex==1){
                setTimeout(function(){
                $(".slide0_text").removeClass("active");
                $(".slide0_span").removeClass("active");
                $(".slide0_round_text").removeClass("active");
                },0);
                
                setTimeout(function(){
                $(".slide1_text1").addClass("active");
                $(".slide1_span").addClass("active");
                },0);
                
            }
        }
    });
});