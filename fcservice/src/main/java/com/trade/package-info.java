package com.trade;
/***
 * @author  沙建斌
 * @date 2021-11-08 20：54
 * @version 1.0
 * @description 交易
 *             1:所有InterfaceMapper都需要放置到此包下面。因为注解@MapperScan 扫描的是:com.trade
 *             2:交易命名规则：
 *                  (1):顶层交易目录为4位以D开头。如D001.
 *                  (2):具体交易码放置到顶层目录下,为5位且以T开头,如T0001
 *                  (3):Controller层规则(服务码+场景码)
 *                      ->RequestMapping("+服务码+")
 *                      ->PostMapping("+场景码+")
 *
 *                     服务码  = 交易码 如：T0001
 *                     场景码:
 *                      ->查询时 Q01,Q02 ...以此类推
 *                      ->新增时 I01,I02 ...以此类推
 *                      ->更改时 U01,U02 ...以此类推
 *                      ->删除时 D01,D02 ...以此类推
 *
 *                      ^以上规则主要是为了可以后期扩展使用数据库配置的方式进行Controller分发
 *
 * ***/