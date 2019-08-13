$(function () {
    //登录成功后，鼠标悬浮头像上显示小菜单
    $("#div_dlzc").mouseover(function () {
        $("#user_menu").css({"display":"block"});
    })
    $("#div_dlzc").mouseout(function () {
        $("#user_menu").css({"display":"none"});
    });

    /*$(".a_menu").click(function () {
        $(this).siblings("div").css({"display":"block"});
        $(this).parent().siblings().children("div").css({"display":"none"});
    });
*/

    $(".cl").on("click"," .a_menu",function () {
        $(this).siblings("div").css({"display":"block"});
        $(this).parent().siblings().children("div").css({"display":"none"});
    });
})