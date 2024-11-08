$(function(){
    var show_number = 3;
    var total = $('#banner li').length;
    var l_width = $('#banner li').eq(0).width();
    var copy_pic = $('#banner li:lt(3)').clone();
    
    //banner뒤에 copy_pic추가
    $('#banner').append(copy_pic);
    

    console.log(l_width);
});