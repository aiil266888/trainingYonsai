var sub = document.querySelectorAll('.sub_menu');
var menuLia = document.querySelectorAll('.m_menu>li>a');

menuLia.forEach(function(item){
    item.addEventListener('click',function(){
        var subHeight = getComputedStyle(this.nextElementSibling).height;

        if(subHeight == '0px'){
            
        }
    })
});