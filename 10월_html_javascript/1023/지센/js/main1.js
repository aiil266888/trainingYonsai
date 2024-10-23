$(function () {
    /* *************화면의 사이즈를 조절하면 */
    $(window).resize(function(){
        //현재 넓이를 W에 저장
        var w = $(this).width();
        if(w<850){
        }else{
            //mobile_active를 다 삭제 
            if($('.mobile_nav').hasClass('active')==true){
                $('.mobile_nav').removeClass('active');
                $('.transparency').removeClass('active');
                $('.mobile_nav .sub').css('display','none');
            }
        }
        
    })

    $('.nav>ul').mouseenter(function () {
        $(this).addClass('over');
    });
    $('.nav>ul').mouseleave(function () {
        $(this).removeClass('over');
    });
    $('.mobile_tab').click(function(){
        $('.mobile_nav').addClass('active');
        $('.transparency').addClass('active');
        return false;
    });

    $('.close').click(function(){
        $('.mobile_nav').removeClass('active');
        $('.transparency').removeClass('active');
        $('.mobile_nav .sub').css('display','none');
        return false;
    });

    $('.mobile_nav>ul>li>a').click(function(){
        if($(this).next('.sub').css('display')=='none'){
            $('.mobile_nav .sub').slideUp(300);
            $(this).next('.sub').slideDown(300);
        }else{
            $(this).next('.sub').slideUp(300);
        }

        // var abc = $(this).next('.sub').css('display');
        // if(abc == 'none'){
        //     $('.sub').slideUp();//모든 .sub를 닫고
        //     $(this).next('.sub').slideDown();
        // }else{
        //     $(this).next('.sub').slideUp();
        // }
        return false;
    });


});