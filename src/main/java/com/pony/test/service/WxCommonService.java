package com.pony.test.service;

import com.alibaba.fastjson.JSONObject;
import com.pony.test.constant.Constant;
import com.pony.test.utils.Assert;
import com.pony.test.utils.Result;
import com.pony.test.utils.ResultUtils;
import com.pony.test.wx.WxHttp;
import com.pony.test.wx.WxUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class WxCommonService {

    private Logger logger = LoggerFactory.getLogger(WxCommonService.class);



    public Result getSessionKeyByFactory(String code) {
        logger.info("测试是否打包");
        Assert.hasText(code, "CODE不能为空");
        net.sf.json.JSONObject res = WxHttp.href(WxUtil.URL_PARAM.SP_CODE_SESSION, "GET", Constant.WX_SP.SERVICE_APPID, Constant.WX_SP.SERVICE_APPSECRET, code);
        if(!res.containsKey("openid") && !res.containsKey("session_key")){
            logger.warn("获取用户的SEESION_KEY失败,CODE:{},\t RESULT:{}", code, res.toString());
            return ResultUtils.returnError("获取用户的信息失败");
        }
        logger.info("获取用户的SEESION_KEY, RESULT:{}", res.toString());
        String openId = res.getString("openid");
        String unionId = res.containsKey("unionid")?  res.getString("unionid") : "";
//        String sessionKey = res.getString("session_key");
//        toRedis(CacheKey.WX_KEY.SP_SERVICE_SESSION_KEY+openId, sessionKey);
        JSONObject result = new JSONObject();
        result.put("openId", openId);
        result.put("unionId", unionId);
        return ResultUtils.returnSuccess(result);
    }

}
