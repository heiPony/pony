package com.pony.test.wx;

public class WxUtil {

    public interface URL_PARAM {

        // 获取用户的信息
        String GET_UNION_USER_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token={accessToken}&openid={openId}&lang=zh_CN";
        // 获取accesstoken
        String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid={appId}&secret={appSecret}";
        // 获取ticket
        String GET_JS_API_TICKET = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token={accesstoken}&type=jsapi";
        //
        String SP_CODE_SESSION = "https://api.weixin.qq.com/sns/jscode2session?appid={APPID}&secret={SECRET}&js_code={JSCODE}&grant_type=authorization_code";
        // 获取小程序二维码
        String SP_GET_QR_CODE = "https://api.weixin.qq.com/wxa/getwxacodeunlimit?access_token={accessToken}";
    }

}
