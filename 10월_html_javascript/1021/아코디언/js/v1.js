//모든 sub메뉴를 querySelectorAll로 sub변수에 등록
var sub = document.querySelectorAll('.sub');
//모든 li a 메뉴를 menuLiA변수에 등록
var menuLiA = document.querySelectorAll('.m_menu>li>a');

menuLiA.forEach(function(item){
    item.addEventListener('click',function(){
        //getComputedStyle => Dom요소의 현재 스타일을 가져오기위한 메서드
        //이 메서드를 사용하면 ㅐ특정 요소에 적용 된 모든 스타일 속성과 값을 
        //그 값에 대한 정보를 얻는다.
        var subHeight = getComputedStyle(this.nextElementSibling).height;
        // alert(subHeight);
        if(subHeight=='0px'){
            slideUp();
            this.nextElementSibling.style.height = '108px';
        }else{
            this.nextElementSibling.style.height = '0px';
        }
    });
});

function slideUp(){
    sub.forEach(function(item){
        item.style.height='0px';
    });
}