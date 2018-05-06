package com.sharism.resource_server.service.impl;

import com.github.pagehelper.PageHelper;
import com.sharism.resource_server.mapper.ResourceInfoMapper;
import com.sharism.resource_server.model.ResourceInfo;
import com.sharism.resource_server.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.resource_server.service.impl
 * @Description:
 * @date 2018/3/31-23:42
 * @Version: 1.0
 */
@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService{

    @Autowired
    private ResourceInfoMapper resourceInfoMapper;

    /**
     * 保存资源
     *
     * @param resourceInfo
     * @return
     * @throws Exception
     */
    @Override
    public int saveResource(ResourceInfo resourceInfo) throws Exception {
        return resourceInfoMapper.insert(resourceInfo);
    }

    /**
     * 获取资源列表
     * @param map
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    @Override
    public List<ResourceInfo> selectResource(Map map, int pageNum, int pageSize) throws Exception {
        //不进行count查询。第三个參数设为false (pageNum, pageSize,false)
        PageHelper.startPage(pageNum, pageSize);
        return resourceInfoMapper.selectResourcePage(map);
    }

    /**
     * 批量删除资源
     * @param userId
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public int batchSetResourceDeleteStatus(String userId, List<String> ids) throws Exception {
        return resourceInfoMapper.batchSetResourceDeleteStatus(userId,ids);
    }

    /**
     * 修改资源信息
     * @param resourceInfo
     * @return
     * @throws Exception
     */
    @Override
    public int updateByPrimaryKeySelective(ResourceInfo resourceInfo) throws Exception {
        return resourceInfoMapper.updateByPrimaryKeySelective(resourceInfo);
    }

    /**
     * 根据id查询文件
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public ResourceInfo selectByPrimaryKey(String id) throws Exception {
        return resourceInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 批量移动文件
     * @param parentId
     * @param ids
     * @return
     * @throws Exception
     */
    @Override
    public int batchMoveFile(String parentId, List<String> ids) throws Exception {
        return resourceInfoMapper.batchMoveFile(parentId,ids);
    }
}
