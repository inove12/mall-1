<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/font-awesome.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>
<body>
<#include "common/top.ftl">
<div class="container-fluid">
    <div class="row">
        <#include "common/sidebar.ftl">
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <#if !Request.tbProductCategory??>
                        <form action="/productController/insertProductCategory" enctype="application/x-www-form-urlencoded" method="POST">
                            <table>
                                <tr>
                                    <td width="500">主键id</td>
                                    <td><input type="text" name="id"></td>
                                </tr>
                                <tr>
                                    <td>父id</td>
                                    <td><input type="text" name="parentId" value="${id}"></td>
                                </tr>
                                <tr>
                                    <td>分类名称</td>
                                    <td><input type="text" name="categoryName"></td>
                                </tr>
                                <tr>
                                    <td>分类的图标</td>
                                    <td><input type="text" name="categoryIcon"></td>
                                </tr>
                                <tr>
                                    <td>分类下的产品数量</td>
                                    <td><input type="text" name="categoryDownProductCount"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                    <#if Request.tbProductCategory??>
                        <form action="/productController/updateProductCategory" enctype="application/x-www-form-urlencoded" method="POST">
                            <input type="hidden" name="id" value="${tbProductCategory.id}">
                            <input type="hidden" name="isDelete" value="${tbProductCategory.isDelete}">
                            <table>
                                <tr>
                                    <td width="500">主键id</td>
                                    <td><input type="text" name="id" value="${tbProductCategory.id}"></td>
                                </tr>
                                <tr>
                                    <td>父id</td>
                                    <td><input type="text" name="parentId" value="${tbProductCategory.parentId}"></td>
                                </tr>
                                <tr>
                                    <td>分类名称</td>
                                    <td><input type="text" name="categoryName" value="${tbProductCategory.categoryName}"></td>
                                </tr>
                                <tr>
                                    <td>分类的图标</td>
                                    <td><input type="text" name="categoryIcon" value="${tbProductCategory.categoryIcon}"></td>
                                </tr>
                                <tr>
                                    <td>分类下的产品数量</td>
                                    <td><input type="text" name="categoryDownProductCount" value="${tbProductCategory.categoryDownProductCount}"></td>
                                </tr>
                                <tr><td>操作</td><td><input type="submit" value="添加"></td></tr>
                            </table>
                        </form>
                    </#if>
                </div>
            </div>
        </div>
    </div>
</div>
<#include "common/foot.ftl">
</body>
</html>
