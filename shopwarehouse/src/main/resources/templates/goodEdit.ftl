<#if user??>
    <h1>Редактирование товара</h1>
    <form action="/goods" method="post">
        <table>
            <thead>
            <tr>
                <th>Наименование</th>
                <th>Количество</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="text" name="name" value="${good.name!}"> </td>
                <td><input type="text" name="quantity" value="${good.quantity!}"> </td>
            </tr>
            </tbody>
        </table>
        <input type="hidden" value="${good.id}" name="goodId">
        <button type="submit">Сохранить</button>
    </form>
<#else>
    <h1 class="text-danger">Нет такого товара</h1>
    <div><a href="/goods">Список товаров</a></div>
</#if>