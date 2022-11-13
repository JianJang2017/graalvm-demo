/***
 * 定义常量auth
 * @type {string}
 */
const auth='JianJang';

/***
 * 获取当前日期
 * @returns {string}
 */
function getDate(){
    var timestamp = Date.parse(new Date());
    var date = new Date(timestamp);
    //获取年份
    var Y =date.getFullYear();
    //获取月份
    var M = (date.getMonth() + 1 < 10 ? '0' + (date.getMonth() + 1) : date.getMonth() + 1);
    //获取当日日期
    var D = date.getDate() < 10 ? '0' + date.getDate() : date.getDate();
    return Y+'-'+M+'-'+D;
}

/***
 * 获取当前时间戳
 * @returns {number}
 */
function getTimeStamp(){
    return new Date().getTime();
}