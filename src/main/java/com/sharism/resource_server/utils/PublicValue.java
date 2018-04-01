package com.sharism.resource_server.utils;

/**
 * @author DYS
 * @Package com.sharism.file_server.utils
 * @Description: 设置数值
 * @date 2018/3/15-23:17
 * @Version: 1.0
 */
public class PublicValue {
    //文件存放位置  1为在回收站
    public static final int DRAFT=1;

    //文件存放位置  0为移除回收站
    public static final int REMOVE_DRAFT=0;
    /**
     * 以下信息是为了计算存储路径
     */
    //http
    public static final String HTTP="http://";
    //Tracker ip 地址
    public static final String TRACKER_IP="118.25.48.91";
    //Tracker Nginx 监听端口号
    public static final String TRACKER_NGINX_PORT="8000";
    //服务器地址长度  解析存储路径需要用到
    public static final int SERVER_ADDRESS_LENGTH=HTTP.length()+TRACKER_IP.length()+TRACKER_NGINX_PORT.length();
}
