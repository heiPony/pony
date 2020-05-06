package com.pony.test.constant;

import com.pony.test.utils.Assert;
import com.pony.test.utils.MD5;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.ResourceBundle;

public class Constant {
    public static Integer EXPORT_LIMIT = 999900;
    public static Logger logger = LoggerFactory.getLogger(Constant.class);
    public static ResourceBundle rb = ResourceBundle.getBundle("application");
    public static Boolean ADMIN_FILTER_DEBUG = Boolean.valueOf(rb.getString("system.admin.filter.debug"));
    public static Boolean EXPORT_IS_LOCALHOST = Boolean.valueOf(rb.getString("system.export.is_localhost"));
    public static String QRCODE_PATH = rb.getString("system.admin.qrcode.path");
    public static Boolean IS_AUTO_TASK = Boolean.valueOf(rb.getString("system.admin.is_auto_task"));
    public static Integer RESERVED_LENGTH = 5; // 订单号预留位数长度 (创建订单时使用)
    public static Integer NEWEST_ONE = 1; // 查询最新操作记录
    public static Integer NEWEST_CHANGE_NUM = 3; // 查询最新三条换纸记录
    public static Integer NEWEST_POST_NUM = 5; // 查询最新五条上报记录
    public static Integer DAY = 365; // 一年天数
    public static String CLIENT_PWD = "1234561";
    public static String CLIENT_PREFIX = "KH";
    public static String SUPPER_PRE = "SUPPER_";
    public static String SUPPER_PWD = "yunZhi@123";
    public static String OWNER_PWD = "123456";
    public static String OWNER_PREFIX = "YZ";
    public static String MODIFY_PWD = "modifyPwd_ZS";
    public static String CHINA_PATH = "/01/01156/";
    public static Integer PAPER_LENGTH = 18000;
    public static String LOGIN_ADMIN = "ADMIN";
    public static String SUPER_MANAGER = "admin";
    public static String DEFAULT_TIME = "2000-01-01 00:00:00";
    public static String PWD_SUFFIX = "websiteuser";// 密码后缀
    public static String WX_FW_FIRMWARE_NOTICE = rb.getString("wx.fw.firmware.notice");// 微信设备异常消息模板 MMmkryDjTe2RWYqNyK0eRI6ougWzOi6Xn1kX5S_tVUM
    public static String WX_ORDER_PROFIT_NOTICE = rb.getString("wx.order.profit.notice");// 微信收益消息模板 5cm3-BoqxdjznS8v9qQqWb4u8xJu__K2-4TlDfwAoZk
    public static String DEFAULT_ORDER_PARAM_ITEM_IDS = "8,0,0,11,12,15";
    public static String API_TOKEN_KEY = "zhishanYunzhi";
    public static Integer LESS_BATTERY = 7100; // 电量少于7100:少电
    public static final String OLD_SN = "13284";
    public static final String REPLACE_SN = "13289";

    public interface FILE_PATH {
        String PNG = "/home/software/yz-file/png/";
        String EXCEL = "/home/software/yz-file/excel/";
        String FILE = "/home/software/yz-file/file/";
        String EXCEL_SUFFIX_XLSX = ".xlsx";
        // String PNG = "e://home/yz-file/png/";
        String LOCAL_EXCEL = "d://";
//    String FILE = "e://home/yz-file/file/";
    }

    // 小程序url
    public interface WX_SP_URL {
        // 运维人员授权的url
        String SERVICE_OWNER_AUTH = "/pages/index/index";
    }

    // =========================微信红包============================
    public interface WX_BONUS {
        String MCH_ID = rb.getString("wx.mp.bonus.mch_id");
        String WX_APPID = rb.getString("wx.mp.bonus.appid");
        String KEY = rb.getString("wx.mp.bonus.key");
        String SECRET = rb.getString("wx.mp.bonus.appscret");
        String RED_URL = rb.getString("wx.mp.bonus.url");
        String QUERY_URL = rb.getString("wx.mp.bonus.query_url");
        String TOKEN = rb.getString("wx.mp.bonus.token");
    }

    public interface WX_SP {
        String SENCE_TAG_OWNER = "OWNER_";
        String SERVICE_APPID = rb.getString("wx.sp.service.appid");
        String SERVICE_APPSECRET = rb.getString("wx.sp.service.appsecret");
        String SENCE_TAG_SUPERVISER = "SUPERVISER_";
        String FACTORY_APPID = rb.getString("wx.sp.factory.appid");
        String FACTORY_APPSECRET = rb.getString("wx.sp.factory.appsecret");
    }

