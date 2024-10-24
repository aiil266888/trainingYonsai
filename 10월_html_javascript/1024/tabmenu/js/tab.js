const targetLink = document.querySelectorAll('.tab_menu a'); //탭 버튼
const tabContent=document.querySelectorAll('#tabContent>div'); //탭 내용

// targetLink.forEach(function(link){
//     link.addEventListener('click', function(e){
//         e.preventDefault(); //링크금지

//         let orgTarget = e.target.getAttribute('href');
//         let tabTarget =orgTarget.replace("#","");

//         tabContent.forEach(function(content){
//             content.style.display ="none";
//         });

//         document.getElementById(tabTarget).style.display="block";

//         targetLink.forEach(function(f){
//             f.classList.remove("active");
//             e.target.classList.add("active");
//         });

//     });
// });


$(function(){
    $(".tab_menu a").click(function(){
        //let orgTarget = e.target.getAttribute('href');
        let orgTarget = $(this).attr('href');
        $('#tabContent > div').hide();

        $(orgTarget).show();
        $(".tab_menu a").removeClass('on');
        $(this).addClass('active');
        return false;
    });
})