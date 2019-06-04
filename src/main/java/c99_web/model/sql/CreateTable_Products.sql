/**
 * Author:  TiramiAsu
 * Created: Jun 4, 2019
 */
CREATE TABLE ICProducts(
    pd_id integer primary key generated always as identity, -- 主鍵(產品代號)
    pd_code varchar(10) not null,               -- (編號)
    pd_name varchar(20) not null,               -- (名稱)
    pd_price integer not null,                  -- (價錢)
    pd_cost integer not null,                   -- (成本)
    pd_unit varchar(10) not null,               -- (單位)
    pd_status varchar(10) not null,             -- (狀態:停售/販售中)
    pd_remark varchar(50)--, (備註)
    --pd_ts timestamp default current_timestamp   -- (建檔時間)
);