    public interface TEST_TYPE {
        String ADMIN = "admin";
        String TOOL = "tool";
    }

    public interface FEIGN_AUTH {
        String HEADER_KEY = "FEIGN-AUTH-YZ";
        String ADMIN = rb.getString("feign.auth.admin");
        String FAN = rb.getString("feign.auth.fan");
        String CORE = rb.getString("feign.auth.core");
        String SYNC = rb.getString("feign.auth.sync");
        String CITY = rb.getString("feign.auth.city");
    }

    // =========================短信============================
    public interface SMS {
        String APPID = rb.getString("sms.appid");
        String APPKEY = rb.getString("sms.appkey");
        String SIGN = getChinese(rb.getString("sms.sign"));
        String TEST =rb.getString("sms.sign");
        String ABNORMAL_PHONES = getChinese(rb.getString("sms.abnormal.phone"));
        String CMSTASK_PHONE = getChinese(rb.getString("sms.cms.task.phone"));
    }

    // 中文乱码
    public static String getChinese(String str) {
        String nameStr = "";
        if(StringUtils.isBlank(str)){
            return "";
        }
        try {
            if(str.equals(new String(str.getBytes("ISO-8859-1"), "UTF-8"))){
                nameStr = new String(str.getBytes("ISO-8859-1"), "UTF-8");
            }
            if(str.equals(new String(str.getBytes("UTF-8"), "UTF-8"))){
                nameStr = new String(str.getBytes("UTF-8"), "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
        }
        return StringUtils.isBlank(nameStr)?str:nameStr;
    }

    public interface SMS_TEMPLATE_INDEX {
        Byte DROPLINE = (byte) 10;// 掉线
        Byte BATTERY = (byte) 20;// 电量
        Byte CARD = (byte) 30;// 卡纸
        Byte LESS = (byte) 40;// 少纸
        Byte EMPTY = (byte) 50;// 空纸
        Byte TRACK = (byte) 60;// 断纸
    }

    // 模板id
    public interface SMS_TEMPLATE {
        // 掉线模板
        String DROPLINE_ID = rb.getString("sms.template.droplineid");
        // 电量模板
        String BATTERY_ID = rb.getString("sms.template.batteryid");
        // 卡纸模板
        String CARD_ID = rb.getString("sms.template.cardid");
        // 少纸模板
        String LESS_ID = rb.getString("sms.template.lessid");
        // 空纸模板
        String EMPTY_ID = rb.getString("sms.template.emptyid");
        // 断纸模板
        String TRACK_ID = rb.getString("sms.template.trackid");
        // 注册验证码
        String REGISTER_ID = rb.getString("sms.template.registerid");
        // 退款验证码
        String REFUND_ID = rb.getString("sms.template.refundid");
        // 异常通知
        String ABNORMAL_ID = rb.getString("sms.template.abnormalid");
        // 普通短信模板
        String COMMON_ID = rb.getString("sms.template.commonid");
        //合同即将过期提醒短信模板
        String FAN_CONTRACT =rb.getString("sms.template.fancontract");
    }

    public static HashMap<Byte, String> SMS_TEMPLATE_MAP() {
        HashMap<Byte, String> MAP = new HashMap<Byte, String>();
        MAP.put(SMS_TEMPLATE_INDEX.DROPLINE, SMS_TEMPLATE.DROPLINE_ID);
        MAP.put(SMS_TEMPLATE_INDEX.BATTERY, SMS_TEMPLATE.BATTERY_ID);
        MAP.put(SMS_TEMPLATE_INDEX.CARD, SMS_TEMPLATE.CARD_ID);
        MAP.put(SMS_TEMPLATE_INDEX.LESS, SMS_TEMPLATE.LESS_ID);
        MAP.put(SMS_TEMPLATE_INDEX.EMPTY, SMS_TEMPLATE.EMPTY_ID);
        MAP.put(SMS_TEMPLATE_INDEX.TRACK, SMS_TEMPLATE.TRACK_ID);
        return MAP;
    }

    /**
     *  	获取密码的加密字符串
     * xiesanchuan
     * @param pwd
     * @param isEncrypt
     * @return
     * 2019年9月19日
     */
    public static String getPwd(String pwd, Boolean isEncrypt, Integer nums) {
        pwd = pwd + PWD_SUFFIX;
        if (null == isEncrypt || !isEncrypt) {
            return pwd;
        }
        if (null == nums || nums == 1) {
            return MD5.parseMD5(pwd);
        }
        Assert.state(nums == 2, "次数有问题");
        return MD5.parseMD5(MD5.parseMD5(pwd));
    }


}
