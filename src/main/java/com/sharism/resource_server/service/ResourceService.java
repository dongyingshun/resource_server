package com.sharism.resource_server.service;

import com.sharism.resource_server.model.ResourceInfo;

import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.resource_server.service
 * @Description:
 * @date 2018/3/31-23:29
 * @Version: 1.0
 */
public interface ResourceService {
    /**
     * 保存一个文件
     * @param resourceInfo
     * @return
     * @throws Exception
     */
    int saveResource(ResourceInfo resourceInfo)throws Exception;

    /**
     * 获取资源列表
     * @param map
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    List<ResourceInfo> selectResource(Map map, int pageNum, int pageSize) throws Exception;

    /**
     * 批量删除资源
     * @param userId
     * @param ids
     * @return
     * @throws Exception
     */
    int batchSetResourceDeleteStatus(String userId, List<String> ids)throws Exception;

    /**
     * 修改资源信息
     * @param resourceInfo
     * @return
     * @throws Exception
     */
    int updateByPrimaryKeySelective(ResourceInfo resourceInfo)throws Exception;

    /**
     * 根据id查询文件
     * @param id
     * @return
     * @throws Exception
     */
    ResourceInfo  selectByPrimaryKey(String id)throws Exception;
}
