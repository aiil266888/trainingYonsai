$(function(){
    var pdt = 0;

    $(window).scroll(function(){
        /* 현재 스크롤 위치 수치 구해서 h1에 실시간 보내기*/
        var count = $(window).scrollTop();
        $('#sTop').text(count);

        //새우깡 점점 진해짐 
        pdt = count * 0.001;
        if(pdt <= 1){
            $('#pdt_basic').css("opacity",pdt);
        }
        //새우깡돌아 
        $('#pdt_basic').css('transform',"rotate("+count+"deg)");
        //($('section>div').eq(n).offset().top); <<각 n번째 div가 시작하는 위치
        for(var x=0; x<5; x++){
            //x번째 div의 시작지점이 현재 스크롤 위치와 같아지면 class on을 준다 
            if(count >= $('section>div').eq(x).offset().top){
                $('.nav_top ul li').removeClass('on');
                $('.nav_top ul li').eq(x).addClass('on');
                $('.nav_side ul li').removeClass('on');
                $('.nav_side ul li').eq(x).addClass('on');
            }
        }
    })//END (window).scroll


    $('.nav_top ul li , .nav_side ul li').click(function(){
        //클릭한게 몇 번째 배열인지를 i에 저장
        var i = $(this).index();

        // offsest_nav에 클릭한div의 시작지점 위치를 저장
        var offset_nav = $('section>div').eq(i).offset().top;   
        //html body를 시작지점까지 이동하는 애니메이션 실행
        $('html,body').stop().animate({scrollTop:offset_nav},1000);
        return false;
    });

    //마우스휠 고정시키기  
    $("section>div").mousewheel(function(event,d){
        if(d>0){//위
            var prev = $(this).prev().offset().top;
            $('html,body').stop().animate({scrollTop:prev},1500)
        }
        if(d<0){//아래
            var next = $(this).next().offset().top;
            $('html,body').stop().animate({scrollTop:next},1500)
        }
    });

    //팝업창 드래그 시키기
    $('#popup,#notice_wrap').draggable();

    //쿠키 넣기 (pop이란 변수에 no를 넣고 하루동안 유지된다)
    //$.cookie('pop','no',{expires:1});
    if($.cookie('pop')!="no"){
        $('#popup').show();
    }
    $('#popup area:eq(0)').click(function(){
        $('#popup').fadeOut('fast');
    });
    //닫기 버튼을 클릭하면 popup창을 서서히 사라지게함

    $('#popup area:eq(1)').click(function(){
        $.cookie('pop','no',{expires:1});  
        $('#popup').fadeOut('fast');
    });

    if($.cookie('popup')=='none'){
        $('#notice_wrap').hide();
    }
    var chk = $('expiresChk');
    $('.closeBtn').on('click',closePop); //닫기버튼 눌렀니?
    function closePop(){ //닫기버튼 눌렀으면?
        if(chk.is(":checked")){//input창에 checked있으면? 
            $.cookie('popup','none',{expires:3}); //popup에 none 3일간 저장  

        }
    }

});