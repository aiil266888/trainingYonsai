$(function(){
    //article이 화면 최상단부터 떨어진 거리
    var a2 = $(".section2 >article ").eq(0).offset().top;
    var a3 = $(".section3 >article ").eq(0).offset().top;
    var a4 = $(".section4 >article ").eq(0).offset().top;


    /*------------- section 1 -----------*/ 
    var bx = $('.main_slide').bxSlider({
        auto:true,
        controls:true,
        pager:false,
        mode:'fade',
        pause:7000,
        onSlideBefore: function () {},
        onSlideAfter: function () {
          var slide_num = bx.getCurrentSlide();//현재의 슬라이드 번호
          if(slide_num==0){
            $('.btext2').removeClass('on');
            $('.stext2').removeClass('on');
            setTimeout(function(){
                $('.btext1').addClass('on');
              },300);
              setTimeout(function(){
                $('.stext1').addClass('on');
              },900);
          }else if(slide_num==1){
            $('.btext1').removeClass('on');
            $('.stext1').removeClass('on');
            setTimeout(function(){
                $('.btext2').addClass('on');
              },300);
              setTimeout(function(){
                $('.stext2').addClass('on');
              },900);       
          }
        }
    });

    $(window).scroll(function(){
        var sct = $(this).scrollTop();
        $('#sTop').text(sct);
     /*------------- section 2 -----------*/       
        if(sct>=370){  
            setTimeout(function(){
                $('.section2>article').addClass('on');
            },1000);
            setTimeout(function(){
                $('.section2>#index-ytube').addClass('on');
            },1500);
        }
        /* ------------section 3 -------------- */
        if(sct>=670){       
            setTimeout(function(){
                $('.section3>article').addClass('on');
            },1000);
            setTimeout(function(){
                $('.section3_array>.orange_li').addClass('on');
            },1500);
            setTimeout(function(){
                $('.section3_array>.orange_div').addClass('on');
            },2000);
            setTimeout(function(){
                $('.section3_array>.green_div').addClass('on');
            },2500);
            setTimeout(function(){
                $('.section3_array>.green_li').addClass('on');
            },3000);
        }

        /* ------------section4-------------- */
        if(sct>=1500){       
            setTimeout(function(){
                $('.section4>article').addClass('on');
            },1000);
            setTimeout(function(){
                $('.section4>.orange_li').addClass('on');
            },1500);
            setTimeout(function(){
                $('.sec4_list1').addClass('on');
            },2000);
            setTimeout(function(){
                $('.sec4_list2').addClass('on');
            },2500);
            setTimeout(function(){
                $('.sec4_list3').addClass('on');
            },3000);
        }
    });

});//END function