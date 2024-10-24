const targetLink = document.querySelectorAll('.tab_menu a'); //탭 버튼
const tabContent=document.querySelectorAll('#tabContent>div'); //탭 내용

//targetLink 배열을 forEach로 순회
//link를 클릭하면 아래 함수 실행
targetLink.forEach(function(link){

    //.tab_menu a(=targetLink)를 클릭하면 아래 함수 실행
    link.addEventListener('click', function(e){
        e.preventDefault(); //링크금지

        //getAttribute는 href , src의 속성 값을 가져온다
        let orgTarget = e.target.getAttribute('href');
        //클릭(e.taget) -this로 변경가능 
        //alert(orgTarget); //클릭한 속성 가져옴 (#tabs1같은거 )
        let tabTarget =orgTarget.replace("#","");
        //alert(tabTarget); //tabs1 (#이 빠짐)
        
        //모든 tabContent를 안보이게 설정
        tabContent.forEach(function(content){
            content.style.display ="none";
        });
        //클릭한 탭만 보이게 설정
        document.getElementById(tabTarget).style.display="block";

        //targetLink를 foreach로 돌리며 
        //기존 activeClass를 지운다 + 클릭한 target에 active를 추가한다
        targetLink.forEach(function(f){
            f.classList.remove("active");
            e.target.classList.add("active");
        });
    });
});
