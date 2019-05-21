<table>
    <td style="border:0px;width:100px;"><img src="https://avatars0.githubusercontent.com/u/46002098?s=460&amp;v=4"/></td>
    <td style="border:0px"><h1>J profile</h1></td>
</table>

## Case I. RESTful

以 DAO 架構為基礎，利用 Ajax 與 Servlet 設計 [URI](#uri) ，以 RESTful 的方式處理 HttpRequest ，對資料庫完成 CRUD 的動作。除了基本的 REST 設計方式外，另外以 JAX-RS 來對照兩者撰寫差異

* REST: 利用 Servlet 透過請求方法及 URI 來設計，決定執行 CRUD 的動作
* JAX-RS: 利用 ResourceConfig 更簡單的撰寫並管理 URI



#### CRUD Case

| Action | Description                                        | Parameter                      |
| ------ | -------------------------------------------------- | ------------------------------ |
| Create | 新增 "Tirami"                                      | createname="Tirami"            |
| Read   | 1: 查詢 id=2 的資料<br />2: 查詢全部               | 1: id=2<br />2: (no Parameter) |
| Update | 修改 id=0 的資料，<br />新的 UserName ="TiramiASu" | id=0, updatename="TiramiASu"   |
| Delete | 刪除 id=3 的資料                                   | id=3                           |



#### 兩者 URI 設計組成

| Case   | URI                                                          | Control class                                                |
| ------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| REST   | <b style="color:red">/casei/rest/</b>user/id<br /><b style="color:red">/casei/rest/</b>uses | <b style="color:red">UserRestServlet</b> + UserRestServlet.RestRequest |
| JAX-RS | <b style="color:red">/casei/jaxrs</b><u>/user</u>/3          | <b style="color:red">UserApplication</b> + <u>UserRS</u> + UserRS.method |



REST URI Design

| Action | URI                                  | Method       | Content                                       |
| ------ | ------------------------------------ | ------------ | --------------------------------------------- |
| Create | /casei/rest/user/                    | POST         | 利用 xhttp 傳送新增的 UserName                |
| Read   | /casei/rest/user/2<br />/casei/users | GET<br />GET | 1: Select User by id<br />2: Select All Users |
| Update | /casei/rest/user/0                   | PUT          | 要更新的資料 id 與 UserName                   |
| Delete | /casei/rest/user/3                   | DELETE       | 要刪除的資料 id                               |

\* **xhttp:** [XMLHttpRequest](#xhttp) Object



JAX-RS URI Design

| Action | URI                                            | Method       | Content                                       |
| ------ | ---------------------------------------------- | ------------ | --------------------------------------------- |
| Create | /casei/jaxrs/user/                             | POST         | 利用 xhttp 傳送新增的 UserName                |
| Read   | /casei/jaxrs/user/2<br />/casei/jaxrs/user/all | GET<br />GET | 1: Select User by id<br />2: Select All Users |
| Update | /casei/jaxrs/user/0                            | PUT          | 要更新的資料 id 與 UserName                   |
| Delete | /casei/jaxrs/user/3                            | DELETE       | 要刪除的資料 id                               |



![CaseI.RESTful](C:\Users\USER\Documents\casei_RESTful.PNG)

<span id="xhttp"/>



#### (Ajax) `XMLHttpRequest` Object

| 屬性                         | 說明                                                         |
| ---------------------------- | ------------------------------------------------------------ |
| onreadystatechange           | 當 readyState 屬性改變時就會調用                             |
| readyState                   | 存有 XMLHttpRequest 現有狀態:<br />0: 請求未初始化<br />1:服務連結已建立<br />2:請求已接收<br />3:請求處理中<br />4:請求已完成 |
| status                       | 網頁狀態碼                                                   |
| open(method, path, boolean); | method: 請求方法<br />path: URL<br />boolean: 是否要非同步   |
| send(body);                  | body 可為:<br />1: document: 序列化之後傳送出去<br />2: BodyInit: 可以是 Blob, BufferSource, FormData, URLSearchParams, ReadableStream, or USVString 等物件<br />* 預設為null |



#### (JAX-RS) 建構 Jersey Container

使用 ResourceConfig ，需 dependecy jersey container 才能順利執行

```xml
<!-- for Jax-RS -->
<dependency>
    <groupId>org.glassfish.jersey.containers</groupId>
    <artifactId>jersey-container-servlet</artifactId>
    <version>2.2</version>
</dependency>
```





## Case II. Filter

15-17

## Case III. Session

20-21

## Case IV. Custom Tag

21-23

## Case V. Hibernate

23-



<span id="uri"/>



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















