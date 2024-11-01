$(function(){
    var pc_prev = $('.pc-slide .prev-btn');
    var pc_next = $('.pc-slide .next-btn');
    var mo_prev = $('.mo-slide .prev-btn');
    var mo_next = $('.mo-slide .next-btn');

    var $slick =  $('.pc-slide ul');
// pc용
  $slick.slick({
    autoplay:true,
    prevArrow:pc_prev,
    nextArrow:pc_next,
    dots:true,
  });
  $('.mo-slide ul').slick({
    autoplay:true,
    prevArrow:mo_prev,
    nextArrow:mo_next,
  });


//mobile용
$(window).resize(function(){
  var w = $(this).width();//화면넓이 구하기
  console.log(w);

  if(w>=800){
    mo_prev.hide();
    mo_next.hid();
  }else{
    mo_prev.show();
    mo_next.show();
  }
});
//처음 실행시 최초에 리사이즈 실행
$(window).trigger('resize');


});