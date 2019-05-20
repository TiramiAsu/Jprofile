<table>
    <td style="border:0px;width:100px;"><img src="https://avatars0.githubusercontent.com/u/46002098?s=460&amp;v=4"/></td>
    <td style="border:0px"><h1>J profile</h1></td>
</table>

## Case I. REST

利用 Ajax 與 Servlet 設計 URI ，以 RESTful 的方式處理 Request ，完成 CRUD 的動作



#### CRUD Case:

| Action | Description                                      | Parameter                      |
| ------ | ------------------------------------------------ | ------------------------------ |
| Create | 新增 "Cano"                                      | createname="Cano"              |
| Read   | 1: 查詢 id=2 的資料<br />2: 查詢全部             | 1: id=2<br />2: (no Parameter) |
| Update | 修改 id=0 的資料，<br />新的 UserName ="Cano Su" | id=0, updatename="Cano Su"     |
| Delete | 刪除 id=3 的資料                                 | id=3                           |



#### URI Design:

| Action | URI                                                  | Method       | Content                                       |
| ------ | ---------------------------------------------------- | ------------ | --------------------------------------------- |
| Create | /casei/user/<br />xhttp.send("createname=Cano");     | POST         | 新增不需要 id、傳送新增的 UserName            |
| Read   | /casei/user/2<br />/casei/users                      | GET<br />GET | 1: Select User by id<br />2: Select All Users |
| Update | /casei/user/0<br />xhttp.send("updateName=Cano Su"); | PUT          | 要更新的資料 id、傳送更新的 UserName          |
| Delete | /casei/user/3                                        | DELETE       | 要刪除的資料 id                               |

\* **/casei/:** servlet path

\* **xhttp:** XMLHttpRequest



#### (Ajax) `XMLHttpRequest` Object

| 屬性                         | 說明                                                         |
| ---------------------------- | ------------------------------------------------------------ |
| onreadystatechange           | 當 readyState 屬性改變時就會調用                             |
| readyState                   | 存有 XMLHttpRequest 現有狀態:<br />0: 請求未初始化<br />1:服務連結已建立<br />2:請求已接收<br />3:請求處理中<br />4:請求已完成 |
| status                       | 網頁狀態碼                                                   |
| open(method, path, boolean); | method: 請求方法<br />path: URL<br />boolean: 是否要非同步   |
| send(body);                  | body 可為:<br />1: document: 序列化之後傳送出去<br />2: BodyInit: 可以是 Blob, BufferSource, FormData, URLSearchParams, ReadableStream, or USVString 等物件<br />* 預設為null |





### 資源指定路徑:

#### URL：Uniform Resource Locator

> 具有指定的方法( http, ftp, mailto 等Protocol )來取得特定路徑的資源。

> http://www.pcschool.com/Java/Index.html
> ftp://www.pcschool.com/File/Java.pdf
> mailto:vincentjava@yahoo.com.tw



#### URN：Uniform Resource Name

> 沒有指定何種方法存取，具有指定資源的功能且是**"唯一"**的路徑。

> ISBN：1-880123-12-1
> Physical Address：00-90-CC-39-71-FF



#### URI：Uniform Resource Identifier

> 指定路徑取得資源。沒有指定何種方法存取，此路徑並不一定是唯一的。

> Java/index.html
> JavaFile/PDF/Java.pdf



Ex: http://www.pcshool.com.tw/new/index.html

```txt
URL: http://www.pcshool.com.tw/new/index.html

URN: http://www.pcshool.com.tw/ (由 DNS 或 Server 處理)

URI: new/index.html (由Web處理)
```

* URL = (URN + URI)















