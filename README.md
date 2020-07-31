# 工具类介绍
## DateUtil
* getCurrentDate()，获取当期日志，只包含日期
* calcIntervalDays(Date date1, Date date2)，计算两个日期间隔的天数
* dayOfWeek(Date date)，返回data对应的是星期几
* getTodayMinutes()，获取今天的分钟数，如今天18:05，则返回1805
* getIntervalDate(Date time, int days)，获取指定间隔天数的日期，比如昨天  
* getIntervalDate(new Date(), -1)
* dateToShortDateString(Date date)，将date转成String，输出String只包含年月日
* dateToString(Date date)， 将date转成String，输出String包含年月日时分秒
* stringToDate(String dateStr)，将String转成Date，默认时区东八区，TimeZone.getTimeZone("Asia/Shanghai")
