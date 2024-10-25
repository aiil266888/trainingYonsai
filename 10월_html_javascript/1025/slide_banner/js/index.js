$(function(){
    var visual = $('#brandVisual>ul>li');  //큰사진
    var button1 = $('#buttonList>li'); //pager 버튼
    var current = 0; //현재
    var id;
    
    button1.click(function(){
         var i = $(this).index();
         //alert(i);
         button1.removeClass('on');
         button1.eq(i).addClass('on');
         move(i); 
    });
 
   function move(i){
    //현재 활성화된 button과 클릭한 버튼이 같으면 빠져나간다
    if(current ==i)return;
    var cu = visual.eq(current);
    var ne = visual.eq(i);
    cu.css('left','0').stop().animate({'left':"-100%"},500);
    ne.css('left','100%').stop().animate({'left':"0%"},500);
   }

    function timer(){
        //3초마다 안에있는 함수를 실행한다
        id=setInterval(function(){
            var n = current + 1;
            if(n == 3){
                n = 0;
            }
            //버튼1을 컴퓨터에게 3초마닫 n의 값에 따라 클릭을 강제로 시킨다 
            button1.eq(n).trigger('click');
        },3000);
    }
});