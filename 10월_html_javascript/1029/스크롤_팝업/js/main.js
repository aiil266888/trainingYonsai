$(function(){

    var dTop = $('#floatdiv').offset().top;
    // var dTop = 250;
    //alert(dTop);
    $(window).scroll(function(){
       var sct = $(window).scrollTop();
       $('#sTop').text(sct);
       if(sct >= 100){
        $('nav').addClass('fixed');
       }else{
        $('nav').removeClass('fixed');
       }

       $('#floatdiv').stop().animate({top:dTop+sct},500);

       //for문으로 만들기
       for(var x = 0; x<6; x++){
            if(sct >= $('section>div').eq(x).offset().top){
                $('nav ul li').removeClass('on');
                $('nav ul li').eq(x).addClass('on');
                $('#floatdiv ul li').removeClass('on');
                $('#floatdiv ul li').eq(x).addClass('on');
        }
       }


    //    if(sct >= $('section>div').eq(0).offset().top){
    //     $('nav ul li').removeClass('on');
    //     $('nav ul li').eq(0).addClass('on');
    //     $('#floatdiv ul li').removeClass('on');
    //     $('#floatdiv ul li').eq(0).addClass('on');
    //     }
    //    if(sct >= $('section>div').eq(0).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(0).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(0).addClass('on');
    //    }
    //    if(sct >= $('section>div').eq(1).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(1).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(1).addClass('on');
            
    //     }
    //     if(sct >= $('section>div').eq(2).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(2).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(2).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(3).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(3).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(3).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(4).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(4).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(4).addClass('on');
    //     }
    //     if(sct >= $('section>div').eq(5).offset().top){
    //         $('nav ul li').removeClass('on');
    //         $('nav ul li').eq(5).addClass('on');
    //         $('#floatdiv ul li').removeClass('on');
    //         $('#floatdiv ul li').eq(5).addClass('on');
    //     }


    });

    $('nav ul li').click(function(){
        var i = $(this).index();
       // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
        //alert(offset_nav);
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        //스크롤을 offset_nav만큼움직인다.
       // $('nav ul li').removeClass('on');
        //$('nav ul li').eq(i).addClass('on');
        return false;
    });

    $('#floatdiv ul li').click(function(){
        var i = $(this).index();
       // alert(i);
        var offset_nav = $('section>div').eq(i).offset().top;
       
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        return false;
    });

    // $('section > div').mousewheel(function(event,d){
    //     //event 마우스휠의 정보
    //     //d 는 이동방향 
    //     //마우스 휠을 위로 스크롤하면 양수(+1) / 아래음수(-1)
    //    // console.log(d);
    //     if(d > 0){ //휠 위로
    //         var prev = $(this).prev().offset().top;
    //         $('html,body').stop().animate({scrollTop:prev},1000,'easeOutBounce');
    //     }
    //     if(d < 0){//휠 아래로
    //         var next = $(this).next().offset().top;
    //         $('html,body').stop().animate({scrollTop:next},1000,'easeOutBounce');
    //     }
    // });
    $("#popup").draggable();

    if($.cookie('pop')!= "no"){
        $("#popup").show();
    }

    $('#popup area:eq(0)').click(function(){
        $("#popup").fadeOut('fast');
        // 서서히사라짐
    });
   
    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});
        //하루동안 pop에 no를 저장
        //하루동안 보지 않기
        $("#popup").fadeOut('fast');
        // 서서히사라짐
    });

    $("#notice_wrap").draggable();

    if($.cookie('popup') == "none"){
        $("#notice_wrap").hide();
    }
    var chk = $('#expiresChk');

    $('.closeBtn').on('click',closePop);

    function closePop(){
        if(chk.is(":checked")){
            //chk변수(체크박스가)checked일경우 
            //popup에 none을 3일동안 저장
            $.cookie('popup','none',{expire:3});
        }
        $("#notice_wrap").fadeOut("fast");
    }
    
});