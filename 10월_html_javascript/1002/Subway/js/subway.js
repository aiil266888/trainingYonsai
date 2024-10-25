$(function(){
    var visual = $('.sg>ul>li>a');  //큰사진
    var button1 = $('.slide_btn'); //pager 버튼
    var current = 0; //현재
    var id;

    button1.click(function(){
        //i에 클릭한 버튼이 몇번째인지 정보 넣어줌 (0,1,2,3)
        var i = $(this).index();
        //싹다 on 클래스 없애줌 
        button1.removeClass('on');
        //클릭한거에 on클래서 넣어줌 
        button1.eq(i).addClass('on');
        //move함수에 i넣어서 실행 ㄱㄱ
        move(i);
    });

    function move(i){
        //만약 i가 지금이랑 같으면 실행하지 말고 함수 끝내라
        if(current == i) return;
        //cu에 현재 사진넣음
        var cu = visual.eq(current);
        //ne에 클릭한 순서의 사진넣음 
        var ne = visual.eq(i);

        //지금 사진에 left: 0 -> left:-100으로 이동하는 애니메이션 
        cu.css('left','0').stop().animate({'left':-(i+1)*100+"%"},500);
        //새로 바꿀 사진에 left: 100 -> left:0으로 이동하는 애니메이션 
        ne.css('left','100%').stop().animate({'left':'0%'},500);

        current = i;
    }
});
