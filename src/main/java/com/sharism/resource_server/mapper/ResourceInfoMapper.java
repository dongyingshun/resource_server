package com.sharism.resource_server.mapper;

import com.sharism.resource_server.model.ResourceInfo;
import com.sharism.resource_server.model.ResourceInfoExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ResourceInfoMapper {
    long countByExample(ResourceInfoExample example);

    int deleteByExample(ResourceInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(ResourceInfo record);

    int insertSelective(ResourceInfo record);

    List<ResourceInfo> selectByExample(ResourceInfoExample example);

    ResourceInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ResourceInfo record, @Param("example") ResourceInfoExample example);

    int updateByExample(@Param("record") ResourceInfo record, @Param("example") ResourceInfoExample example);

    int updateByPrimaryKeySelective(ResourceInfo record);

    int updateByPrimaryKey(ResourceInfo record);


    /**
     * 多条件查询文件列表
     * @param map
     * @return
     */
    List<ResourceInfo> selectResourcePage(Map map);

    /**
     * 批量设置删除状态
     * @param userId
     * @param ids
     * @return
     */
    int batchSetResourceDeleteStatus(@Param(value="userId")String userId,@Param(value="list") List<String>  ids);

    /**
     * 批量移动文件夹
     * @param parentId
     * @param ids
     * @return
     */
    int batchMoveFile(@Param(value="parentId")String parentId,@Param(value="list") List<String>  ids);

}