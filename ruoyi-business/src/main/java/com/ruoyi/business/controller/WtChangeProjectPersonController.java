package com.ruoyi.business.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.business.domain.WtChangeProjectPerson;
import com.ruoyi.business.service.IWtChangeProjectPersonService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 项目人员变更信息Controller
 * 
 * @author ruoyi
 * @date 2021-10-04
 */
@RestController
@RequestMapping("/business/person")
public class WtChangeProjectPersonController extends BaseController
{
    @Autowired
    private IWtChangeProjectPersonService wtChangeProjectPersonService;

    /**
     * 查询项目人员变更信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(WtChangeProjectPerson wtChangeProjectPerson)
    {
        startPage();
        List<WtChangeProjectPerson> list = wtChangeProjectPersonService.selectWtChangeProjectPersonList(wtChangeProjectPerson);
        return getDataTable(list);
    }

    /**
     * 导出项目人员变更信息列表
     */
    @Log(title = "项目人员变更信息", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(WtChangeProjectPerson wtChangeProjectPerson)
    {
        List<WtChangeProjectPerson> list = wtChangeProjectPersonService.selectWtChangeProjectPersonList(wtChangeProjectPerson);
        ExcelUtil<WtChangeProjectPerson> util = new ExcelUtil<WtChangeProjectPerson>(WtChangeProjectPerson.class);
        return util.exportExcel(list, "项目人员变更信息数据");
    }

    /**
     * 获取项目人员变更信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(wtChangeProjectPersonService.selectWtChangeProjectPersonById(id));
    }

    /**
     * 新增项目人员变更信息
     */
    @Log(title = "项目人员变更信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WtChangeProjectPerson wtChangeProjectPerson)
    {
        return toAjax(wtChangeProjectPersonService.insertWtChangeProjectPerson(wtChangeProjectPerson));
    }

    /**
     * 修改项目人员变更信息
     */
    @Log(title = "项目人员变更信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WtChangeProjectPerson wtChangeProjectPerson)
    {
        return toAjax(wtChangeProjectPersonService.updateWtChangeProjectPerson(wtChangeProjectPerson));
    }

    /**
     * 删除项目人员变更信息
     */
    @Log(title = "项目人员变更信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wtChangeProjectPersonService.deleteWtChangeProjectPersonByIds(ids));
    }
}
