var show_num = 3; 
var total =  $('#banner li').length;
var li_w =   $('#banner li').eq(0).width();
var copyobj = $('#banner li:lt(3)').clone();
  //인덱스번호 3번보다 작은 li를 copy해라
  $('#banner').append(copyobj);
  // #banner 맨뒤에 copyobj를 추가
  var num = 0;
  $('.next').click(function(){
    if(num == total){
        num = 0;
        $('#banner').css('margin-left','0');
    }
    num++;
    $('#banner').stop().animate({marginLeft:-li_w*num},500);
    return false;
  });
  $('.prev').click(function(){
    if(num == 0){
        num = 5;
        $('#banner').css('margin-left',-li_w*num);
    }
    num--;
    $('#banner').stop().animate({marginLeft:-li_w*num},500);
    return false;
  });
  //자동슬라이드
var id = setInterval(autoplay,3000);
function autoplay(){
if(num == total){
        num = 0;
        $('#banner').css('margin-left','0');
    }
num++;
$('#banner').stop().animate({marginLeft:-li_w*num},500);
}