package com.pony.test.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang.StringUtils;

public class MD5 {
    public MD5() {
    }

    public static final String parseMD5(String s) {
        if (s == null) {
            return null;
        } else {
            char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

            try {
                byte[] strTemp = s.getBytes();
                MessageDigest mdTemp = MessageDigest.getInstance("MD5");
                mdTemp.update(strTemp);
                byte[] md = mdTemp.digest();
                int j = md.length;
                char[] str = new char[j * 2];
                int k = 0;

                for(int i = 0; i < j; ++i) {
                    byte byte0 = md[i];
                    str[k++] = hexDigits[byte0 >>> 4 & 15];
                    str[k++] = hexDigits[byte0 & 15];
                }

                return new String(str);
            } catch (Exception var10) {
                return null;
            }
        }
    }

    public static final String parseMD516(String s) {
        return parseMD5(s).substring(8, 24);
    }

    public static String sha1(String data) {
        MessageDigest md = null;

        try {
            md = MessageDigest.getInstance("SHA1");
        } catch (Exception var6) {
            var6.printStackTrace();
            return "";
        }

        md.update(data.getBytes());
        StringBuffer buf = new StringBuffer();
        byte[] bits = md.digest();

        for(int i = 0; i < bits.length; ++i) {
            int a = bits[i];
            if (a < 0) {
                a += 256;
            }

            if (a < 16) {
                buf.append("0");
            }

            buf.append(Integer.toHexString(a));
        }

        return buf.toString();
    }

    public static String md5(String string) {
        if (StringUtils.isEmpty(string)) {
            return "";
        } else {
            MessageDigest md5 = null;

            try {
                md5 = MessageDigest.getInstance("MD5");
                byte[] bytes = md5.digest(string.getBytes());
                String result = "";
                byte[] var7 = bytes;
                int var6 = bytes.length;

                for(int var5 = 0; var5 < var6; ++var5) {
                    byte b = var7[var5];
                    String temp = Integer.toHexString(b & 255);
                    if (temp.length() == 1) {
                        temp = "0" + temp;
                    }

                    result = result + temp;
                }

                return result;
            } catch (NoSuchAlgorithmException var9) {
                var9.printStackTrace();
                return "";
            }
        }
    }
}
