<h1>Добавление нового товара</h1>
<form action="/goods/add" method="post">
    <div><label>Введите Наименование: <input type="text" name="name" required> </label></div>
    <div><label>Введите количество: <input type="text" name="quantity" required> </label></div>
    <button type="submit">Добавить</button>
    <#--        <div><input type="submit" value="Add"/></div>-->
</form>