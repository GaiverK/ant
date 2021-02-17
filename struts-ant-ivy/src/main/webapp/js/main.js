$(function() {
    $('body').on("click", ".details", function(){
        const infoBlock = $(".more-info");
        if( infoBlock.hasClass("hidden") ){
            $(this).val("Less info")
            $.get("details.do", function(data){
                $(".more-info").append(data).toggleClass("hidden");
            })
        }else {
            $(this).val("More info")
            infoBlock.empty().toggleClass("hidden");
        }
    })
});
