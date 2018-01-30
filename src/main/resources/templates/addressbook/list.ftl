<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

<#--边栏sidebar-->
    <#include "../common/nav.ftl">

<#--主要内容content-->
    <div id="page-content-wrapper" style="margin-top: 1%">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <table class="table table-bordered table-condensed">
                        <thead>
                        <tr>
                            <th>姓名</th>
                            <th>手机号</th>
                            <th>公司</th>
                            <th>电子邮件</th>
                            <th>地址</th>
                            <th>备注</th>
                            <th colspan="2">操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        <#list addressBookPage.content as addressBook>
                        <tr>
                            <td>${addressBook.name!}</td>
                            <td>${addressBook.phoneNumber!}</td>
                            <td>${addressBook.company!}</td>
                            <td>${addressBook.email!}</td>
                            <td>${addressBook.address!}</td>
                            <td>${addressBook.remark!}</td>
                            <td><a href="/addressbook/detail/${addressBook.addressBookId}">修改</a></td>
                            <td><a href="/addressbook/delete/${addressBook.addressBookId}" style="color: red">删除</a>
                            </td>
                        </tr>
                        </#list>
                        </tbody>
                    </table>
                </div>




            <#--新增通讯录联系人-->
                <div class="col-md-12 column" style="margin: -2%">
                    <ul class="pagination pull-right">
                        <li><a href="/addressbook/add" style="color: lightseagreen">新增通讯录联系人</a></li>
                    </ul>
                </div>


            <#--分页-->
                <div class="col-md-12 column">
                    <ul class="pagination pull-right">
                    <#if currentPage lte 1>
                        <li class="disabled"><a href="#">上一页</a></li>
                    <#else>
                        <li><a href="/addressbook/list?page=${currentPage - 1}&size=${size}">上一页</a></li>
                    </#if>

                    <#list 1..addressBookPage.getTotalPages() as index>
                        <#if currentPage == index>
                            <li class="disabled"><a href="#">${index}</a></li>
                        <#elseif index!=0>
                            <li><a href="/addressbook/list?page=${index}&size=${size}">${index}</a></li>
                        </#if>
                    </#list>

                    <#if currentPage gte addressBookPage.getTotalPages()>
                        <li class="disabled"><a href="#">下一页</a></li>
                    <#else>
                        <li><a href="/addressbook/list?page=${currentPage + 1}&size=${size}">下一页</a></li>
                    </#if>
                    </ul>
                </div>
            </div>
        </div>
    </div>

</div>


<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</body>
</html>