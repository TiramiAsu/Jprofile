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


--INSERT INTO JAVAWEB.ICPRUDUCTS (PD_CODE, PD_NAME, PD_PRICE, PD_COST, PD_UNIT, PD_STATUS, PD_REMARK, PD_TS) 
-- VALUES ('A001', '漢堡', 50, 20, '個', '販售中', '', DEFAULT),
--        ('A002', '薯條', 30, 10, '包', '停售', '', DEFAULT);

INSERT INTO JAVAWEB.ICPRODUCTS (PD_CODE, PD_NAME, PD_PRICE, PD_COST, PD_UNIT, PD_STATUS, PD_REMARK) 
 VALUES ('A001', '漢堡', 50, 22, '個', '販賣中', '賺'),
        ('A002', '薯條', 30, 10, '包', '販賣中', '賺翻了'),
        ('A003', '雪碧', 40, 5, '杯', '販賣中', '賺翻了個大白眼'),
        ('A004', '可樂', 30, 15, '杯', '停售', '沒什麼好說的'),
        ('K852', '蘋果派', 60, 19, '個', '停售', '蘋果沒了'),
        ('A007', '黑漢堡', 79, 40, '個', '停售', ''),
        ('F085', '冰炫風', 45, 16, '杯', '販售中', ''),
        ('D852', '薯餅', 40, 10, '個', '販賣中', '現做');


