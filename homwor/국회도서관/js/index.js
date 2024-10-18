//tab
const Info_link = document.querySelectorAll('.tab_menu a'); //공지사항 보도자료
const tabContent=document.querySelectorAll('#tabContent>div'); //탭 내용

//공지사항 보도자료 클릭하면 아래 함수 실행
Info_link.forEach(function(link){
    link.addEventListener('click', function(e){
        e.preventDefault(); //링크금지

        //hreft에 있는 값 가져옴 #tabs1같은거
        let originTarget = e.target.getAttribute('href');
        let detailTarget = originTarget.replace("#","");//#없애줌

        //클릭하면 원래있던 tabContent(기사내용)안보이게 만듬
        tabContent.forEach(function(content){
            content.style.display ="none";
        });
        //클릭한 탭 보이게 만듬
        document.getElementById(detailTarget).style.display="block";

        //클릭한 탭 색 바꾸기~ (active클래스 추가)
        Info_link.forEach(function(f){
        f.classList.remove("active");
        e.target.classList.add("active");
        });
    });


});//END Info_link forEach


//Scroll
var list = document.getElementById('banner'); //사진들어잇는 ul 
var listLi = document.querySelectorAll('#banner li'); //전부 
var show_num = 1;  //보여지는 사진은 1장
var total = 5;//전체 5장 
var li_width = document.querySelector('#banner li a img').offsetWidth; //720px

var num = 0;
function autoplay(){
    if(num === 4){
        num = -1;
        list.style.marginLeft = "0px";
    }
    //한번만 실행 - 50 - 0.05 (setTimeout쓰는 이유 num =0 -> 1 가는게 동시실행방지)
    setTimeout(function(){
        num++;
        list.style.transition = "margin-left 0.5s";
        list.style.marginLeft = -li_width * num + "px";
    },50);
}
setInterval(autoplay, 3000);
//멈추는건 이거 쓰라는듯???????????? clearInterval(autoplay);
