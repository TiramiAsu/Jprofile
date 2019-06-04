-- Old Table Design by MySQL

/**
 * Author:  TiramiAsu
 * Created: Jun 4, 2019
 */

/*
n型態: 用於萬國碼(不同語系的國家不會亂碼)
  var: 可變動長度(可大於設定的 n ，沒有 var 型態如果超過 n 會出錯)

   字串型態/儲存大小(bytes)
	char(n)/ n    : 資料必須 <= n : 一定長度，且只會有英數字
 varchar(n)/ n+2  : 資料可 > n    : 長度可變動，且只會有英數字
   nchar(n)/ 2*n  : 資料必須 <= n : 一定長度，且可能會用非英數以外的字元
nvarchar(n)/ 2*n+2: 資料可 > n    : 長度可變動，且可能會用非英數以外的字元

讀取效能: 高(nchar,char) > (nvarchar, varchar)低
儲存空間: 大(nvarchar,nchar) > (varchar,char)小

*/
CREATE TABLE ICCustomers(
    c_ID int(12) not null primary key auto_increment,
    c_Code char(20) not null,		# 單純英文數字
    c_Name nvarchar(20) not null,	# 可能有其他語系名字
    c_Phone nvarchar(16) not null,	# +886-977-989-898，可能沒打符號會<16
    c_Point int(12) not null,		# 點數: 單純數字
    c_Remark text(255)
);

CREATE TABLE Employees(
    e_ID int(12) not null primary key auto_increment,
    e_Code char(20) not null,		# 單純英文數字
    e_Name nvarchar(20) not null,	# 可能有其他語系名字
    e_Phone nvarchar(12) not null,	# +886-977-989-898，可能沒打符號會<16
    e_Position varchar(20) not null,    # 職務: 單純英文
    e_Remark text(255)
);

CREATE TABLE Products(
    p_ID int(12) not null primary key auto_increment,
    p_Code char(20) not null,		# 單純英文數字
    p_Name nvarchar(20) not null,	# 可能有其他語系名字
    p_Price decimal(9,3) not null,
    p_Cost decimal(9,3) not null,
    p_Unit nvarchar(5) not null,
    p_Status nchar(5) not null,		# 狀態: 停售/販售中
    p_Remark text(255)
);

CREATE TABLE Orders(
    o_ID int(12) not null primary key auto_increment,
    e_ID int(12) not null,
    c_ID int(12) not null,
    o_Date date not null,
    o_Time time not null,
    o_Remark text(255)
);

CREATE TABLE OrderDetails( # 未設 Primary Key
    e_ID int(12) not null,
    c_ID int(12) not null,
    od_Price decimal(9,3) not null,
    od_Unit nvarchar(5) not null,
    od_Quantity int(12) not null,
    od_Remark text(255)
);

CREATE TABLE TimeCard( # 未設 Primary Key
    e_ID int(12) not null,
    tc_Date date not null,
    tc_GoTime time not null,
    tc_OffTime time not null,
    tc_Remark text(255)
);

/*
utf8: 編碼最大長度: 1-3位元
utf8mb4(most bytes 4)  : 編碼最大長度1-4位元

  速度: utf8mb4_general_ci > utf8mb4_unicode_ci
精確度: utf8mb4_unicode_ci > utf8mb4_general_ci
*/
SHOW VARIABLES WHERE Variable_name LIKE 'character\_set\_%' OR Variable_name LIKE 'collation%';