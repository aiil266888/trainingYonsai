$(function(){
    //
    var gap = 103;

    var top1 = $('.area1').offset().top;
    var top2 = $('.area2').offset().top;
    var top3 = $('.area3').offset().top;
    var top4 = $('.area4').offset().top;
    var top5 = $('.area5').offset().top;
    console.log(top1,top2,top3,top4,top5);
    
    $(window).scroll(function(){
        //스크롤 수치 확인
        var sct = $(this).scrollTop();
        $('.s_top').text(sct);

        var h = $(window).scrollTop();
        if(h < top2 - gap){
            $(".area1").addClass("on");
        }else if(h < top3 - gap){
            $(".area2").addClass("on");
        }else if(h < top4 - gap){
            $(".area3").addClass("on");
        }else if(h < to5 - gap){
            $(".area4").addClass("on");
        }else{
            $(".area5").addClass("on");
        }
    });
    //컴퓨터가 시작하자 마자 한 번 스크롤해줌
    $(window).trigger('scroll');

});