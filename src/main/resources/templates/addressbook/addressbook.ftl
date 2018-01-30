<html>
<#include "../common/header.ftl">

<body>
<div id="wrapper" class="toggled">

<#--边栏sidebar-->
<#include "../common/nav.ftl">

<#--主要内容content-->
    <div id="page-content-wrapper">
        <div class="container-fluid">
            <div class="row clearfix">
                <div class="col-md-12 column">
                    <form role="form" method="post" action="/addressbook/save">
                        <div class="form-group">
                            <label>姓名</label>
                            <input name="name" type="text" class="form-control" value="${(addressBook.name)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>手机号</label>
                            <input name="phoneNumber" type="number" size="11" class="form-control"
                                   value="${(addressBook.phoneNumber)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>公司</label>
                            <input name="company" type="text" class="form-control" value="${(addressBook.company)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>电子邮件</label>
                            <input name="email" type="text" class="form-control" value="${(addressBook.email)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>地址</label>
                            <input name="address" type="text" class="form-control" value="${(addressBook.address)!''}"/>
                        </div>
                        <div class="form-group">
                            <label>备注</label>
                            <input name="remark" type="text" class="form-control" value="${(addressBook.remark)!''}"/>
                        </div>

                        <#if addressBook??>
                            <input hidden type="number" name="addressBookId" value="${(addressBook.addressBookId)!''}">
                        </#if>

                        <button type="submit" class="btn btn-default">提交</button>
                    </form>
                </div>
            </div>
        </div>
    </div>

</div>
</body>
</html>