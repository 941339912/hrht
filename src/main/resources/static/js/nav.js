$(function () {

    layui.use('form', function() {
        var form = layui.form;
        //点击全选按钮
        form.on("switch(parent)", function (data) {
            if (data.elem.checked) {
                $(".check_fuxuan").each(function () {
                    $(this).prop('checked', true);
                });
            } else {
                $(".check_fuxuan").each(function () {
                    $(this).prop('checked', false);
                });
            }
            form.render("checkbox");
        });
    });

    //加载菜单
    $.post("menuList",{roleId:1},function (data) {
        var menuList = data.menuList;
        var twoMenuList = data.twoMenuList;
        var $ul = $(".cl");
        for (var i = 0; i < menuList.length; i++) {
            var $li = $("<li><a href=\"javascript:;\" class=\"a_menu\">"+menuList[i].menuName+"</a></li>");
            var $div = $("<div class='div_menu'></div>");
            for (var j = 0; j < twoMenuList.length; j++) {
                if (menuList[i].id == twoMenuList[j].parentId){
                    var $a = $("<a href=\"patients\">"+twoMenuList[j].menuName+"</a>");
                    $div.append($a);
                }
            }
            $li.append($div);
            $ul.append($li);
        }
    },"json");
});