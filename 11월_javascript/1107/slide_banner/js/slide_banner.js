$(function(){
    var visual = $('#brandVisual>ul>li'); //큰사진
    var btn = $('#buttonList>li'); //pager버튼
    var current = 0; //현재 인덱스번호
    var id;

    btn.click(function(){
        var i = $(this).index();
        btn.removeClass('on');
        btn.eq(i).addClass('on');
        move(i);

        return false;
    });

    function timer(){
        id =setInterval(function(){
            var n =  current + 1
            if(n==3){n=0;}
            //인덱스  번호 n 해당하는 버튼을 강제 클릭
            btn.eq(n).trigger('click');
        },3000);
    }
    timer();

    function move(i){
        if(current == i) return;
        //현재 활성화 된 button과  클랙한 버튼(btn)이 같으면 빠져나간다 
        var cu = visual.eq(current); //current번째 큰사진을 잠깐 저장
        var next = visual.eq(i);
        cu.css('left','0').animate({'left':'-100%'},500);
        next.css('left','100%').animate({'left':'0'},500);
        current = i;
    }
});