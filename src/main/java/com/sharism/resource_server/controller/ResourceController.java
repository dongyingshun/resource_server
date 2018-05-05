package com.sharism.resource_server.controller;

import com.github.pagehelper.PageInfo;
import com.sharism.resource_server.model.ResourceInfo;
import com.sharism.resource_server.service.ResourceService;
import com.sharism.resource_server.utils.*;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author DYS
 * @Package com.sharism.resource_server.controller
 * @Description:
 * @date 2018/3/31-23:30
 * @Version: 1.0
 */
@CrossOrigin //支持跨域请求
@Controller
@RequestMapping(value = "resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    /**
     * 保存文件信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/saveResource", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result saveResource(HttpServletRequest request, HttpServletResponse response){

        //TODO :获取session值

        String userId="690770002d9f4b78a10903efc3320391";
        if(userId == null)
            return  Result.newInstance().setCode(0).setMessage("请登录");

        String resourceMap= request.getParameter("resourceInfoMap");
        if(resourceMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空").setValue(null);
        JSONObject jb = JSONObject.fromObject(resourceMap);
        Map blogMap = (Map)jb;
        ResourceInfo resourceInfo=new ResourceInfo();
        try {
            resourceInfo  = (ResourceInfo) mapToBean.mapToBean(blogMap, ResourceInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误").setValue(null);
        }
        //id
        String id= Uuid.getUUID();
        resourceInfo.setId(id);
        //作者id
        resourceInfo.setUserId(userId);
        //资源存储路径storage
        resourceInfo.setStoragePath(resourceInfo.getFilePath().substring(PublicValue.SERVER_ADDRESS_LENGTH+2));
        //发表时间
        String time = DateTime.getStringDate();
        resourceInfo.setCreateDate(time);
        resourceInfo.setUpdateTime(time);
        //删除状态  0
        resourceInfo.setDel(PublicValue.REMOVE_DRAFT);
        //初始化下载次数
        resourceInfo.setDownloadAmount(0);
        //初始化已获得金额
        resourceInfo.setGetMoney(0.0);
        //初始化已获得积分
        resourceInfo.setGetScore(0.0);

        //将file_type存入folder
        JSONObject json = new JSONObject();
        json.put("isFolder",resourceInfo.getFolder());
        json.put("name",resourceInfo.getFileName());
        resourceInfo.setFileType(json.toString());

        try {
            resourceService.saveResource(resourceInfo);
            return  Result.newInstance().setCode(1).setMessage("操作成功").setValue(id);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-3).setMessage("操作失败").setValue(null);
        }
    }

    /**
     * 多条件查询文件列表
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/ResourceList", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result ResourceList(HttpServletRequest request, HttpServletResponse response){
        //TODO 获取session
        String userId="690770002d9f4b78a10903efc3320391";
        if(userId == null)
            return  Result.newInstance().setCode(0).setMessage("请登录");

        String resourcePageMap= request.getParameter("resourcePageMap");
        if(resourcePageMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空").setValue(null);
        JSONObject Page = JSONObject.fromObject(resourcePageMap);
        int pageNum  = Page.getInt("pageNum");
        int pageSize = Page.getInt("pageSize");

        if(pageSize<0)
            return  Result.newInstance().setCode(-2).setMessage("数据条数不合法");
        if(pageNum<0)
            return  Result.newInstance().setCode(-3).setMessage("页数不合法");

        Map map=(Map)Page;
        map.put("userId",userId);
        //Page.clear();
        List<ResourceInfo> resourceInfos = null;
        try {
            resourceInfos = resourceService.selectResource(map, pageNum, pageSize);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-4).setMessage("查询失败");
        }

        PageInfo<ResourceInfo> pageInfo = new PageInfo<>(resourceInfos);

        return  Result.newInstance().setCode(1).setMessage("成功").setValue(pageInfo);

    }

    /**
     * 批量删除文件
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/deleteResource", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result deleteResource(HttpServletRequest request, HttpServletResponse response){
        //TODO 获取session
        String userId="690770002d9f4b78a10903efc3320391";
        if(userId == null)
            return  Result.newInstance().setCode(0).setMessage("请登录");


        String resourceArrayList= request.getParameter("resourceArrayList");
        if(resourceArrayList==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空").setValue(null);

        String[] split = resourceArrayList.split(",");

        if(split.length==0)
            return  Result.newInstance().setCode(-2).setMessage("数据为空");



        List<String> list =new ArrayList<>();
        for(String tmp:split) {
            list.add(tmp);
        }
        int i = 0;
        try {
            i = resourceService.batchSetResourceDeleteStatus(userId,list);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-3).setMessage("删除失败");
        }
        return  Result.newInstance().setCode(1).setMessage("成功").setValue(i);

    }

    /**
     * 修改文件信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value ="/updateResourceInfo",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result updateBlogInfo(javax.servlet.http.HttpServletRequest request, HttpServletResponse response) {
        //TODO :获取session值
        String userId = "690770002d9f4b78a10903efc3320391";
        if(userId == null)
            return  Result.newInstance().setCode(0).setMessage("请登录");

        String updateResourceInfoMap= request.getParameter("updateResourceInfoMap");
        if(updateResourceInfoMap==null)
            return  Result.newInstance().setCode(-1).setMessage("数据为空");
        JSONObject jb = JSONObject.fromObject(updateResourceInfoMap);
        Map map = (Map)jb;
        ResourceInfo resourceInfo=null;
        try {
            resourceInfo =(ResourceInfo)mapToBean.mapToBean(map,ResourceInfo.class);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-2).setMessage("数据转换有误");
        }
        if(resourceInfo.getId()==null)
            return  Result.newInstance().setCode(-3).setMessage("文件id不能为空");
        resourceInfo.setUpdateTime(DateTime.getStringDate());
        int i=0;
        try {
            i= resourceService.updateByPrimaryKeySelective(resourceInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return  Result.newInstance().setCode(-4).setMessage("更新失败");
        }
        if(i>0)
            return  Result.newInstance().setCode(1).setMessage("更新成功");
        else
            return  Result.newInstance().setCode(-5).setMessage("没有要更新的");

    }

    /**
     * 根据id查询文件信息
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/selectResourceById", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Result selectResourceById(HttpServletRequest request, HttpServletResponse response) {
        //TODO 获取session
        String userId = "690770002d9f4b78a10903efc3320391";

        if(userId == null)
            return  Result.newInstance().setCode(0).setMessage("请登录");

        String resourceId = request.getParameter("resourceId");
        if (resourceId == null)
            return Result.newInstance().setCode(-1).setMessage("id为空").setValue(null);
        ResourceInfo resourceInfo=null;
        try {
             resourceInfo = resourceService.selectByPrimaryKey(resourceId);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.newInstance().setCode(-2).setMessage("查询失败").setValue(null);
        }
        return Result.newInstance().setCode(1).setMessage("成功").setValue(resourceInfo);

    }




}
