$(function(){
var now = 0;
// 이미지 가로길이
var li_width = $(".slide_screen li:eq(0)").width();//350
var total = $(".slide_screen li").length; //4
var copy = $(".slide_screen li:lt(6)").clone();
// $(".slide_screen").append(copy);

var button_prev = $('.btn_right');
var button_next = $('.btn_left');


/* 다음버튼 */
button_next.click(function(){
    if (now == total) {
        now = 0;
        $(".slide_screen").css("margin-left", "0");
      }
    now++;
    $('.slide_screen').stop().animate({marginLeft: -li_width * now }, 500)
});

/* 이전버튼 */
button_prev.click(function(){   
    if (now == 0) {
        now = 4;
        $(".slide_screen").css("margin-left", "0");
      }
    now++;
    $('.slide_screen').stop().animate({marginLeft: li_width * now }, 500)
});


});