
<div><a href="goods/add">Добавить Товар</a></div>
    <#if size != 0>
    <h1>Список товаров</h1>
        <table>
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Наименование</th>
            <th scope="col">Количество</th>
            <th scope="col">Редактировать</th>
            <th scope="col">Удалить</th>
        </tr>
        </thead>
<tbody>
        <#list goods as g>
            <tr>
                <th>${g?index + 1}</th>
                <td >${g.name!}</td>
                <td>${g.quantity}</td>
                <td><a href="/goods/${g.id}">Редактировать</a></td>
                <td><a href="/goods/del/${g.id}">Удалить</a></td>
            </tr>
        </#list>
</tbody>
        </table>
    <#else>
        <div></div>
        <h1>Нет товаров</h1>
    </#if>
