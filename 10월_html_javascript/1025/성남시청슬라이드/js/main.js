$(function(){
    var pop_prev = $('.slide_but p .prev');
    var pop_next = $('.slide_but p .next');
    var pop_pause = $('.slide_but p .pause');

    var popCurrent = 0;
    var popIndex = 0;
    var total = $('.pop_slide li').length //갯수 (11개뜸)

    /* 다음버튼 */
    pop_next.click(function(){
        popIndex = popCurrent + 1;
        if(popIndex == total) popIndex = 0;
        var pop_cu = $('.pop_slide li').eq(popCurrent); //현재사진
        var pop_ne = $('.pop_slide li').eq(popIndex)//다음에 올 사진

        pop_cu.css('left',0).stop().animate({'left':'-100%'});
        pop_ne.css('left','100%').stop().animate({'left':'0'});
        popCurrent = popIndex;
        $('.slide_but p strong').text(popIndex+1);
    });  

    /* 이전버튼 */
    pop_prev.click(function(){
        popIndex = popCurrent - 1;
        if(popIndex == -1) popIndex = total -1;
        var pop_cu = $('.pop_slide li').eq(popCurrent); //현재사진
        var pop_ne = $('.pop_slide li').eq(popIndex)//다음에 올 사진

        pop_cu.css('left',0).stop().animate({'left':'100%'});
        pop_ne.css('left','-100%').stop().animate({'left':'0'});
        popCurrent = popIndex;
        $('.slide_but p strong').text(popIndex+1);
    });

    /* 자동 슬라이드  */
    var id;
    id = setInterval(popAuto,3000);

    function popAuto(){
        pop_next.trigger('click');
    }

    /* 정지버튼 */
    pop_pause.click(function(){
        /* on클래스 없으면 on클래스 주고 자동슬라이드 멈춤 */
        if($(this).hasClass('on')==false){
            $(this).addClass('on');
            clearInterval(id);
        }else{/* 있으면 on클래스 삭제하고 자동슬라이드 다시 실행 */
            $(this).removeClass('on');
            id = setInterval(popAuto,3000);
        }
    });
});